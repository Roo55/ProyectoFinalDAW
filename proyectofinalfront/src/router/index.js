import { createRouter, createWebHashHistory } from 'vue-router'
import principal from '../views/PaginaPrincipal.vue'
import tarifas from '../views/Tarifas.vue'
import galeria from '../views/Galeria.vue'
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
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
