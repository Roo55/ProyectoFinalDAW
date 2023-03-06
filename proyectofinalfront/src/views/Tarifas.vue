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
        <a href="" class="compra">¡Lo quiero!</a>
    </div>
    <div class="tabla">
        <h2>Trimestral</h2>
        <img src="../assets/img/Tarifados.png" alt="">
        <h3>55 <sup>€</sup> </h3>
        <p>Si ya eres un iniciado y/o has probado ya nuestro gimnasio, esta tarifa es la tuya.</p>
        <p>15% de descuento</p>
        <a href="" class="compra">¡Lo quiero!</a>
    </div>
    <div class="tabla">
        <h2>Anual</h2>
        <img src="../assets/img/weightlifter.png" alt="">
        <h3>80 <sup>€</sup> </h3>
        <p>¡Sólo para valientes!</p>
        <p>Muestra tu lealtad ante nosotros, te otorgamos una camiseta del club, incluída en el precio final.</p>
        <p>20% de descuento</p>
        <a href="" class="compra">¡Lo quiero!</a>
    </div>
</div>
</main>
    <footer>
        <div class="contenedor-footerall">
            <div class="contenedor-body">
                <div class="columna1">
                    <h1>Más información de la compañía</h1>
                    <p>
                        DreamGym Salamanca es un proyecto dedicado a las personas
                        residentes en Salamanca o alrededores las cuales quieran dar un
                        cambio radical en su vida, para aquellos que quieran sentirse
                        realmente bien consigo mismos y a la par quieran mantener un
                        estilo de vida saludable.
                    </p>
                </div>
                <div class="columna2">
                    <h1>Síguenos en redes para no perderte nada</h1>
                    <div class="fila1">
                        <img src="../assets/img/facebook.png" alt="" />
                        <label> <a href=""> Síguenos en Facebook</a></label>
                    </div>
                    <div class="fila1">
                        <img src="../assets/img/twitter.png" alt="" />
                        <label> <a href=""> Síguenos en Twitter</a></label>
                    </div>
                    <div class="fila1">
                        <img src="../assets/img/instagram.png" alt="" />
                        <label> <a href=""> Síguenos en Instagram</a></label>
                    </div>
                    <div class="fila1">
                        <img src="../assets/img/google-plus.png" alt="" />
                        <label> <a href=""> Síguenos en Google Plus</a></label>
                    </div>
                    <div class="fila1">
                        <img src="../assets/img/pinterest.png" alt="" />
                        <label> <a href=""> Síguenos en Pinterest</a></label>
                    </div>
                </div>
                <div class="columna3">
                    <h1>Contacto</h1>
                    <div class="fila2">
                        <img src="../assets/img/house.png" />
                        <label>Salamanca, Calle Los Agradecidos 9 37002, España </label>
                    </div>
                    <div class="fila2">
                        <img src="../assets/img/smartphone.png" />
                        <label>923608327</label>
                    </div>
                    <div class="fila2">
                        <img src="../assets/img/contact.png" />
                        <label>
                            <a href="mailto:dreamgymslmnc@dreamgymbussiness.com">Nuestro correo</a>
                        </label>
                    </div>
                </div>
            </div>
        </div>
    </footer>
</div>
</template>
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