<template>
  <div>
    <Navigatebar></Navigatebar>
    <Banner></Banner>
    <NewsContent></NewsContent>
    <Footer></Footer>
  </div>
</template>

<script>
import Navigatebar from "../components/Navigatebar";
import Footer from '../components/Footer.vue'
import Banner from '../components/Banner.vue'
import NewsContent from '../components/NewsContent.vue'

export default {
  name: "NewsDetail",
  components: {
    Navigatebar,
    Banner,
    Footer,
    NewsContent
  },
}
</script>

<style scoped>
@import "../assets/css/news-detail.css";
</style>