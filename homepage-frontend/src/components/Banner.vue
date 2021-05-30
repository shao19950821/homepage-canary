<template>
  <div class="swiper-container">
    <div class="swiper-wrapper">
      <div id="xzk" class="swiper-slide">
        <el-carousel indicator-position="outside" height="600px">
          <el-carousel-item v-for="item in 3" :key="item">
            <img class="banner" width="100%" height="100%" :src="Get_Banner(item)"/>
          </el-carousel-item>
        </el-carousel>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: "Banner",
  methods:{
    Get_Banner(index){
      return require("@/assets/img/banner" + index + ".jpg")
    }
  }
}
</script>

<style scoped>
.el-carousel__container {
  position: relative;
  height: 600px;
}
.swiper-wrapper .swiper-slide .banner:hover{
  cursor: pointer;
  transition: all 1.1s;
  transform:scale(1.1);
}
.swiper-slide {
  width: 100%;
  height: auto;
  /*background-image: url(../../static/net/img/banner.png);*/
}
</style>