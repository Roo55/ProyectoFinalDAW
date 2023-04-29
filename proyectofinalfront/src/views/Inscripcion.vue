<template>
    <div id="principal" class="d-flex align-items-center">
        <main id="mainInscripcion" class="mx-auto">
        <form @submit.prevent="enviarRegistro()">
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" v-model="nombre">
            </div>
            <div class="form-group">
                <label for="apellido">Apellido:</label>
                <input type="text" id="apellido" v-model="apellido">
            </div>
            <div class="form-group">
                <label for="fechaNacimiento">Fecha de nacimiento:</label>
                <input type="text" id="fechaNacimiento" v-model="fechaNacimiento" @input="validarFechaNacimiento">
                <div v-if="fechaNacimientoError" class="error-message">{{ fechaNacimientoErrorMessage }}</div>
            </div>
            <div class="form-group">
                <label for="direccion">Direccion:</label>
                <input type="text" id="direccion" v-model="direccion">
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="text" id="email" v-model="email" @input="validarEmail">
                <div v-if="emailError" class="error-message">{{ emailErrorMessage }}</div>
            </div>
            <div class="form-group">
                <label for="numeroTelefono">Número de telefono:</label>
                <input type="text" id="numeroTelefono" v-model="numeroTelefono" @input="validarNumeroTelefono">
                <div v-if="numeroTelefonoError" class="error-message">{{ numeroTelefonoErrorMessage }}</div>
            </div>
            <div class="form-group">
                <label for="password">Contraseña:</label>
                <input type="password" id="password" v-model="password" @input="validarPassword">
                <div v-if="passwordError" class="error-message">{{ passwordErrorMessage }}</div>
            </div>
            <div class="form-group">
                <label for="username">Nombre de usuario:</label>
                <input type="text" id="username" v-model="username" @input="validarUsername">
                <div v-if="usernameError" class="error-message">{{ usernameErrorMessage }}</div>
            </div>
            <!-- ... más campos de formulario ... -->
            <div class="form-group">
                <button class="btn btn-primary btn-block" :disabled="loading">
                    <span v-show="loading" class="spinner-border spinner-border-sm"></span>
                    Registrarse
                </button>
            </div>
        </form>
        <!-- ... tu código de mensaje de éxito/error ... -->
    </main>
    </div>
    
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
export default {

    data() {
        return {
            nombre: '',
            apellido: '',
            fechaNacimiento: '',
            fechaNacimientoError: false,
            fechaNacimientoErrorMessage: '',
            direccion: '',
            email: '',
            emailError: false,
            emailErrorMessage: '',
            numeroTelefono: '',
            numeroTelefonoError: false,
            numeroTelefonoErrorMessage: '',
            password: '',
            passwordError: false,
            passwordErrorMessage: '',
            username: '',
            usernameError: false,
            usernameErrorMessage: '',
        }
    },
    mounted(){
        window.scrollTo(0,0);
    },
    methods: {
        enviarRegistro() {
            axios.post('http://localhost:8081/gym/api/auth/signup', {
                nombre: this.nombre,
                apellido: this.apellido,
                fechaNacimiento: this.fechaNacimiento,
                direccion: this.direccion,
                email: this.email,
                numeroTelefono: this.numeroTelefono,
                password: this.password,
                username: this.username,

            }).then((response) => {
                console.log(response.data);
            })
            
        },
        validarFechaNacimiento() {

            if (!this.fechaNacimiento.match(/^(\d{2}\/){2}\d{4}$/)) {
                this.fechaNacimientoError = true;
                this.fechaNacimientoErrorMessage = 'Por favor, ingrese una fecha de nacimiento válida en el formato DD-MM-YYYY';
            } else {
                this.fechaNacimientoError = false;
                this.fechaNacimientoErrorMessage = '';
            }
        },
        validarEmail() {

            if (!this.email.match(/^[\w-]+(\.[\w-]+)*@([\w-]+\.)+[a-zA-Z]{2,7}$/)) {
                this.emailError = true;
                this.emailErrorMessage = 'Por favor, ingrese un email válido';
            } else {
                this.emailError = false;
                this.emailErrorMessage = '';
            }
        },
        validarNumeroTelefono() {

            if (!this.numeroTelefono.match(/^\d{9}$/)) {
                this.numeroTelefonoError = true;
                this.numeroTelefonoErrorMessage = 'Por favor, ingrese un número de teléfono válido de 9 dígitos';
            } else {
                this.numeroTelefonoError = false;
                this.numeroTelefonoErrorMessage = '';
            }
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

        validarUsername() {
            const regex = /^(?=.*\d)[a-zA-Z\d]{5,}$/;
            if (!regex.test(this.username)) {
                this.usernameError = true;
                this.usernameErrorMessage = 'El nombre de usuario debe tener al menos 5 caracteres y al menos 1 número';
            } else {
                this.usernameError = false;
                this.usernameErrorMessage = '';
            }
        },

    }
}
</script>
<style scoped>
.form-group{
    text-align: center;
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
}
 label {
        display: block;
        font-weight: bold;
        margin-bottom: 0.5rem;
    }

    label a {
        text-decoration: none;
        color: #007bff;
    }
#principal{
    background-color: #8c00ff;
}
#mainInscripcion {
  background-color: black;
  border-radius: 10px;
  padding: 20px;
  margin: 20px;
  width: 50%;
}

.form-group {
  margin-bottom: 15px;
}

label {
  display: block;
  font-weight: bold;
  margin-bottom: 5px;
}

input[type="text"],
input[type="password"] {
  width: 100%;
  padding: 10px;
  border-radius: 5px;
  border: none;
  margin-top: 5px;
}

.error-message {
  color: red;
  margin-top: 5px;
}

.btn-primary {
  background-color: #007bff;
  color: #fff;
  padding: 10px;
  border-radius: 5px;
  border: none;
  width: 100%;
  cursor: pointer;
}

.spinner-border {
  margin-right: 5px;
  display: inline-block;
  width: 1.5rem;
  height: 1.5rem;
  vertical-align: text-bottom;
  border: 0.25em solid currentColor;
  border-right-color: transparent;
  border-radius: 50%;
  animation: spinner-border 0.75s linear infinite;
}

@keyframes spinner-border {
  to {
    transform: rotate(360deg);
  }
}

.contenedor-footerall {
  background-color: black;
  padding: 20px;
  border-radius: 10px;
}

.columna1,
.columna2,
.columna3 {
  flex-basis: 30%;
  color: white;
}

.columna1 h1,
.columna2 h1,
.columna3 h1 {
  font-weight: bold;
  margin-bottom: 10px;
}

.columna1 p,
.columna2 .fila1,
.columna3 .fila2 {
  margin-bottom: 5px;
}

.columna2 .fila1 img,
.columna3 .fila2 img {
  width: 20px;
  margin-right: 5px;
}

.columna2 .fila1 a,
.columna3 .fila2 label {
  color: #007bff;
  text-decoration: none;
}

.columna2 .fila1 a:hover,
.columna3 .fila2 label:hover {
  text-decoration: underline;
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