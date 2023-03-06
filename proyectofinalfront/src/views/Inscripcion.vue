<template>
    <main id="mainInscripcion">
        <section class="registro">
            <h4>Formulario de Registro en DreamGym Salamanca</h4>
            <form action="#">
                <input class="control-input" type="text" name="Nombre" id="nombreform" placeholder="Ingrese su Nombre">
                <input class="control-input" type="text" name="Apellidos" id="apellidosform"
                    placeholder="Ingrese sus Apellidos">
                <input class="control-input" type="text" name="Dni" id="dniform"
                    pattern="/^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$/i" placeholder="Introduzca su DNI"
                    title="El DNI debe tener ocho dígitos y una letra">
                <input class="control-input" type="text" name="Calle" id="calleform" placeholder="Introduzca su dirección"
                    pattern="C/\w{1,}Nº\d{1,}P[A-Z]" title="El formato debe ser C/NombreCalle Nºnum P letraPuerta">
                <input class="control-input" type="text" name="Ciudad" id="ciudadform"
                    placeholder="Introduzca su ciudad de residencia">
                <input class="control-input" type="text" name="CP" id="postalform" pattern="[0-9]{5}"
                    title="El código postal debe tener 5 dígitos" placeholder="Introduzca su código postal">
                <input class="control-input" type="text" name="País" id="paisform" placeholder="Introduzca su país">
                <input class="control-input" type="date" name="Fechanac" id="fechanacform"
                    placeholder="Fecha de nacimiento">
                <input class="control-input" type="email" name="Email" id="emailform" pattern="^[^@]+@[^@]+\.[a-zA-Z]{2,}$"
                    title="El email debe tener el formato tunombre@email.com"
                    placeholder="Introduzca su dirección de correo">
                <input class="control-input" type="password" name="Contraseña" id="passwordform"
                    pattern="_([a-zA-Z]){0,7}_([a-zA-Z]|\d){5}&\d{2}" placeholder="Introduzca una contraseña"
                    title="El formato debe ser _Max7letras_5letrasonum&2num">
                <label for="">Sexo:</label> <br>
                <label for="Hombre">Hombre</label> <input class="control-input" type="radio" name="sexo" value="h">
                <label for="Mujer">Mujer</label><input class="control-input" type="radio" name="sexo" value="m">
                <br>
                <p id="terminoscond">Estoy de acuerdo con los <a href="#">Términos y condiciones</a> </p> <br>
                <datalist id="Aficiones">
                    <option value="Dibujar"></option>
                    <option value="Bailar"></option>
                    <option value="Salir de fiesta"></option>
                    <option value="Montar en moto"></option>
                </datalist>

                <a href="../src/PaginaPrincipal.html"><input class="control-botones" type="button" value="Enviar"></a>
                <input class="control-botones" type="reset" value="Borrar información">
            </form>
        </section>
    </main>
    <footer>
        <div class="contenedor-footerall">
            <div class="contenedor-body">
                <div class="columna1">
                    <h1>Más información de la compañía</h1>
                    <p>
                        DreamGym Salamanca es un proyecto dedicado a las personas residentes
                        en Salamanca o alrededores las cuales quieran dar un cambio radical
                        en su vida, para aquellos que quieran sentirse realmente bien
                        consigo mismos y a la par quieran mantener un estilo de vida
                        saludable.
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
                        <label> <a href="mailto:dreamgymslmnc@dreamgymbussiness.com">Nuestro correo</a> </label>
                    </div>


                </div>

            </div>
        </div>
    </footer>
</template>
<script>

</script>
<style>
* {
  text-align: center;
margin: 0;
padding: 0;
  box-sizing: border-box;
}

  #mainInscripcion{
      background-image: url(../assets/img/Evening\ Sunshine.jpg);
      margin: 0;
  font-family: "open sans";
font-size: 15px;
  }
  .registro{
    width: 400px;
    background:#24303c ;
    padding-right: 50px;
    padding-left: 50px;
    margin: auto;
  border-radius: 4px;
  font-family: 'calibri';
  color: white;
  padding-top: 10px;
  box-sizing: 7px 13px 37px #000;
  
  }
  .registro h4{
    font-size: 22px;
    margin-bottom: 20px;
  }
  .registro p{
    height: 40px;
    text-align: center;
    font-size: 18px;
    line-height: 40px;
  }
  .registro a{
    color: white;
    text-decoration: none;
  }
  .registro a:hover{
    color: white;
    text-decoration: underline;
  }
  .registro .control-botones{
      width: 100%;
      background:#1f53c5;
      border:none;
      padding: 12px;
      color: white;
      margin: 16px 0;
      font-size: 16px;
  }
  .control-input{
  width:100% ;
  background: #24303c;
  padding:10px;
  border-radius: 4px;
  margin-bottom: 16px;
  border: 1px solid  #1f53c5;
  font-family: 'calibri';
  font-size: 18px;
  }
  /* INPUTS */
input:invalid{
  border-color: red;
  color: red;
  background: #fffafa;
  

  }
  .input[data-error]::after{
content: attr(data-error);
}  
  
  
  
      /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! */
</style>