<template>
  <nav class="navbar navbar-expand-md navbar-dark bg-info">
    <div class="container-fluid">
      <!-- icono o nombre -->

      <a class="navbar-brand" href="#">
        <i class="bi bi-flower1"></i>
        <span class="text-warning"><img
            src="../assets/img/kisspng-fitness-centre-logo-wall-decal-physical-fitness-cropped-jays-home-gym-png-logo-2-png-jayampapos-5c4f52c6431402.2105774115487024062748.png"
            alt=""></span>
      </a>

      <div class="collapse navbar-collapse" id="menu">
        <ul class="navbar-nav mx-auto">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page"><router-link to="/">Inicio</router-link></a>
          </li>
          <li class="nav-item">
            <a class="nav-link"><router-link to="/tarifas">Tarifas</router-link></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" id="navbarDropdown"><router-link to="/galeria">Nuestro gimnasio</router-link></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" id="navbarDropdown"><router-link to="/inscripcion">Inscripción</router-link></a>
          </li>

          <div v-if="!currentUser" class="navbar-nav ml-auto">
            <li class="nav-item">
              <router-link to="/register" class="nav-link">
                <font-awesome-icon icon="user-plus" /> Sign Up
              </router-link>
            </li>
            <li class="nav-item">
              <router-link to="/login" class="nav-link">
                <font-awesome-icon icon="sign-in-alt" /> Login
              </router-link>
            </li>
          </div>

          <div v-if="currentUser" class="navbar-nav ml-auto">
            <li class="nav-item">
              <router-link to="/profile" class="nav-link">
                <font-awesome-icon icon="user" />
                {{ currentUser.username }}
              </router-link>
            </li>
            <li class="nav-item">
              <a class="nav-link" @click.prevent="logOut">
                <font-awesome-icon icon="sign-out-alt" /> LogOut
              </a>
            </li>
          </div>

        </ul>

        <hr class="d-md-none text-white-50">

<!--<form class="d-flex">
          <button class="btn btn-outline-warning d-none d-md-inline-block " id="botonLogin" type="submit"><router-link
              to="/login">Login</router-link></button>
        </form>-->
        


      </div>

    </div>
  </nav>
</template>

<script>
export default {
  computed: {
    currentUser() {
      return this.$store.state.auth.user;
    },
    showAdminBoard() {
      if (this.currentUser && this.currentUser['roles']) {
        return this.currentUser['roles'].includes('ROLE_ADMIN');
      }

      return false;
    },
    showModeratorBoard() {
      if (this.currentUser && this.currentUser['roles']) {
        return this.currentUser['roles'].includes('ROLE_MODERATOR');
      }

      return false;
    }
  },
  methods: {
    logOut() {
      this.$store.dispatch('auth/logout');
      this.$router.push('/login');
    }
  }
};
</script>

<style>
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
</style>
