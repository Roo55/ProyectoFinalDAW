<template>
  <h1>Nuestras tarifas</h1>
  <span class="linea"></span>
  <div id="body">
    <main>
      <div class="contenedor-tarifas">
        <div class="tabla">
          <h2>Mensual</h2>
          <img src="../assets/img/dumbbell.png" alt="">
          <h3>30 <sup>€</sup> </h3>
          <p>Si acabas de empezar tu cambio y deseas probarnos, esta tarifa es la tuya.</p>
          <button class="compra" v-on:click="mostrarPaywall(tarifas[0].precio)">Comprar</button>
        </div>
        <div class="tabla">
          <h2>Trimestral</h2>
          <img src="../assets/img/Tarifados.png" alt="">
          <h3>55 <sup>€</sup> </h3>
          <p>Si ya eres un iniciado y/o has probado ya nuestro gimnasio, esta tarifa es la tuya.</p>
          <p>15% de descuento</p>
          <button class="compra" v-on:click="mostrarPaywall(tarifas[1].precio)">Comprar</button>
        </div>
        <div class="tabla">
          <h2>Anual</h2>
          <img src="../assets/img/weightlifter.png" alt="">
          <h3>80 <sup>€</sup> </h3>
          <p>¡Sólo para valientes!</p>
          <p>Muestra tu lealtad ante nosotros, te otorgamos una camiseta del club, incluída en el precio final.</p>
          <p>20% de descuento</p>
          <button class="compra" v-on:click="mostrarPaywall(tarifas[2].precio)">Comprar</button>
        </div>
      </div>
    </main>
  </div>
</template>

<script>
export default {
  data() {
    return {
      tarifas: [
        { id: 1, nombre: "Principiantes", precio: 30 },
        { id: 2, nombre: "Intermedios", precio: 55 },
        { id: 3, nombre: "Avanzados", precio: 80 },
      ],
    };
  },
  methods: {
    mostrarPaywall(precio) {
      this.$router.push({ name: "paywall", state: { precio: precio } });
    },
  },
};
</script>
<style>
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    
}
.linea{
    background: #550b51;
    height: 5px;
    width: 100%;
    display: block;
    margin-bottom: 2rem;
}
#body{
    background:white ;
    font-family: 'open sans';
    font-size: 15px;
}
/* Tablas */
.contenedor-tarifas{
    width: 90%;
    max-width: 900px;
    margin: auto;
    height: 68vh;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-wrap: wrap;
    
}
.tabla{
    width: 33%;
    height: 600px;
    margin: auto;
    padding: 60px;
    border: 1px solid #3a3e6b;
    border-radius: 4px;
    box-shadow: 0px 0px 4px 0px #3a3e6b;
    text-align: center;
    flex-grow: 1;
    color: #40436b;
    font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}
.tabla>h2{
    margin-bottom: 35px;
    font-size: 30px;
}
.tabla>h3{
    font-size: 30px;
    margin-bottom: 20px;
}
.tabla>p{
    display: block;
    margin-bottom: 20px;
}
.tabla img{
    width: 64%;
    margin-bottom: 30px;
}
.tabla:hover{
    background: #2b2e4d;
    color: #f1f1f2;
    transform: scale(1.1);
    transition: 0.8s all;
    cursor: pointer;
}
/* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! */
/* BOTON LO QUIERO */
.compra{
    width: 150px;
    display: inline-block;
    margin: auto;
    padding: 12px;
    background: #9be94d;
    text-decoration: none;
    text-align: center;
    color: #2b2e4d;
    border-radius: 100px;
    font-size: 12px;
    font-weight: 600;
}

</style>