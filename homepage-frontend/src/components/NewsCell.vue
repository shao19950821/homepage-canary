<template>
  <li>
    <div class="news_main_left">
      <img :src="newsItem.imageUrl">
    </div>
    <div class="news_main_right">
      <div class="news_main_rightTop">
        <router-link :to="{name: 'NewsDetail', params: {newsId: newsItem.id}}">
          <a>{{ newsItem.title }}</a>
        </router-link>
      </div>
      <div class="news_main_rightBottom">
        {{ newsItem.description }}
      </div>
      <div class="more_main">
        <router-link :to="{name: 'NewsDetail', params: {newsId: newsItem.id}}">
          <a>更多&gt;&gt;</a>
        </router-link>
      </div>
    </div>
  </li>
</template>

<script>
export default {
  name: 'NewsCell',
  props: {
    newsItem: Object
  },
  data() {
    return {}
  }
}
</script>

<style scoped>
@import "../assets/css/news.css";

</style>