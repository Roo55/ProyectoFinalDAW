import { createRouter, createWebHashHistory } from 'vue-router'
import principal from '../views/PaginaPrincipal.vue'
import tarifas from '../views/Tarifas.vue'
import galeria from '../views/Galeria.vue'
import inscripcion from '../views/Inscripcion.vue'
import login from '../views/Login.vue'
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
    path:'/inscripcion',
    name:'inscripcion',
    component:inscripcion
  },
  {
    path:'/login',
    name:'login',
    component:login
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
