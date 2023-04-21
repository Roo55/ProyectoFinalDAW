<template>
 
    <Header></Header>
    <router-view/>

 
</template>
<script>
import Header from './components/Header.vue'
export default{
  components:{Header}
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