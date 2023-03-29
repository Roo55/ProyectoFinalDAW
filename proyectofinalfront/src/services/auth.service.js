import axios from 'axios';

axios.defaults.baseURL = 'http://localhost:8081/gym/api';
axios.defaults.headers.common['Origin'] = 'http://localhost:8080';
axios.defaults.headers.common['Content-Type'] = 'application/json';

const API_URL = 'http://localhost:8081/gym/api/auth/';

class AuthService {
  login(user) {
    return axios
      .post(API_URL + 'signin', {
        username: user.username,
        password: user.password
      })
      .then(response => {
        if (response.data.accessToken) {
          localStorage.setItem('user', JSON.stringify(response.data));
        }

        return response.data;
      });
  }

  logout() {
    localStorage.removeItem('user');
  }

  register(user) {
    return axios.post(API_URL + 'signup', {
      nombre:"juan",
      apellido:"prueba",
      fecha_nacimiento:"1990-05-20",
      direccion:"ascvaf",
      correo_electronico:"asda",
      numero_telefono:"645175145",
      username: user.username,
      email: user.email,
      password: user.password
    }, {
      headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*'
      }
    });
  }
  
}

export default new AuthService();
