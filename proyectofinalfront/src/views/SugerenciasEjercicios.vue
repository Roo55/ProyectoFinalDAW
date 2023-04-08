<template>
    <div>
      <h2>¿Qué ejercicios puedes realizar hoy?</h2>
      <div class="botones">
        <button v-for="(boton, index) in botones" :key="index" @click="mostrarEjercicios(index)">{{ boton.nombre }}</button>
      </div>
      <div class="ejercicios-contenedor" v-if="mostrarCuadros">
        <table>
          <tbody>
            <tr>
              <td class="cuadro cuadro1">{{ ejerciciosMostrados[0] }}</td>
            </tr>
            <tr>
              <td class="cuadro cuadro2">{{ ejerciciosMostrados[1] }}</td>
            </tr>
            <tr>
              <td class="cuadro cuadro3">{{ ejerciciosMostrados[2] }}</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        botones: [
          { nombre: "Full Body(Principiantes)", ejercicios: ["Sentadillas en multipower", "Press de banca", "Remo con barra"] },
          { nombre: "Espalda/Biceps", ejercicios: ["Remo con mancuernas", "Curl de bíceps", "Dominadas"] },
          { nombre: "Pecho/Triceps", ejercicios: ["Press de banca", "Extensiones de tríceps", "Fondos en paralelas"] },
          { nombre: "Pierna", ejercicios: ["Sentadillas", "Prensa de piernas", "Zancadas"] },
        ],
        mostrarCuadros: false,
        ejerciciosMostrados: [],
      };
    },
    methods: {
        mostrarEjercicios(index) {
    this.ejerciciosMostrados = this.botones[index].ejercicios;
    this.mostrarCuadros = false;
    setTimeout(() => {
      this.mostrarCuadros = true;
    }, 100);
  },
    },
  };
  </script>

<style>
.botones button{
    margin-right: 1rem;
}
.botones {
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 1rem;
  }

  .ejercicios-contenedor {
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 1rem;
  }

  table {
    border-collapse: collapse;
    margin-top: 1rem;
  }

  td {
    border: 1px solid black;
    padding: 0.5rem;
  }
  table {
    width: 70%;
    border-collapse: collapse;
  }

  td {
    padding: 1rem;
    text-align: center;
  }

  .cuadro {
    width: 70%;
    height: 300px;
    margin-top: 1rem;
    background-color: #ccc;
    border: 2px solid black;
    opacity: 0;
    animation-duration: 0.5s;
    animation-fill-mode: forwards;
  }
  .cuadro1 {
    animation-delay: 0.5s;
  }

  .cuadro2 {
    animation-delay: 1s;
  }

  .cuadro3 {
    animation-delay: 1.5s;
  }

  @keyframes mostrar-cuadro {
    from {
      opacity: 0;
      transform: translateY(100px);
    }
    to {
      opacity: 1;
      transform: translateY(0);
    }
  }

  .cuadro {
    animation-name: mostrar-cuadro;
  }
</style>
