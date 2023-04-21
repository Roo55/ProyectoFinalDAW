<template>
  <h1>Te presentamos nuestro gimnasio</h1>
  <span class="linea"></span>
  <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
    <div class="carousel-indicators">
      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"
        aria-current="true" aria-label="Slide 1"></button>
      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="3" aria-label="Slide 4"></button>
      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="4" aria-label="Slide 5"></button>
      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="5" aria-label="Slide 6"></button>
      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="6" aria-label="Slide 7"></button>
      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="7" aria-label="Slide 8"></button>
    </div>
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img class="d-block w-100" :src="require('@/assets/img/Imagengym1.jpg')" alt="Eighth slide">
        <div class="carousel-caption d-none d-md-block">
          <h5>1</h5>
          <p>Vestuarios femenino y masculino completamente equipados</p>
        </div>
      </div>
      <div class="carousel-item">
        <img class="d-block w-100" :src="require('@/assets/img/Imagengym2.jpg')" alt="Eighth slide">
        <div class="carousel-caption d-none d-md-block">
          <h5>2</h5>
          <p>Taquillas con llave personal</p>
        </div>
      </div>
      <div class="carousel-item">
        <img class="d-block w-100" :src="require('@/assets/img/Imagengym3.jpg')" alt="Eighth slide">
        <div class="carousel-caption d-none d-md-block">
          <h5>3</h5>
          <p>Máquinas de última generación</p>
        </div>
      </div>
      <div class="carousel-item">
        <img class="d-block w-100" :src="require('@/assets/img/Imagengym4.jpg')" alt="Eighth slide">
        <div class="carousel-caption d-none d-md-block">
          <h5>4</h5>
          <p>Sala de musculación</p>
        </div>
      </div>
      <div class="carousel-item">
        <img class="d-block w-100" :src="require('@/assets/img/Imagengym5.jpg')" alt="Eighth slide">
        <div class="carousel-caption d-none d-md-block">
          <h5>5</h5>
          <p>Salas de Spinning</p>
        </div>
      </div>
      <div class="carousel-item">
        <img class="d-block w-100" :src="require('@/assets/img/Imagengym6.jpg')" alt="Eighth slide">
        <div class="carousel-caption d-none d-md-block">
          <h5>6</h5>
          <p>Zonas de ejercicio cardiovascular</p>
        </div>
      </div>
      <div class="carousel-item">
        <img class="d-block w-100" :src="require('@/assets/img/Imagengym7.jpg')" alt="Eighth slide">
        <div class="carousel-caption d-none d-md-block">
          <h5>7</h5>
          <p>Zona de peso libre</p>
        </div>
      </div>
      <div class="carousel-item">
        <img class="d-block w-100" :src="require('@/assets/img/Imagengym8.jpg')" alt="Eighth slide">
        <div class="carousel-caption d-none d-md-block">
          <h5>8</h5>
          <p>Zona de ejercicio cardiovascular</p>
        </div>
      </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>
  <footer>
    <div class="contenedor-footerall">
      <div class="contenedor-body">
        <div class="columna1">
          <h1>Más información de la compañía</h1>
          <p>
            DreamGym Salamanca es un proyecto dedicado a las personas
            residentes en Salamanca o alrededores las cuales quieran dar un
            cambio radical en su vida, para aquellos que quieran sentirse
            realmente bien consigo mismos y a la par quieran mantener un
            estilo de vida saludable.
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
            <label>
              <a href="mailto:dreamgymslmnc@dreamgymbussiness.com">Nuestro correo</a>
            </label>
          </div>
        </div>
      </div>
    </div>
  </footer>
</template>
<script>
export default {
  
    
      mounted(){
        window.scrollTo(0,0);

    }
  
}

</script>
<style scoped>
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
.carousel {
  max-width: 1400px;
  /* ajusta el valor para el ancho deseado */
  max-height: 600px;
  margin: 0 auto;
  /* centra el carrusel horizontalmente */
}

.carousel-inner {
  margin: 20px;
  /* ajusta el valor para el margen deseado */
}

h1 {
  text-align: center;
  margin-top: 50px;
}


hr {
  border-top: 2px solid #999;
}


.carousel-item {
  height: 600px;
}

.carousel-item img {
  object-fit: cover;
  height: 100%;
}

.linea {
  background: #550b51;
  height: 5px;
  width: 100%;
  display: block;
  margin-bottom: 2rem;
}

.carousel-caption p {
  color: white;
  background-color: blue;
  display: inline-block;
}</style>
  