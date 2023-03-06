<template>
 
    <Header></Header>
    <CajaFooter></CajaFooter>
    <router-view/>

 
</template>
<script>
import Header from './components/Header.vue'
import CajaFooter from './components/CajaFooter.vue'
export default{
  components:{Header,CajaFooter}
}
</script>
<style>
#nav {
  display: flex;
  flex-direction: column;
  background-color: #333;
  text-align: center;
  float: left;
  height: 100%;
}

.nav-link {
  display: block;
  margin-bottom: 10px;  
  text-decoration: none;
  color: white;
}
.sub{
  color: aquamarine;
}

</style>