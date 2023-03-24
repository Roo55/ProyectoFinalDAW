import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap/dist/js/bootstrap.js';
import { FontAwesomeIcon } from './plugins/font-awesome'

createApp(App)
  .use(router)
  .use(store)
  .component("font-awesome-icon", FontAwesomeIcon)
  .mount("#app");

  import axios from 'axios';

  axios.interceptors.request.use(config => {
    config.headers['Origin'] = 'http://localhost:8080'; // reemplaza con la URL de tu frontend
    return config;
  });