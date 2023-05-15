<template>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.2/css/all.css">

  <div class="wrapper">
    <div class="payment">
      <div id="divFoto">
        <img
          src="../assets/img/kisspng-fitness-centre-logo-wall-decal-physical-fitness-cropped-jays-home-gym-png-logo-2-png-jayampapos-5c4f52c6431402.2105774115487024062748.png"
          alt="">
      </div>


      <h2>Completa el pago</h2>
      <p>Has seleccionado la suscripción <strong> {{ nombre }}</strong> </p>
      <p id="fadeEfecto">Aplicando tu descuento del {{ descuento * 100 }}%, el precio final a pagar son <strong class="rainbow">{{ precioFinal }}€</strong>
      </p>
      <br>
      <form @submit.prevent="enviarPago()" class="form">
        <div class="card space icon-relative">
          <label class="label">Titular de la tarjeta:</label>
          <input type="text" class="input" placeholder="Nombre titular" v-model="nombreTitular"
            @input="validarTitularTarjeta">
          <div v-if="nombreTitularError" class="error-message">{{ nombreTitularErrorMensaje }}</div>
          <i class="fas fa-user"></i>
        </div>
        <div class="card space icon-relative">
          <label class="label">Número de tarjeta:</label>
          <input type="text" class="input" data-mask="0000 0000 0000 0000" placeholder="Número de tarjeta"
            v-model="numeroTarjeta" @input="validarNumeroTarjeta">
          <div v-if="numeroTarjetaError" class="error-message">{{ numeroTarjetaErrorMensaje }}</div>
          <i class="far fa-credit-card"></i>
        </div>
        <div class="card-grp space">
          <div class="card-item icon-relative">
            <label class="label">Expiración:</label>
            <input type="text" name="expiry-data" class="input" placeholder="00 / 00" v-model="expiracion"
              @input="validarExpiracion">
            <div v-if="expiracionError" class="error-message">{{ expiracionErrorMensaje }}</div>
            <i class="far fa-calendar-alt"></i>
          </div>
          <div class="card-item icon-relative">
            <label class="label">CVC:</label>
            <input type="text" class="input" data-mask="000" placeholder="000" v-model="cvc" @input="validarCVC">
            <div v-if="cvcError" class="error-message">{{ cvcErrorMensaje }}</div>
            <i class="fas fa-lock"></i>
          </div>
        </div>
        <p class="cumplimentarValores" v-if="inputsVacios">Rellene todos los campos para continuar</p>
        <p v-else></p>
        <button class="btn">
          Pagar
        </button>

      </form>
    </div>
  </div>
</template>
<script>
import jwt_decode from 'jwt-decode';
import axios from 'axios';
import { differenceInYears } from 'date-fns'
import { parse, format } from 'date-fns';

export default {
  data() {
    return {
      precio: this.$route.params.precio,
      precioFinal: '',
      edadCliente: '',
      descuento: 0,
      nombre: this.$route.params.nombre,
      id: '',
      fechaNacimiento: '',
      tipo_suscripcion: '',
      duracion: '',
      nombreTitular: '',
      nombreTitularError: false,
      nombreTitularErrorMensaje: '',
      numeroTarjeta: '',
      numeroTarjetaError: false,
      numeroTarjetaErrorMensaje: '',
      expiracion: '',
      expiracionError: false,
      expiracionErrorMensaje: '',
      cvc: '',
      cvcError: false,
      cvcErrorMensaje: '',
      inputsVacios:false,
      mensajeAvisoEnvio:''
    };
  },
  created() {
    var token = localStorage.getItem('token')
    const decoded = jwt_decode(token);
    this.id = String(decoded.id);
    this.fechaNacimiento = String(decoded.fechaNacimiento);

    const fechaNacimientoISO = parse(decoded.fechaNacimiento, 'dd/MM/yyyy', new Date());
    const fechaNacimientoCliente = format(fechaNacimientoISO, "yyyy-MM-dd'T'HH:mm:ss.SSSxxx");
    const fechaNacimientoClienteObj = new Date(fechaNacimientoCliente);


    this.edadCliente = differenceInYears(new Date(), fechaNacimientoClienteObj);

    if (this.edadCliente >= 16 && this.edadCliente <= 30) {
      this.descuento = 0.15
    } else if (this.edadCliente > 30 && this.edadCliente <= 60) {
      this.descuento = 0.05
    } else if (this.edadCliente > 60 && this.edadCliente <= 80) {
      this.descuento = 0.4
    }


    const precioOriginal = parseFloat(this.precio)
    this.precioFinal = precioOriginal - (precioOriginal * this.descuento);



    if (this.$route.params.precio == '30') {
      this.duracion = "1 mes";
      this.tipo_suscripcion = "Mensual";
    } else if (this.$route.params.precio == '55') {
      this.duracion = "3 meses";
      this.tipo_suscripcion = "Trimestral";
    } else if (this.$route.params.precio == '80') {
      this.duracion = "12 meses";
      this.tipo_suscripcion = "Anual";
    }




  },
  methods: {
    enviarPago() {
      if (this.nombreTitular == "" || this.numeroTarjeta == "" || this.expiracion == "" || this.cvc == "") {
        this.inputsVacios = true;
      }else{
          axios.post('http://localhost:8081/gym/api/pay/insertarpago', {
        id_cliente: this.id,
        tipo_suscripcion: this.tipo_suscripcion,
        precio: this.precio,
        duracion: this.duracion
      }, {
        headers: {
          'Authorization': 'Bearer ' + localStorage.getItem('token')
        }
      }).then((response) => {
        this.$router.push('/');
      })
      }

    
    },

    validarTitularTarjeta() {
      if (!this.nombreTitular.match(/^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+([ ][a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*[ ][a-zA-ZáéíóúÁÉÍÓÚñÑ]+$/)) {
        this.nombreTitularError = true;
        this.nombreTitularErrorMensaje = 'Por favor, ingrese un nombre y el primer apellido';
      } else {
        this.nombreTitularError = false;
        this.nombreTitularErrorMensaje = '';
      }

    },
    validarNumeroTarjeta() {
      if (!this.numeroTarjeta.match(/^([3456]\d{3}\s?\d{4}\s?\d{4}\s?\d{4}|[3456]\d{15})$/)) {
        this.numeroTarjetaError = true;
        this.numeroTarjetaErrorMensaje = 'Por favor, ingrese un número de tarjeta de crédito válido';
      } else {
        this.numeroTarjetaError = false;
        this.numeroTarjetaErrorMensaje = '';
      }

    },
    validarExpiracion() {
      if (!this.expiracion.match(/^(0[1-9]|1[0-2])\/(23|(2[4-9]|[3-9][0-9]))$/)) {
        this.expiracionError = true;
        this.expiracionErrorMensaje = 'Por favor, ingrese una fecha de expiración válida';
      } else {
        this.expiracionError = false;
        this.expiracionErrorMensaje = '';
      }

    },
    validarCVC() {
      if (!this.cvc.match(/^\d{3,4}$/)) {
        this.cvcError = true;
        this.cvcErrorMensaje = 'Por favor, ingrese un CVC válido';
      } else {
        this.cvcError = false;
        this.cvcErrorMensaje = '';
      }

    },
  },

};
</script>
<style scoped>
@import url('https://fonts.googleapis.com/css?family=Baloo+Bhaijaan|Ubuntu');

#divFoto img {
  width: 110px;
  height: 110px;
}

* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Ubuntu', sans-serif;
  text-align: center;
}

body {
  background: #2196F3;
  margin: 0 10px;
}

.payment {
  background: #e2e2e2;
  max-width: 360px;
  margin: 40px auto;
  height: auto;
  padding: 25px;
  border-radius: 5px;
  position: relative;
}

.payment h2 {
  text-align: center;
  letter-spacing: 2px;
  margin-bottom: 40px;
  color: #0d3c61;
}

.form .label {
  display: block;
  color: #555555;
  margin-bottom: 6px;
}

.input {
  padding: 13px 0px 13px 25px;
  width: 100%;
  text-align: center;
  border: 2px solid #dddddd;
  border-radius: 5px;
  letter-spacing: 1px;
  word-spacing: 3px;
  outline: none;
  font-size: 16px;
  color: #555555;
}

.card-grp {
  display: flex;
  justify-content: space-between;
}

.card-item {
  width: 48%;
}

.space {
  margin-bottom: 20px;
}

.icon-relative {
  position: relative;
}

.icon-relative .fas,
.icon-relative .far {
  position: absolute;
  bottom: 12px;
  left: 15px;
  font-size: 20px;
  color: #555555;
}

.btn {
  margin-top: 10px;
  background: #2196F3;
  padding: 12px;
  text-align: center;
  color: #f8f8f8;
  border-radius: 5px;
  cursor: pointer;
}


.payment-logo {
  position: absolute;
  top: -50px;
  left: 50%;
  transform: translateX(-50%);
  width: 100px;
  height: 100px;
  background: #f8f8f8;
  border-radius: 50%;
  box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);
  text-align: center;
  line-height: 85px;
}

.payment-logo:before {
  content: "";
  position: absolute;
  top: 5px;
  left: 5px;
  width: 90px;
  height: 90px;
  background: #2196F3;
  border-radius: 50%;
}

.payment-logo p {
  position: relative;
  color: #f8f8f8;
  font-family: 'Baloo Bhaijaan', cursive;
  font-size: 58px;
}
.rainbow {
  background-image: linear-gradient(to right, violet, indigo, blue, green, yellow, orange, red);
  background-size: 200%;
  background-clip: padding-box;
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  animation: rainbow 3s linear infinite;
}
.cumplimentarValores{
  color: red;
}
@keyframes rainbow {
  0% {
    background-position: left;
  }
  100% {
    background-position: right;
  }
}

@media screen and (max-width: 420px) {
  .card-grp {
    flex-direction: column;
  }

  .card-item {
    width: 100%;
    margin-bottom: 20px;
  }

  .btn {
    margin-top: 20px;
  }

  .error-message {
    color: red;
    margin-top: 5px;
  }
}
</style>