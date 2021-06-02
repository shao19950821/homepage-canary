<template>
  <div>
    <Navigatebar/>
    <Timeline/>
    <Footer/>
  </div>
</template>

<script>
import Navigatebar from '../components/Navigatebar.vue'
import Timeline from '../components/Timeline.vue'
import Footer from '../components/Footer.vue'

export default {
  name: "Development",
  components: {
    Navigatebar,
    Timeline,
    Footer,
  }
}
</script>

<style scoped>

</style>