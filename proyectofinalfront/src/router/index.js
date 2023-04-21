import { createRouter, createWebHashHistory } from 'vue-router'
import principal from '../views/PaginaPrincipal.vue'
import tarifas from '../views/Tarifas.vue'
import galeria from '../views/Galeria.vue'
import inscripcion from '../views/Inscripcion.vue'
import login from '../views/Login.vue'
import sugerencias from '../views/SugerenciasEjercicios.vue'
import calendario from '../views/Calendario.vue'
import paywall from '../views/Paywall.vue'
const routes = [
  {
    path: '/',
    name: 'principal',
    component: principal
  },
  {
    path: '/tarifas',
    name: 'tarifas',
    component: tarifas
  },
  {
    path: '/galeria',
    name: 'galeria',
    component: galeria
  },
  {
    path:'/register',
    name:'inscripcion',
    component:inscripcion
  },
  {
    path:'/login',
    name:'login',
    component:login
  },
  {
    path:'/sugerencias',
    name:'sugerencias',
    component:sugerencias
  },
  {
    path:'/calendario',
    name:'calendario',
    component:calendario
  },
  {
    path:'/paywall/:precio/:nombre',
    name:'paywall',
    component:paywall
  }
  
 
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
