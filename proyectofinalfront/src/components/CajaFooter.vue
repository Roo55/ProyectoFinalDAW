<template>
    <div class="contenedor-footer">
        <div class="footer">
            <div class="copyright">
                <p>© 2022 Todos los derechos reservados | DreamGym Salamanca</p> 
            </div>
            <div class="informacion">
                <a href=""> Información de la Compañía </a> |<a href="">
                    Privacidad y Políticas
                </a>
                | <a href=""> Términos y condiciones </a>
            </div>
        </div>
    </div>
</template>
<style>
  .contenedor-footer {
    width: 90%;
    top: 850px;
    background: #101010;
    padding: 20px;
    position: fixed;
    bottom: 10px;
    right: 55px;
    justify-content: center;
    z-index: 9999;
  }
  .copyright p{
    color: white;
  }
  .footer {
    max-width: 1200px;
    margin: auto;
    display: flex;
    justify-content: space-between;
    padding: 20px;
    margin-bottom: 1rem;
  }
</style>