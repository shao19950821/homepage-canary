<template>
  <div class="news_main">
    <div id="dynamics" class="news_right">
      <ul style="list-style:none;" v-for="(item,key) in newsList">
        <NewsCell :newsItem="item" :key="key"></NewsCell>
      </ul>
    </div>
    <el-pagination class="mpage"
                   background
                   :current-page="currentPage"
                   :page-size="pageSize"
                   :total="total"
                   @current-change=page>
    </el-pagination>
  </div>
</template>

<script>
import NewsCell from './NewsCell.vue'

export default {
  name: "NewsList",
  components: {
    NewsCell
  },
  data() {
    return {
      newsList: {},
      currentPage: 1,
      total: 0,
      pageSize: 5
    }
  },
  methods: {
    page(currentPage) {
      const _this = this
      _this.$axios.get("/news?currentPage=" + currentPage).then(res => {
        console.log(res)
        _this.newsList = res.data.data.records
        _this.currentPage = res.data.data.current
        _this.total = res.data.data.total
        _this.pageSize = res.data.data.size
      })
    }
  },
  created() {
    this.page(1)
  }
}
</script>

<style scoped>
.mpage {
  margin: 0 auto;
  text-align: center;
}
</style>