<template>
  <div>
    <Navigatebar/>
    <div class="main">
      <Banner/>
      <div class="c-f1">
        <h3 class="w">合肥金雀医疗科技有限公司</h3>
        <p class="w">
          合肥金雀医疗科技有限公司是一家拟成立的高新技术产业公司，专注于研发临床麻醉决策智能辅助系统。致力于临床智慧医疗解决系统的研发、销售与维护。公司秉承生命为本，用人工智能助力麻醉医师守护患者的生命财产安全。
        </p>
      </div>
      <div class="c-f1">
        <h3 class="w">企业寓意</h3>
        <img class="logo" src="../assets/img/logo.png"/>
        <p class="w">
          “金雀”字样，代表我们金雀公司，有祥瑞、精确之意。整个logo采用蔚蓝色作为主题色，代表我们是一家面向未来的科技企业。左边的图形轮廓，既像一片绿叶，代表生命与健康，雀遇木而憩，树叶仿佛是金雀的家；又像一片丰满羽毛，与金雀公司的茁壮成长交相呼应。中间的十字，
          由两颗心相贴而成，代表了生命与关怀，寓意我们是一家“生命为本”的公司。“CANARY”字样，代表我们公司的英文名，说明我们是一家有国际化视野的民族企业。
        </p>
      </div>
    </div>
    <Footer/>
  </div>
</template>

<script>
import Navigatebar from '../components/Navigatebar.vue'
import Banner from '../components/Banner.vue'
import Footer from '../components/Footer.vue'

export default {

  name: 'Home',
  components: {
    Navigatebar,
    Banner,
    Footer,
  }
}
</script>

<style scoped>

</style>

