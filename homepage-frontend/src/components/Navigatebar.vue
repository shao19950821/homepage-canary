<template>
  <div class="header" style="height: 80px">
    <div class="top-box" id="header">
      <img class="h-logo" src="../assets/img/logo.png" alt="">
      <ul class="h-nav">
        <li><router-link to="/home" >首页</router-link><i class="i-line"></i></li>
        <li><router-link to="hm-health.html?v=1.0">金雀医疗</router-link><i class="i-line"></i></li>
        <li><router-link to="/about">关于我们</router-link><i class="i-line"></i></li>
        <li><router-link to="/member">成员</router-link><i class="i-line"></i></li>
      </ul>

    </div>
  </div>
</template>

<script>

//
export default {
  name: "Navigatebar",
}


</script>
<style scope>
  @import "../assets/css/nav.css";
</style>