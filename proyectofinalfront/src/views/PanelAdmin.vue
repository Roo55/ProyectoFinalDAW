<template>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="text-center">Bienvenido al panel de administrador</h1>
                <h2 class="text-center">Clientes</h2>
                <table class="table table-striped table-hover table-bordered border">
                    <thead>
                        <tr>
                            <th>ID Cliente</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Fecha de Nacimiento</th>
                            <th>Direccion</th>
                            <th>Numero de Telefono</th>
                            <th>Email</th>
                            <th>Borrar Cliente</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for="cliente in clientes" :key="cliente.id">
                            <td>{{ cliente.id }}</td>
                            <td>{{ cliente.nombre }}</td>
                            <td>{{ cliente.apellido }}</td>
                            <td>{{ cliente.fechaNacimiento }}</td>
                            <td>{{ cliente.direccion }}</td>
                            <td>{{ cliente.numeroTelefono }}</td>
                            <td>{{ cliente.correoElectronico }}</td>
                            <td><button @click="borrarCliente(cliente.id)">Borrar</button></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</template>
<script>
import router from '@/router'
import axios from 'axios'
import {removeToken} from '../auth';
export default {
    data() {
        return {
            clientes: []
        }
    },
    mounted() {
        axios.get('http://localhost:8081/gym/api/test/clientes')
            .then(response => {
                this.clientes = response.data
                console.log(response.data)
            })
            .catch(error => {
                console.log(error)
            })
    },
    methods: {
        borrarCliente(id) {
            axios.delete(`http://localhost:8081/gym/api/test/clientes/${id}`)
                .then(response => {
                    window.location.reload();

                    console.log(response);
                    if (id == 1) {
                        this.cerrarSesion();
                        
                        
                    }

                })
                .catch(error => {
                    console.log(error);
                });
        },
        cerrarSesion() {
            removeToken();
            this.sesionIniciada = false
            setTimeout(() => {
                this.$router.push('/');
                
            }, 110);
            setTimeout(() => {
                window.location.reload();
            },110)
        },
    }

}
</script>
<style></style>