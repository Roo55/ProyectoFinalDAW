<template>
  <main id="mainInscripcion">
    <div class="col-md-12">
      <div class="card card-container">
        <img id="profile-img" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" class="profile-img-card" />
        <form @submit.prevent="enviarRegistro()">
          <div class="form-group">
              <label for="username">Nombre de usuario:</label>
              <input type="text" id="username" v-model="username">
            </div>
            <div class="form-group">
              <label for="password">Contraseña:</label>
              <input type="password" id="password" v-model="password">
            </div>
           


            <div class="form-group">
              <button class="btn btn-primary btn-block" :disabled="loading">
                <span v-show="loading" class="spinner-border spinner-border-sm"></span>
                Sign Up
              </button>
            </div>
         
        </Form>

        <div v-if="message" class="alert" :class="successful ? 'alert-success' : 'alert-danger'">
          {{ message }}
        </div>
      </div>
    </div>
  </main>
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
import axios from 'axios';
export default {

  data() {
    return {
      username: '',
      password: ''

    }
  },
  methods: {
    enviarRegistro() {
      axios.post('http://localhost:8081/gym/api/auth/signin', {
        username: this.username,
        password: this.password


      }).then((response) => {
        console.log(response.data);
      })
    }
  }
}
</script>
<style>
* {
  text-align: center;
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

#mainInscripcion {
  background-image: url(../assets/img/Evening\ Sunshine.jpg);
  margin: 0;
  font-family: "open sans";
  font-size: 15px;
}

.registro {
  width: 400px;
  background: #24303c;
  padding-right: 50px;
  padding-left: 50px;
  margin: auto;
  border-radius: 4px;
  font-family: 'calibri';
  color: white;
  padding-top: 10px;
  box-sizing: 7px 13px 37px #000;

}

.registro h4 {
  font-size: 22px;
  margin-bottom: 20px;
}

.registro p {
  height: 40px;
  text-align: center;
  font-size: 18px;
  line-height: 40px;
}

.registro a {
  color: white;
  text-decoration: none;
}

.registro a:hover {
  color: white;
  text-decoration: underline;
}

.registro .control-botones {
  width: 100%;
  background: #1f53c5;
  border: none;
  padding: 12px;
  color: white;
  margin: 16px 0;
  font-size: 16px;
}

.control-input {
  width: 100%;
  background: #24303c;
  padding: 10px;
  border-radius: 4px;
  margin-bottom: 16px;
  border: 1px solid #1f53c5;
  font-family: 'calibri';
  font-size: 18px;
}

/* INPUTS */
input:invalid {
  border-color: red;
  color: red;
  background: #fffafa;


}

.input[data-error]::after {
  content: attr(data-error);
}


label {
  display: block;
  margin-top: 10px;
}

.card-container.card {
  max-width: 350px !important;
  padding: 40px 40px;
}

.card {
  background-color: #f7f7f7;
  padding: 20px 25px 30px;
  margin: 0 auto 25px;
  margin-top: 50px;
  -moz-border-radius: 2px;
  -webkit-border-radius: 2px;
  border-radius: 2px;
  -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
  -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
  box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
}

.profile-img-card {
  width: 96px;
  height: 96px;
  margin: 0 auto 10px;
  display: block;
  -moz-border-radius: 50%;
  -webkit-border-radius: 50%;
  border-radius: 50%;
}

.error-feedback {
  color: red;
}
</style>