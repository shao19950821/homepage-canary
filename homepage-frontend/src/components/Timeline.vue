<template>
  <div class="about-main2">
    <div class="licheng-bg">
      <img src="../assets/img/lc-quxian.png" class="quxian" />
      <div class="warper pr">
        <div class="ny-title">
          <h3 class="title-en">DEVELOPMENT</h3>
          <h4 class="title-ch">发展历程</h4>
          <i></i>
        </div>
        <div class="licheng-content swiper-container">
          <div class="swiper-wrapper">
            <div class="swiper-slide">
              <ul class="clearfix">
                <li class="item1">
                  <a class="clearfix">
                    <div class="lc-left">
                      <i class="line"></i> <span class="date">2018</span>
                    </div>
                    <div class="lc-right">
                      <div class="right-text">
                        <h3>团队成立</h3>
                        <p>2018年，"法明家"团队成立，团队成员均为金雀医疗核心成员。</p>
                      </div>
                    </div>
                  </a>
                </li>
                <li class="item2">
                  <a class="clearfix">
                    <div class="lc-left">
                      <span class="date">2018</span>
                      <i class="line"></i> </div>
                    <div class="lc-right">
                      <div class="right-text">
                        <h3>公司更名</h3>
                        <p>根据许可《关于核准某某某有限公司变更注册资本和股权的批复》，公司注册资本增加至2亿元，由上海某某某有限公司控股，公司名称变更为某某某有限公司。</p>
                      </div>
                    </div>
                  </a>
                </li>
                <li class="item3">
                  <a class="clearfix">
                    <div class="lc-left">
                      <i class="line"></i> <span class="date">2013</span>
                    </div>
                    <div class="lc-right">
                      <div class="right-text">
                        <h3>获得投资咨询业务资格</h3>
                        <p>根据吉林某某某，公司获得投资咨询业务资格。</p>
                      </div>
                    </div>
                  </a>
                </li>
                <li class="item4">
                  <a class="clearfix">
                    <div class="lc-left">
                      <span class="date">2014</span>
                      <i class="line"></i> </div>
                    <div class="lc-right">
                      <div class="right-text">
                        <h3>公司增资，迁址，获得资管资格</h3>
                        <p>根据文件某某某，公司迁址上海市；注册资本增加至6亿元人民币；取得某某某管理业务资格</p>
                      </div>
                    </div>
                  </a>
                </li>
                <li class="item5">
                  <a class="clearfix">
                    <div class="lc-left">
                      <i class="line"></i> <span class="date">2015</span>
                    </div>
                    <div class="lc-right">
                      <div class="right-text">
                        <h3>子公司成立</h3>
                        <p>2015年1月15日，成立风险管理子公司某某某有限公司；2105年10月30日，成立上海某某某有限公司。</p>
                      </div>
                    </div>
                  </a>
                </li>
              </ul>
            </div>
            <div class="swiper-slide">
              <ul class="clearfix">
                <li class="item1">
                  <a class="clearfix">
                    <div class="lc-left">
                      <i class="line"></i> <span class="date">2017</span>
                    </div>
                    <div class="lc-right">
                      <div class="right-text">
                        <h3>成为中国某某某交易中心会员</h3>
                        <p>2017年5月，公司成为上海某某某中心首批会员</p>
                      </div>
                    </div>
                  </a>
                </li>
                <li class="item2">
                  <a class="clearfix">
                    <div class="lc-left">
                      <span class="date" style="text-align: center">2019.05.16</span>
                      <i class="line"></i> </div>
                    <div class="lc-right">
                      <div class="right-text">
                        <h3>公司更名</h3>
                        <p>根据许可《关于核准某某某有限公司变更注册资本和股权的批复》，公司注册资本增加至2亿元，由上海某某某有限公司控股，公司名称变更为某某某有限公司。</p>
                      </div>
                    </div>
                  </a>
                </li>
              </ul>
            </div>
          </div>
          <!--按钮-->
          <div class="lc-swiper-btn">
            <a class="btn-prev fl" @click="prevSlide"><i class="iconfont">&#xe685;</i></a>
            <a class="btn-next fr" @click="nextSlide"><i class="iconfont">&#xe687;</i></a>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script src="../assets/js/swiper.min.js" type="text/javascript" charset="utf-8"></script>
<script>
import Swiper from "../assets/js/swiper.min"
export default {
  name: "Timeline",
  mounted() {
    this.mySwiper =  new Swiper('.swiper-container.licheng-content', {
      autoplay: false, //自动滑动
    })
  },
  methods:{
    prevSlide:function (){
      this.mySwiper.swipePrev();
    },
    nextSlide:function (){
      this.mySwiper.swipeNext();
    }
  }
}
</script>

<style scoped>
@import "../assets/css/timeline.css";
@import "../assets/css/font/iconfont.css";
@import "../assets/css/swiper.min.css";
.about-main2 {
  width: 100%;
  height: 890px;
  background-image: url(../assets/img/lc_bg.jpg);
}

</style>