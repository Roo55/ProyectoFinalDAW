<template>
  <main id="mainInscripcion">
    <div id="contenedorTarjeta">
    <div class="col-md-12">
      <div class="card card-container">
        

          <img id="profile-img" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" class="profile-img-card" />
          <form @submit.prevent="enviarRegistro()">
            <div class="form-group">
              <label for="username">Nombre de usuario:</label>
              <input type="text" id="username" v-model="username" @input="validarUsername">
              <div v-if="usernameError" class="error-message">{{ usernameErrorMessage }}</div>
            </div>
            <div class="form-group">
              <label for="password">Contraseña:</label>
              <input type="password" id="password" v-model="password" @input="validarPassword">
              <div v-if="passwordError" class="error-message">{{ passwordErrorMessage }}</div>
            </div>



            <div class="form-group">
              <button class="btn btn-primary btn-block" :disabled="verificarEnvio">
                <span></span>
                Iniciar Sesión
              </button>
            </div>
            <p v-if="loginFallido" class="error-feedback">Error en el login. Verifique su contraseña y/o su nombre de
              usuario.</p>
          </form>

        </div>

      </div>
    </div>
  </main>
  <footer class="mt-auto">
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
import { setToken } from '../auth'
export default {

  data() {
    return {
      username: '',
      usernameError: false,
      usernameErrorMessage: '',
      password: '',
      passwordError: false,
      passwordErrorMessage: '',
      verificarEnvio: false,
      loginFallido: false
    }
  },
  methods: {
    enviarRegistro() {
      axios.post('http://localhost:8081/gym/api/auth/signin', {
        username: this.username,
        password: this.password


      }).then((response) => {
        let respuesta = response.data
        let respuestaUsername = response.data.username;
        const token = response.data.accessToken;
        setToken(token);
        localStorage.setItem('user', JSON.stringify(respuestaUsername))
        localStorage.setItem('token', token)
        this.$router.push('/');
       setTimeout(() => {
        window.location.reload()
        }, 110);

      }).catch((error) => {
        this.loginFallido = true;
      })

    },
    validarUsername() {
      if (!this.username) {
        this.usernameError = true;
        this.usernameErrorMessage = 'Nombre de usuario no válido'
      } else if (!/^(?=.*\d)[a-zA-Z\d]{5,}$/.test(this.username)) {
        this.usernameError = true;
        this.usernameErrorMessage = 'El nombre de usuario debe tener al menos 5 caracteres y al menos 1 número';
      } else {
        this.usernameError = false;
        this.usernameErrorMessage = ''
      }
      this.verificarEnvio = this.usernameError
    },
    validarPassword() {

      if (this.password.length < 8 || !/[A-Z]/.test(this.password) || !/\d.*\d/.test(this.password)) {
        this.passwordError = true;
        this.passwordErrorMessage = 'La contraseña debe tener al menos 8 caracteres, una mayúscula y dos números';
      } else {
        this.passwordError = false;
        this.passwordErrorMessage = '';
      }
    },

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

  justify-content: space-between;
  position: relative;
  height: 450px;
}

.form-group {
  margin-top: 1rem;
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

* {
  text-align: center;
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

#mainInscripcion {
  background-image: url(../assets/img/Evening\ Sunshine.jpg);
  margin: 0;
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
  margin: 0 auto;
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

.error-message {
  color: red;
  margin-top: 5px;
}</style>