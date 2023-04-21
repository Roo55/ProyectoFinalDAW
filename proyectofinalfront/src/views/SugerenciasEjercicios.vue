<template>
  <div class="container">
    <h2>¿Qué ejercicios puedes realizar hoy?</h2>
    <p>Nuestro sistema de propondrá una amplia variedad de ejercicios que puedes realizar en función del entrenamiento que elijas</p>
    <p>Selecciona un grupo muscular:</p>
    <div class="d-flex flex-wrap justify-content-center mb-3">
      <button v-for="(boton, index) in botones"
              :key="index"
              @click="mostrarEjercicios(index)"
              class="btn btn-primary mx-2 my-1">
        {{ boton.nombre }}
      </button>
    </div>
    <div class="ejercicios-contenedor" v-if="mostrarCuadros">
      <table>
        <tbody>
          <tr>
            <td class="cuadro cuadro1">{{ ejerciciosMostrados[0] }}</td>
            <td class="cuadro cuadro2">{{ ejerciciosMostrados[1] }}</td>
            <td class="cuadro cuadro3">{{ ejerciciosMostrados[2] }}</td>
          </tr>
        </tbody>
      </table>
    </div>
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
export default {
  data() {
    return {
      botones: [
    { 
        nombre: "Full Body (Principiantes)", 
        ejercicios: [
            "Sentadillas en multipower", 
            "Press de banca", 
            "Remo con barra", 
            "Peso muerto", 
            "Flexiones de pecho",
            "Abdominales",
            "Press militar",
            "Elevaciones laterales",
            "Curl de bíceps con barra",
            "Fondos de tríceps"
        ] 
    },
    { 
        nombre: "Espalda/Biceps", 
        ejercicios: [
            "Remo con mancuernas", 
            "Curl de bíceps", 
            "Dominadas", 
            "Remo horizontal", 
            "Curl de bíceps con mancuernas",
            "Encogimientos de hombros",
            "Martillo de bíceps",
            "Jalones de tríceps",
            "Press francés",
            "Curl de bíceps alterno"
        ] 
    },
    { 
        nombre: "Pecho/Triceps", 
        ejercicios: [
            "Press de banca", 
            "Extensiones de tríceps", 
            "Fondos en paralelas", 
            "Aperturas con mancuernas", 
            "Flexiones diamante",
            "Press inclinado",
            "Extensiones de tríceps en polea",
            "Fondos en anillas",
            "Flexiones con palmada",
            "Fondos de tríceps en banco"
        ] 
    },
    { 
        nombre: "Pierna", 
        ejercicios: [
            "Sentadillas", 
            "Prensa de piernas", 
            "Zancadas", 
            "Elevaciones de talones", 
            "Extensiones de piernas",
            "Curl de piernas",
            "Peso muerto rumano",
            "Sentadilla búlgara",
            "Step-up con mancuernas",
            "Zancadas laterales"
        ] 
    },
],

      mostrarCuadros: false,
      ejerciciosMostrados: [],
    };
  },
  methods: {
    mostrarEjercicios(index) {
      let ejerciciosAleatorios = this.botones[index].ejercicios.sort(() => Math.random() - 0.5).slice(0, 3);
      this.ejerciciosMostrados = ejerciciosAleatorios;
      this.mostrarCuadros = false;
      setTimeout(() => {
        this.mostrarCuadros = true;
      }, 100);
    },
  },
};
</script>

<style scoped>
*{
  text-align: center;
}
.container {
  background-color: white;
  padding: 2rem;
}

.ejercicios-contenedor {
  margin-top: 2rem;
}

.cuadro {
  background-color: #F4F4F4;
  text-align: center;
  padding: 2rem;
  font-size: 1.2rem;
}

@media (min-width: 576px) {
  .botones {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
  }

  .btn {
    margin: 0.5rem;
  }

  .ejercicios-contenedor {
    margin-top: 3rem;
  }

  .cuadro {
    font-size: 1.5rem;
  }
}
.container{
  background-color: white;
}
.botones button{
    margin-right: 1rem;
}
.botones {
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 1rem;
  }

  .ejercicios-contenedor {
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 1rem;
  }

  table {
  width: 100%;
  border-collapse: collapse;
}

td {
  width: 33.33%;
  padding: 1rem;
  text-align: center;
}

  table {
    width: 70%;
    border-collapse: collapse;
  }

  td {
    padding: 1rem;
    text-align: center;
  }

  .cuadro {
    width: 33%;
    height: 250px;
    margin-top: 1rem;
    background-color: #ccc;
    border: 2px solid black;
    opacity: 0;
    animation-duration: 0.5s;
    animation-fill-mode: forwards;
  }
  .cuadro1 {
    animation-delay: 0.5s;
  }

  .cuadro2 {
    animation-delay: 1s;
  }

  .cuadro3 {
    animation-delay: 1.5s;
  }

  @keyframes mostrar-cuadro {
    from {
      opacity: 0;
      transform: translateY(100px);
    }
    to {
      opacity: 1;
      transform: translateY(0);
    }
  }

  .cuadro {
    animation-name: mostrar-cuadro;
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
}
</style>
