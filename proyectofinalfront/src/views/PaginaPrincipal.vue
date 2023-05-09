<template>
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">

  <div>
    <main class="main">
      <section class="textos-principales text-center">
        <h1>¿Estás list@ para dar un cambio en tu vida?</h1>
        <h2 class="titulo">Empieza a sentirte bien</h2>
        <div class="ola" style="height: 150px; overflow: hidden;"><svg viewBox="0 0 500 150" preserveAspectRatio="none"
            style="height: 100%; width: 100%;">
            <path d="M0.00,49.98 C168.45,248.20 292.61,-52.77 500.00,49.98 L500.00,150.00 L0.00,150.00 Z"
              style="stroke: none; fill: #fff;"></path>
          </svg></div>
      </section>

      <section class="metodo-dreamgym text-center">
        <h2 class="titulo2">EL MÉTODO DREAMGYM</h2>
        <div class="contenedor-metodo row">
          <div class="col-lg-6 col-md-12">
            <img src="../assets/img/logo2.png" alt="metodo" class="imagen-metodo img-fluid" />
          </div>
          <div class="col-lg-6 col-md-12">
            <div class="contenido-textos">
              <h3><span>1</span>Te asesoramos</h3>
              <p>Desde DreamGym Salamanca tú eres nuestra prioridad. Por ello, cuando llegas a nuestras instalaciones,
                un equipo de profesionales te atenderá, ayudará y asesorará para que no te sientas sol@ en el proceso.
              </p>

              <h3><span>2</span>Nuestra filosofía</h3>
              <p>En DreamGym Salamanca creemos en el ejercicio físico. Está probado científicamente que la práctica
                deportiva libera endorfinas, serotonina y reduce el estrés. Es imprescindible tener un equilibrio entre
                una mente y un cuerpo sano para sentirse bien, y en DreamGym Salamanca este es nuestro objetivo</p>
            </div>
          </div>
        </div>
      </section>
      <section class="nuestros-servicios" id="nuestros-servicios">
        <div class="contenedor">
          <h2 class="titulo2">Te contamos más sobre nosotros</h2>
          <div class="row galeria-servicios ">
            <div class="col-md-3 col-sm-6">
              <div class="imagen-servicios">
                <img src="../assets/img/inscripcioncuadro.jpg" alt="" />
                <div class="hover-galeria">
                  <img src="../assets/img/contrato.png" alt="" />
                  <p> <a class="idinscripcion"><router-link to="/register">Inscripción</router-link></a></p>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-6">
              <div class="imagen-servicios">
                <img src="../assets/img/gimnasiocuadro.jpeg" alt="" />
                <div class="hover-galeria">
                  <img src="../assets/img/instalaciones.png" alt="" />
                  <p><a class="idinscripcion"><router-link to="/galeria">Instalaciones</router-link></a></p>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-6">
              <div class="imagen-servicios">
                <img src="../assets/img/tarifascuadro.jpg" alt="" />
                <div class="hover-galeria">
                  <img src="../assets/img/contrato.png" alt="" />
                  <p> <a class="idinscripcion"><router-link to="/tarifas">Tarifas</router-link></a></p>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-6">
              <div class="imagen-servicios">
                <img src="../assets/img/noticiascuadro.jpg" alt="" />
                <div class="hover-galeria">
                  <img src="../assets/img/noticias.png" alt="" />
                  <p> <a class="idinscripcion"><router-link to="/noticias">Noticias</router-link></a> </p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>





      <div class="clientes contenedor">
        <h2 class="titulo2">¿Qué opinan nuestros clientes?</h2>
        <div class="row justify-content-center">
          <div class="col-lg-5 col-md-6 col-sm-12">
            <div class="card mb-3">
              <div class="card-body">
                <h4 class="card-title">Eustaquio</h4>
                <p class="card-text">¿Mi opinión? Realmente no tengo palabras. Este gimnasio ha hecho que con mucho
                  sacrificio y ganas pueda conseguir lo que siempre he querido. Bienestar conmigo mismo, tanto mental como
                  físicamente. Lo recomendaría al 100%.</p>
              </div>
            </div>
          </div>
          <div class="col-lg-5 col-md-6 col-sm-12">
            <div class="card mb-3">
              <div class="card-body">
                <h4 class="card-title">Fátima</h4>
                <p class="card-text">DreamGym Salamanca es un gimnasio muy completo, te ayudan y asesoran auténticos
                  profesionales del mundo del fitness. He estado en otros gimnasios en esta ciudad, por lo que me atrevo a
                  decir que este es el mejor de Salamanca.</p>
              </div>
            </div>
          </div>
          <div class="col-lg-5 col-md-6 col-sm-12">
            <div class="card mb-3">
              <div class="card-body">
                <h4 class="card-title">Roberto</h4>
                <p class="card-text">Este gimnasio destaca por ofrecer una experiencia de entrenamiento excepcional. Los instructores son expertos en su campo y están dispuestos a brindar asesoramiento y orientación personalizados para ayudarte a alcanzar tus objetivos de fitness.</p>
              </div>
            </div>
          </div>
          <div class="col-lg-5 col-md-6 col-sm-12">
            <div class="card mb-3">
              <div class="card-body">
                <h4 class="card-title">Cristina</h4>
                <p class="card-text">Los entrenadores son verdaderos profesionales que se toman el tiempo para conocer tus necesidades y trabajar contigo en un plan de entrenamiento personalizado. Ambiente acogedor y una amplia variedad de clases y servicios.</p>
              </div>
            </div>
          </div>
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



    </main>

  </div>
</template>
<style scoped>
.card-body {
  background-color: #4d0686;
}

.card-body p,
h4 {
  color: white;
}

* {
  text-align: center;
  box-sizing: border-box;
}
.row{
  --bs-gutter-x:0
}
.cabecera {
  text-align: center;
}

.esencias {
  font-weight: bold;
  color: blue;
  font-style: normal;
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

.copyright a {
  text-decoration: none;
  color: white;
  font-weight: bold;
}

.informacion a {
  text-decoration: none;
  color: #c7c7c7;
}

@media screen and (max-width: 1100px) {
  .contenedor-body {
    flex-wrap: wrap;
  }

  .columna1 {
    max-width: 100%;
  }

  .columna2,
  .columna3 {
    margin-top: 40px;
  }
}

/* Anuncios */

.anuncioizquierda {
  float: left;

  position: fixed;
  bottom: 2px;
}

.anuncioderecha {
  float: right;
  position: fixed;
  bottom: 0;
  left: 1675px;
}

/* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! */
header {
  background: #333;
  color: white;
  padding: 2rem 0;
  position: fixed;
  left: 0;
  top: 0;
  right: 0;
  z-index: 1;
}

.contenedorheader a {
  color: white;
  text-decoration: none;
}

.contenedorheader {
  width: 85%;
  max-width: 850px;
  margin: 0 auto;
}

.contenedor-script {
  font-size: 15px;
}

.logo-nav-container {
  display: flex;
  justify-content: space-between;
  align-items: center;
  flex-wrap: wrap;
}



.navegacion ul {
  margin: 0;
  padding: 0;
  list-style: none;
}

.navegacion ul li {
  display: inline-block;
  /* Para que se pongan uno al lado del otro*/
}

.navegacion ul li a {
  display: block;
  padding: 0.5rem 1rem;
  transition: all 0.4s linear;
  border-radius: 5px;
}

.navegacion ul li a:hover {
  background: #4a4a4a;
}

.menu-icono {
  display: none;
}

.titulo2 {
  padding-top: 3rem;
}

/* OLA */
.textos-principales {
  background: #544a7d;
  /* fallback for old browsers */
  background: -webkit-linear-gradient(to right, #ffd4529d, #544a7daf),
    url(../assets/img/hombreflexiones.jpg);
  /* Chrome 10-25, Safari 5.1-6 */
  background: linear-gradient(to right, #ffd4529d, #544a7da1),
    url(../assets/img/hombreflexiones.jpg);
  /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
  background-size: cover;
  background-attachment: fixed;
  position: relative;
  height: 900px;
}

.ola {
  position: absolute;
  bottom: 0;
  width: 100%;
}

/* OLA FIN */
.textos-principales {
  display: flex;
  height: 900px;
  width: 100%;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  text-align: center;
}

.textos-principales h1 {
  font-size: 50px;
  color: #fff;
  font-family: "Gill Sans", "Gill Sans MT", Calibri, "Trebuchet MS", sans-serif;
}

.textos-principales h2 {
  font-size: 30px;
  font-weight: 300;
  color: #fff;
  font-family: "Gill Sans", "Gill Sans MT", Calibri, "Trebuchet MS", sans-serif;
  font-style: italic;
  font-weight: bold;
}

.contenido-textos {
  padding: 60px 0;
  width: 90%;
  max-width: 1000px;
  margin: auto;
  overflow: hidden;
  text-align: center;
  justify-content: center;
}

.titulo2 {
  color: #642a73;
  font-size: 30px;
  text-align: center;
  margin-bottom: 60px;
}

.metodo-dreamgym {
  padding-top: 3rem;
}

.contenedor-metodo {
  display: flex;
  justify-content: space-evenly;
  /* Repartir equitativamente */
}

.imagen-metodo {
  width: 40%;
  padding-left: 5px;
}

body {
  font-family: "open sans";
  font-size: 15px;
}

.contenedor-metodos .contenido-textos {
  width: 40%;
}

.contenido-textos h3 {
  margin-bottom: 15px;
  margin-right: 170px;
}

.contenido-textos h3 span {
  background: #4d0686;
  color: #fff;
  border-radius: 50%;
  display: inline-block;
  text-align: center;
  width: 30px;
  padding: 2px;
  box-shadow: 0 0 6px rgba(0, 0, 0, 0.5);
  margin-right: 5px;
}

.contenido-textos p {
  padding: 0px 0px 30px 15px;
  font-weight: 300;
  text-align: justify;
}

/* Servicios */
.nuestros-servicios {
  background: #f2f2f2;
}

.galeria-servicios {
  justify-content: space-evenly;
  margin-bottom: 1rem;
}

.imagen-servicios {
  flex: 1;
  margin-bottom: 10px;
  height: 200px;
  overflow: hidden;
  position: relative;
  cursor: pointer;
  box-shadow: 0 0 6px 0 rgba(0, 0, 0, 0.5);
}

.imagen-servicios>img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
}

.hover-galeria {
  position: absolute;
  width: 100%;
  height: 100%;
  top: 0;
  transform: scale(0);
  background: hsla(273, 91%, 27%, 0.7);
  transition: transform 0.5s;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;

}

.hover-galeria p a {
  text-decoration: none;
  color: white;
}

.hover-galeria img {
  width: 50px;
}

.hover-galeria p {
  color: #fff;
}

.imagen-servicios:hover .hover-galeria {
  transform: scale(1);
}

.idinscripcion {
  text-decoration: none;
  color: white;
}

/* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
/* Tarjetas */
.tarjetas {
  display: block;
  justify-content: space-evenly;
  margin-left: 650px;
}

.tarjetas .tarjeta {
  background: #4d0686;
  display: flex;
  width: 46%;
  height: 200px;
  position: relative;
  align-items: center;
  justify-content: space-evenly;
  border-radius: 5px;
  box-shadow: 0 0 6px rgba(0, 0, 0, 0.6);
  margin-top: 15px;
}

.tarjetas .tarjeta img {
  width: 100px;
  height: 100px;
  object-fit: cover;
  border: 3px solid white;
  border-radius: 50%;
  display: block;
}

.tarjetas .tarjeta>.contenido-texto-tarjeta {
  width: 60%;
  color: #fff;
}

.tarjetas .tarjeta>.contenido-texto-tarjeta p {
  font-weight: 300;
  padding-top: 5px;
}

.clientes {
  padding-bottom: 10px;
}

/* Haciendo la cabecera responsive */

@media only screen and (max-width: 889px) {
  .main {
    padding-top: 12rem;
  }

  .navegacion {
    width: 100%;
  }

  .navegacion ul li {
    display: block;
  }

  .navegacion ul li a {
    display: block;
    padding: 0.5rem 0;
    transition: all 0.4s linear;
    border-radius: 5px;
  }

  .navegacion ul li a:hover {
    background: #4a4a4a;
  }

  .menu-icono {
    display: block;
    cursor: pointer;
    padding: 0.5rem 1rem;
  }

  .navegacion ul {
    display: none;
  }

  .navegacion ul.show {
    display: block;
  }
}
</style>