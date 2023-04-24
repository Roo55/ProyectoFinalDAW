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

</template>
<script>
import axios from 'axios';
import {setToken} from '../auth'
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
        let respuesta = response.data
        console.log(respuesta);
        let respuestaUsername = response.data.username;
        const token = response.data.accessToken;
        setToken(token);
        localStorage.setItem('user',JSON.stringify(respuestaUsername))
        localStorage.setItem('token',token)
        this.$router.push('/');
        
        
      }).catch((error) => {
        console.log("Error en el login")
      })
      
    }
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