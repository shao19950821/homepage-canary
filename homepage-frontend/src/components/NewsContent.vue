<template>
  <div class="news_content">
    <div class="content_left" align="center">
      <h2>{{newsItem.title}}</h2>
      <div class="markdown-body" v-html="newsItem.content"></div>
    </div>
    <div class="content_right">
      <p>关注金雀医疗官网</p>
      <p> 第一时间获取金雀医疗资讯</p>
    </div>
  </div>
</template>

<script>
export default {
  name: "NewsContent",
  data() {
    return {
      newsItem: {
        id: "",
        title: "",
        content: ""
      },
      ownBlog: false
    }
  },
  created() {
    const newsId = this.$route.params.newsId
    console.log(newsId)
    const _this = this
    this.$axios.get('/news/' + newsId).then(res => {
      const newsItem = res.data.data
      _this.newsItem.id = newsItem.id
      _this.newsItem.title = newsItem.title
      var htmlContent = this.converter.makeHtml(newsItem.content)
      console.log(htmlContent)
      _this.newsItem.content = htmlContent
    })
  }
}
</script>

<style scoped>

</style>