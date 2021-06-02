<template>
  <div>
    <Navigatebar></Navigatebar>
    <Banner></Banner>
    <NewsList></NewsList>
    <Footer></Footer>
  </div>
</template>

<script>
import Navigatebar from "../components/Navigatebar";
import Footer from '../components/Footer.vue'
import Banner from '../components/Banner.vue'
import NewsList from '../components/NewsList.vue'

export default {
  name: "NewsCenter",
  components: {
    Navigatebar,
    Banner,
    Footer,
    NewsList
  },
}
</script>

<style scoped>

</style>