<template>
  <h1>Nuestras tarifas</h1>
  <span class="linea"></span>
  <div id="body">
    <main>
      <div class="contenedor-tarifas">
        <div class="tabla">
          <h2>Mensual</h2>
          <img src="../assets/img/dumbbell.png" alt="">
          <h3>30 <sup>€</sup> </h3>
          <p>Si acabas de empezar tu cambio y deseas probarnos, esta tarifa es la tuya.</p>
          <p v-if="sesionIniciada" class="descuentoAviso">Tienes <strong>{{ edadCliente }}</strong> años, por lo que se te
            aplicaría un
            descuento del {{ descuento * 100 }}%</p>

          <button v-if="sesionIniciada" class="compra"
            v-on:click="mostrarPaywall(tarifas[0].precio, tarifas[0].nombre)">Lo
            quiero!</button>
          <p class="obligatorioRegistrarse" v-else>Debes registrarte e iniciar sesión para adquirir una tarifa</p>
        </div>
        <div class="tabla">
          <h2>Trimestral</h2>
          <img src="../assets/img/Tarifados.png" alt="">
          <h3>55 <sup>€</sup> </h3>
          <p>Si ya eres un iniciado y/o has probado ya nuestro gimnasio, esta tarifa es la tuya.</p>
          <p v-if="sesionIniciada" class="descuentoAviso">Tienes <strong>{{ edadCliente }}</strong> años, por lo que se te
            aplicaría un
            descuento del {{ descuento * 100 }}%</p>
          <button v-if="sesionIniciada" class="compra"
            v-on:click="mostrarPaywall(tarifas[1].precio, tarifas[1].nombre)">Lo
            quiero!</button>
          <p class="obligatorioRegistrarse" v-else>Debes registrarte e iniciar sesión para adquirir una tarifa</p>
        </div>
        <div class="tabla">
          <h2>Anual</h2>
          <img src="../assets/img/weightlifter.png" alt="">
          <h3>80 <sup>€</sup> </h3>
          <p>Muestra tu lealtad ante nosotros, te otorgamos una camiseta del club, incluída en el precio final.</p>
          <p v-if="sesionIniciada" class="descuentoAviso">Tienes <strong>{{ edadCliente }}</strong> años, por lo que se te
            aplicaría un
            descuento del {{ descuento * 100 }}%</p>
          <button v-if="sesionIniciada" class="compra"
            v-on:click="mostrarPaywall(tarifas[2].precio, tarifas[2].nombre)">Lo
            quiero!</button>
          <p class="obligatorioRegistrarse" v-else>Debes registrarte e iniciar sesión para adquirir una tarifa</p>
        </div>
      </div>
    </main>
  </div>
  <footer>
    <div class="contenedor-footerall">
      <div class="contenedor-body">
        <div class="columna1">
          <h1>Más información de la compañía</h1>
          <p>
            DreamGym Salamanca es un proyecto dedicado a las personas residentes
            en Salamanca o alrededores las cuales quieran dar un cambio radical
            en su vida, para aquellos que quieran sentirse realmente bien
            consigo mismos y a la par quieran mantener un estilo de vida
            saludable.
          </p>
        </div>
        <div class="columna2">
          <h1>Síguenos en redes para no perderte nada</h1>
          <div class="fila1">
            <img src="../assets/img/facebook.png" alt="" />
            <label> <a href=""> Síguenos en Facebook</a></label>
          </div>
          <div class="fila1">
            <img src="../assets/img/twitter.png" alt="" />
            <label> <a href=""> Síguenos en Twitter</a></label>
          </div>
          <div class="fila1">
            <img src="../assets/img/instagram.png" alt="" />
            <label> <a href=""> Síguenos en Instagram</a></label>
          </div>
          <div class="fila1">
            <img src="../assets/img/google-plus.png" alt="" />
            <label> <a href=""> Síguenos en Google Plus</a></label>
          </div>
          <div class="fila1">
            <img src="../assets/img/pinterest.png" alt="" />
            <label> <a href=""> Síguenos en Pinterest</a></label>
          </div>
        </div>
        <div class="columna3">
          <h1>Contacto</h1>
          <div class="fila2">
            <img src="../assets/img/house.png" />
            <label>Salamanca, Calle Los Agradecidos 9 37002, España </label>
          </div>
          <div class="fila2">
            <img src="../assets/img/smartphone.png" />
            <label>923608327</label>
          </div>
          <div class="fila2">
            <img src="../assets/img/contact.png" />
            <label> <a href="mailto:dreamgymslmnc@dreamgymbussiness.com">Nuestro correo</a> </label>
          </div>


        </div>

      </div>
    </div>
  </footer>
</template>

<script>
import jwt_decode from 'jwt-decode';
import { getToken } from '../auth';
import {removeToken} from '../auth';
import { differenceInYears } from 'date-fns'
import { parse, format } from 'date-fns';

export default {
  data() {
    return {
      edadCliente: '',
      fechaNacimiento: '',
      descuento: '',
      sesionIniciada: false,
      tarifas: [
        { id: 1, nombre: "Mensual", precio: 30 },
        { id: 2, nombre: "Trimestral", precio: 55 },
        { id: 3, nombre: "Anual", precio: 80 },
      ],
    };
  },
  created() {

    this.sesionIniciada = !!getToken();
    if (this.sesionIniciada) {
      var token = localStorage.getItem('token')
      const decoded = jwt_decode(localStorage.getItem('token'));

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
      } else if(this.edadCliente > 80 && this.edadCliente <= 100){
        this.descuento = 0.6
      }


      const precioOriginal = parseFloat(this.precio)
      this.precioFinal = precioOriginal - (precioOriginal * this.descuento);
    }




    this.sesionIniciada = !!getToken();
    if (this.sesionIniciada) {
      var token = localStorage.getItem('token')
      const decoded = jwt_decode(token);
      this.username = decoded.sub;
    } else {
      this.sesionIniciada = false;
    }


  },
  methods: {
    mostrarPaywall(precio, nombre) {
      this.$router.push({ name: "paywall", params: { precio: precio, nombre: nombre } });
    },
  },
  mounted() {
    window.scrollTo(0, 0);
  },
};
</script>
<style scoped>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  text-align: center;

}

.linea {
  background: #550b51;
  height: 5px;
  width: 100%;
  display: block;
  margin-bottom: 2rem;
}

#body {
  background: white;
  font-family: 'open sans';
  font-size: 15px;
}

/* Tablas */
.obligatorioRegistrarse {
  color: red;
}

.contenedor-tarifas {
  width: 90%;
  max-width: 900px;
  margin: auto;
  height: 68vh;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-wrap: wrap;
}

@media screen and (min-width: 1029px) {
  .contenedor-tarifas {
    margin-bottom: 250px;
  }
}

@media screen and (min-width: 1600px) {
  .contenedor-tarifas {
    margin-bottom: 0;
  }
}

.tabla {
  width: 33%;
  height: 600px;
  margin: auto;
  padding: 60px;
  border: 1px solid #3a3e6b;
  border-radius: 4px;
  box-shadow: 0px 0px 4px 0px #3a3e6b;
  text-align: center;
  flex-grow: 1;
  color: #40436b;
  font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}

.tabla>h2 {
  margin-bottom: 35px;
  font-size: 30px;
}

.tabla>h3 {
  font-size: 30px;
  margin-bottom: 20px;
}

.tabla>p {
  display: block;
  margin-bottom: 20px;
}

.tabla img {
  width: 64%;
  margin-bottom: 30px;
}

.tabla:hover {
  background: #2b2e4d;
  color: #f1f1f2;
  transform: scale(1.1);
  transition: 0.8s all;
  cursor: pointer;
}

.descuentoAviso {
  animation: parpadeo 2s infinite;
  color: red;
}

@keyframes parpadeo {
  0% {
    opacity: 1;
  }

  50% {
    opacity: 0;
  }

  100% {
    opacity: 1;
  }
}

/* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! */
/* BOTON LO QUIERO */
.compra {
  width: 150px;
  display: inline-block;
  margin: auto;
  padding: 12px;
  background: #9be94d;
  text-decoration: none;
  text-align: center;
  color: #2b2e4d;
  border-radius: 100px;
  font-size: 12px;
  font-weight: 600;
}

footer {
  width: 100%;
  background: #202020;
  color: white;
  padding: 40px;
  height: 50%;
}

.contenedor-footerall {
  width: 100%;
  max-width: 1200px;
  margin: auto;
}

.contenedor-body {
  display: flex;
  /* para que los divs se pongan uno al lado del otro*/
  justify-content: space-between;
  position: relative;
  height: 450px;
}

.columna1,
.columna2,
.columna3 {
  max-width: 400px;
}

.columna1 h1 {
  font-size: 22px;
  font-family: "Courier New", Courier, monospace;
}

.columna1 p {
  font-size: 14px;
  color: #c7c7c7;
  margin-top: 20px;
}

.columna2 h1 {
  font-size: 22px;
  font-family: "Courier New", Courier, monospace;
}

.fila1 {
  margin-top: 20px;
  display: flex;
}

.fila1 img {
  width: 36px;
  height: 36px;
}

.fila1 label {
  margin-top: 10px;
  margin-left: 20px;
  color: #c7c7c7;
}

.columna3 h1 {
  font-size: 22px;
  font-family: "Courier New", Courier, monospace;
}

.fila2 {
  margin-top: 20px;
  display: flex;
}

.fila2 img {
  width: 36px;
  height: 36px;
}

.fila2 label {
  margin-top: 10px;
  margin-left: 20px;
  max-width: 90px;
}

.contenedor-footer {
  width: 90%;
  top: 850px;
  background: #101010;
  padding: 20px;
  position: fixed;
  bottom: 10px;
  right: 55px;
  justify-content: center;

}

.footer {
  max-width: 1200px;
  margin: auto;
  display: flex;
  justify-content: space-between;
  padding: 20px;
}</style>