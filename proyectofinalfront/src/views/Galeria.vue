<template>
        <h1>Te presentamos nuestro gimnasio</h1>
        <span class="linea"></span>
    <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
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
</template>
  
<style>
.carousel {
  max-width:1400px; /* ajusta el valor para el ancho deseado */
  max-height: 600px;
  margin: 0 auto; /* centra el carrusel horizontalmente */
}
.carousel-inner {
  margin: 20px; /* ajusta el valor para el margen deseado */
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
.linea{
    background: #550b51;
    height: 5px;
    width: 100%;
    display: block;
    margin-bottom: 2rem;
}
.carousel-caption p{
    color: white;
    background-color: blue;
    display: inline-block;
}
</style>
  