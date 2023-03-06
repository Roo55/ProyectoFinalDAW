<template>
    <div>
      <h1>Te presentamos nuestro gimnasio</h1>
      <span class="linea"></span>
      <section class="galeria">
        <a v-for="(image, index) in images" :key="index" @click.prevent="showModal(index)">
          <img :src="require('@/assets/img/' + image.filename)" :alt="image.title" />
        </a>
      </section>
      <div v-if="show">
        <div class="modal">
          <span class="cerrar" @click="closeModal">&times;</span>
          <div class="modal-content">
            <span class="prev" @click="prevImage">&lt;</span>
            <img :src="require('@/assets/img/' + currentImage.filename)" :alt="currentImage.title" />
            <span class="next" @click="nextImage">&gt;</span>
          </div>
        </div>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        images: [
          {
            filename: "Imagengym1.jpg",
            title: "Imagen 1",
          },
          {
            filename: "Imagengym2.jpg",
            title: "Imagen 2",
          },
          {
            filename: "Imagengym3.jpg",
            title: "Imagen 3",
          },
          {
            filename: "Imagengym4.jpg",
            title: "Imagen 4",
          },
          {
            filename: "Imagengym5.jpg",
            title: "Imagen 5",
          },
          {
            filename: "Imagengym6.jpg",
            title: "Imagen 6",
          },
          {
            filename: "Imagengym7.jpg",
            title: "Imagen 7",
          },
          {
            filename: "Imagengym8.jpg",
            title: "Imagen 8",
          },
        ],
        currentImageIndex: 0,
        show: false,
      };
    },
    computed: {
      currentImage() {
        return this.images[this.currentImageIndex];
      },
    },
    methods: {
      showModal(index) {
        this.currentImageIndex = index;
        this.show = true;
      },
      closeModal() {
        this.show = false;
      },
      nextImage() {
        this.currentImageIndex = (this.currentImageIndex + 1) % this.images.length;
      },
      prevImage() {
        this.currentImageIndex = (this.currentImageIndex - 1 + this.images.length) % this.images.length;
      },
    },
  };
  </script>
  <style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  font-family: Arial, sans-serif;
  background-color: #f2f2f2;
}

h1 {
  text-align: center;
  margin: 30px 0;
}

.linea {
  display: block;
  height: 3px;
  width: 100%;
  background-color: #333;
  margin: 30px 0;
}

/* Estilos para la galería */
.galeria {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  align-items: center;
}

.galeria a {
  margin: 20px;
}

.galeria img {
  width: 250px;
  height: 250px;
  object-fit: cover;
  border-radius: 50%;
  border: 3px solid #fff;
  box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.3);
  transition: all 0.3s ease-in-out;
}

.galeria img:hover {
  transform: scale(1.1);
}

/* Estilos para el modal */
.modal {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.5);
  display: flex;
  justify-content: center;
  align-items: center;
  z-index: 1;
}

.modal-content {
  display: flex;
  justify-content: center;
  align-items: center;
  position: relative;
}

.cerrar {
  position: absolute;
  top: 0;
  right: 0;
  color: #fff;
  font-size: 30px;
  font-weight: bold;
  padding: 10px;
  cursor: pointer;
}

.prev,
.next {
  position: absolute;
  top: 50%;
  transform: translateY(-50%);
  color: #fff;
  font-size: 50px;
  font-weight: bold;
  padding: 10px;
  cursor: pointer;
  background-color: rgba(0, 0, 0, 0.5);
}

.prev {
  left: 0;
}

.next {
  right: 0;
}

.modal img {
  width: 70%;
  height: 70%;
  object-fit: contain;
  border-radius: 10px;
  border: 5px solid #fff;
}
</style>