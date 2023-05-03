<template>
  <div class="container">
    <h2>¿Qué ejercicios puedes realizar hoy?</h2>
    <p>Nuestro sistema te propondrá una amplia variedad de ejercicios que puedes realizar en función del entrenamiento que
      elijas</p>
    <p>Selecciona un grupo muscular:</p>
    <div class="d-flex flex-wrap justify-content-center mb-3">
      <button v-for="(boton, index) in botones" :key="index" @click="mostrarEjercicios(index)"
        class="btn btn-primary mx-2 my-1">
        {{ boton.nombre }}
      </button>
    </div>
    <div class="ejercicios-contenedor" v-if="mostrarCuadros">
      <table>
        <tbody>
          <tr>
            <td class="cuadro cuadro1">{{ ejerciciosMostrados[0].nombre }} <iframe width="560" height="315"
                :src="ejerciciosMostrados[0].video" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
            </td>
            <td class="cuadro cuadro2">{{ ejerciciosMostrados[1].nombre }} <iframe width="560" height="315"
                :src="ejerciciosMostrados[1].video" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
            </td>
            <td class="cuadro cuadro3">{{ ejerciciosMostrados[2].nombre }} <iframe width="560" height="315"
                :src="ejerciciosMostrados[2].video" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
            </td>
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
            { nombre: "Sentadillas en multipower", video: "https://www.youtube.com/embed/uv3jGXxK60U", descripcion: "Coloca la barra en tus hombros, apóyala en la parte posterior de tus deltoides y realiza una flexión de cadera y rodilla..." },
            { nombre: "Press de banca", video: "https://www.youtube.com/embed/Kpy3Lt5vPDE", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Remo con barra", video: "https://www.youtube.com/embed/ZJXX2fdjgn4", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Peso muerto", video: "https://www.youtube.com/embed/7KL8SgCP4KQ", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Flexiones de pecho", video: "https://www.youtube.com/embed/izNxOxVrUc4", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Abdominales", video: "https://www.youtube.com/embed/CwhxepX7aR8", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Press militar", video: "https://www.youtube.com/embed/f3E1jQFRONs", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Elevaciones laterales", video: "https://www.youtube.com/embed/F1MUzXUR9Nk", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Curl de biceps con barra", video: "https://www.youtube.com/embed/9LwedVKzjk8", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Fondos de tríceps", video: "https://www.youtube.com/embed/CjGPpeM_Kog", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
          ]
        },
        {
          nombre: "Espalda/Biceps",
          ejercicios: [
            { nombre: "Remo con mancuernas", video: "https://www.youtube.com/embed/EiGN5ohOYOc", descripcion: "Coloca la barra en tus hombros, apóyala en la parte posterior de tus deltoides y realiza una flexión de cadera y rodilla..." },
            { nombre: "Curl de bíceps", video: "https://www.youtube.com/embed/uICWtGLd4-I", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Dominadas", video: "https://www.youtube.com/embed/u6zqhOLK-Jg", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Remo horizontal", video: "https://www.youtube.com/embed/zmDATIwNFt0", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Curl de bíceps con mancuernas", video: "https://www.youtube.com/embed/HU2lghjU29Y", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Encogimientos de hombros", video: "https://www.youtube.com/embed/qlIv6nW5kHU", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Martillo de bíceps", video: "https://www.youtube.com/embed/yjP-_KkLwys", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Jalones de tríceps", video: "https://www.youtube.com/embed/FspY_qJBXZc", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Press francés", video: "https://www.youtube.com/embed/VN_QtPv4Ugo", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Curl de bíceps alterno", video: "https://www.youtube.com/embed/ud78b4SsALs", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
          ]
        },
        {
          nombre: "Pecho/Triceps",
          ejercicios: [
            { nombre: "Press de banca", video: "https://www.youtube.com/embed/Kpy3Lt5vPDE", descripcion: "Coloca la barra en tus hombros, apóyala en la parte posterior de tus deltoides y realiza una flexión de cadera y rodilla..." },
            { nombre: "Extensiones de tríceps", video: "https://www.youtube.com/embed/Ez2Tl0mX6SU", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Fondos en paralelas", video: "https://www.youtube.com/embed/CjGPpeM_Kog", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Aperturas con mancuernas", video: "https://www.youtube.com/embed/xyHdY99F640", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Flexiones diamante", video: "https://www.youtube.com/embed/pi07V0zyWIA", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Press inclinado", video: "https://www.youtube.com/embed/swMjJqFzxCQ", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Extensiones de tríceps en polea", video: "https://www.youtube.com/embed/dRkTreltpnc", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Fondos en anillas", video: "https://www.youtube.com/embed/Ql66iRAjyJ8", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Flexiones con palmada", video: "https://www.youtube.com/embed/icdEDFsd0b0", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Fondos de tríceps en banco", video: "https://www.youtube.com/embed/PYapgguXgT8", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
          ]
        },
        {
          nombre: "Pierna",
          ejercicios: [
            { nombre: "Sentadillas", video: "https://www.youtube.com/embed/eraNxbPIhWw", descripcion: "Coloca la barra en tus hombros, apóyala en la parte posterior de tus deltoides y realiza una flexión de cadera y rodilla..." },
            { nombre: "Prensa de piernas", video: "https://www.youtube.com/embed/D1FvjYNX9QI", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Zancadas", video: "https://www.youtube.com/embed/IG3uyG_62D4", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Elevaciones de talones", video: "https://www.youtube.com/embed/CrX3EkodO3Q", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Extensiones de piernas", video: "https://www.youtube.com/embed/EWa4nd7_25Q", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Curl de piernas", video: "https://www.youtube.com/embed/kmtn5RJkvVE", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Peso muerto rumano", video: "https://www.youtube.com/embed/oWGuhuVK7lk", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Sentadilla búlgara", video: "https://www.youtube.com/embed/d3GwjU-NfG8", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Step-up con mancuernas", video: "https://www.youtube.com/embed/SuqhG_qY694", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
            { nombre: "Zancadas laterales", video: "https://www.youtube.com/embed/6mDKhdmTjao", descripcion: "Acuéstate en un banco, coloca los pies en el suelo y levanta la barra con los brazos extendidos. Baja la barra hasta que toque tu pecho y luego vuelve a subirla..." },
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
* {
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

.container {
  background-color: white;
}

.botones button {
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
