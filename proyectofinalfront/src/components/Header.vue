<template>
  <nav class="navbar navbar-expand-md navbar-dark bg-info">
    <div class="container-fluid">
      <!-- icono o nombre -->

      <a class="navbar-brand" href="#">
        <i class="bi bi-flower1"></i>
        <span class="text-warning"><img
            src="../assets/img/kisspng-fitness-centre-logo-wall-decal-physical-fitness-cropped-jays-home-gym-png-logo-2-png-jayampapos-5c4f52c6431402.2105774115487024062748.png"
            alt=""></span>
        <a v-if="usuarioAdmin && sesionIniciada" class="adminButton"><router-link to="/admin">Panel admin</router-link></a>
      </a>

      <div class="collapse navbar-collapse" id="menu">
        <ul class="navbar-nav mx-auto" id="contenedorLis">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page"><router-link to="/">Inicio</router-link></a>
          </li>
          <li class="nav-item">
            <a class="nav-link"><router-link to="/tarifas">Tarifas</router-link></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" id="navbarDropdown"><router-link to="/galeria">Nuestro gimnasio</router-link></a>
          </li>
          <li v-if="sesionIniciada" class="nav-item">
            <a class="nav-link" id="navbarDropdown"><router-link to="/sugerencias">Sugerencias</router-link></a>
          </li>
          <li v-if="sesionIniciada" class="nav-item">
            <a class="nav-link" id="navbarDropdown"><router-link to="/calendario">Calendario Clases</router-link></a>
          </li>
          <li v-if="sesionIniciada" class="nav-item">
            <a class="nav-link" id="navbarDropdown"><router-link to="/noticias">Noticias</router-link></a>
          </li>

          <div class="navbar-nav ml-auto">
            <li class="nav-item">
              <div id="nombreUsuario" v-if="sesionIniciada" class="username">Bienvenid@, {{ username }} !</div>
              <router-link v-else to="/login" class="nav-link">
                <font-awesome-icon icon="sign-in-alt" /> Login
              </router-link>
            </li>
            <li id="botonCerrarSesion" v-if="sesionIniciada" class="nav-item">
                <button @click="cerrarSesion">Cerrar sesión</button>
            </li>
            <li v-else class="nav-item">
              <router-link to="/register" class="nav-link">
                <font-awesome-icon icon="user-plus" /> Registro
              </router-link>
            </li>
            
          </div>

          

        </ul>

        <hr class="d-md-none text-white-50">

        


      </div>

    </div>
  </nav>
</template>
<script>
import jwt_decode from 'jwt-decode';
import {removeToken} from '../auth';
import {getToken} from '../auth';

export default{
  data(){
    return{
      username:'',
      sesionIniciada:false,
      rol:'',
      usuarioAdmin:false
    }
  },
  created(){
    this.sesionIniciada = !!getToken();
    if(this.sesionIniciada){
       var token = localStorage.getItem('token')
     const decoded = jwt_decode(token);
     this.username = decoded.sub;
     this.rol = decoded.autorizacion[0].authority;
     if(this.rol == "ROLE_ADMIN"){
      this.usuarioAdmin = true;
     }
    
    }else{
      this.sesionIniciada=false;
    }
  

  },
  methods:{
    cerrarSesion(){
      removeToken();
      this.sesionIniciada=false
      setTimeout(() => {
          this.$router.push('/');
        }, 110); 
    },
    
  }
}
</script>
<style>

#botonCerrarSesion{
  margin-left: 2rem;
  margin-top: 0.5rem;
}
#nombreUsuario{
  margin-left: 1rem;
  margin-top: 0.6rem;
  color: red;
}
.adminButton a{
  color: black;
  text-decoration: none;
}
.adminButton{
  text-decoration: none;
  margin-left: 0.5rem;
}
form a {
  text-decoration: none;
  color: white;

}

ul li a {
  color: white;
  text-decoration: none;
}

.text-warning img {
  max-height: 50px;

}

.container {
  display: grid;
  justify-content: center;
  align-content: center;
  width: 100%;
}

.container #divImagenLogo {
  align-content: start;
}

.navbar-brand img {
  max-height: 50px;
}

.navbar-nav .nav-link {
  color: white;
  font-size: 1.2rem;
  margin-left: 20px;
  margin-right: 20px;
}

.container {
  background-color: #ffc107;
}

li {
  list-style: none;
}

.navbar-nav .nav-link:hover {
  color: #ffc107;
}
@media screen and(max-width: 768px){
  #contenedorLis li{
    display: flex;
    flex-direction: column;
  }
}
</style>
