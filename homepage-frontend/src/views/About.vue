<template>
  <div>
    <Navigatebar/>
    <div class="main">
      <Banner/>
      <div class="c-f1">
        <div class="fenxi-pt35">
          <h3>使命及愿景
          </h3>
          <p class="title-eng">Mission and vision</p>
          <div class="container fenxi-mt50 dutyWish_con">
            <div class="dutyWish">
              <div class="dutyWish_common dutyWish_left">
                <p class="dutyWish_pic"><img class="duty_img" src="../assets/img/duty1.png"></p>
                <div class="dutyWish_word">
                  <p>使命</p>
                  <p>生命为本，改变世界</p>
                </div>
              </div>
              <div class="dutyWish_common dutyWish_right">
                <p class="dutyWish_pic"><img class="duty_img" src="../assets/img/duty2.png"></p>
                <div class="dutyWish_word">
                  <p>愿景</p>
                  <p>成为一家活到22世纪的公司</p>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="fenxi-pt35">
          <div class="title">
            <h3>产品介绍</h3>
            <p class="title-eng">Product Profile</p>
          </div>
          <div class="container fenxi-mt50">
            <div class="aboutCont sec1-cont">
              <div class="left">
                <p>&nbsp; &nbsp; &nbsp;项目产品所服务的一般业务场景是手术室，为麻醉医师、患者、医院业务管理人员提供信息化、智能化的人工智能临床麻醉业务辅助治疗服务。系统以软件形式嵌入手术室的麻醉医师工作站，运用先进的数据监测技术：自动采集监护仪、麻醉机、呼吸机、血气分析仪等诊疗设备的数据，这些标准化的数据为患者生命体征挖
                  掘、突发事件预警、病症-病因相关知识推荐、辅助决策建议提供了先决条件。人工智能麻醉辅助系统关注临床情境数据、知识工程、麻醉质量控制，实现以“患者
                  的生命安全为中心”，以“知识共享为模式”，以“同质化流程为核心”，以“情境个性化、服务人性化为原则” 的闭环设计，开创智慧临床，构建智慧手术室，打造智慧医院。</p>
                <p>&nbsp; &nbsp; &nbsp;系统自动采集监护仪、麻醉剂、呼吸机、血气分析仪等诊疗设备的数据，通过监测患者的生命体征信息、麻醉指令等，评估患者的生命状况。如果患者的生命体征发生异动，启动应急预警程序提醒手术室的麻醉医师，同时医院信息中台显示突
                  发事件预警，医院管理者通过判断事件类型合理地支援目标手术室。在手术过程中
                  遭遇不良反应事件时，依托专家经验、指南知识、专科教材所构建的知识库，分析 患者的病症、病因，向麻醉医师推荐相关知识。麻醉医师根据系统提示判断病因并
                  选择相关知识点，辅助系统端到端提供麻醉医师显式决策建议，并根据麻醉医师对 决策建议的反馈与实操，追踪麻醉医师的诊断路径，精细化知识推荐与决策建议， 如此交互迭代，建立一种良好的人机协同的决策辅助机制。
                  本项目的应用与推广将成为推动医疗服务模式升级、转型的重要动力，社会效益巨大。</p>
                <p><br></p></div>
              <div class="right">
                <img src="../assets/img/product.png">
              </div>
            </div>
          </div>

        </div>
        <div class=" fenxi-pt35">
          <div class="title">
            <h3>金雀医疗荣誉 </h3>
            <p class="title-eng">Honors</p>
          </div>
          <div class="container">
            <div class="cont">
              <div class="fenxi-mt50">
                <div class="honors-title">
                  <img class="honor_img" src="../assets/img/honors-c2.png">
                  <h4>金雀医疗荣誉</h4>
                </div>
                <ul class="honors-list">
                  <li>教育部自然科学一等奖</li>
                  <li>吴文俊人工智能科技进步一等奖</li>
                  <li>大数据世界杯KDD Cup奖项</li>
                  <li>知识工程领域高水平学术会议KSEM最佳论文</li>
                  <li>数据挖掘高水平学术会议CCDM最佳论文奖</li>
                  <li>项目组同学利用大数据破解防疫四大难题被江淮晨报报道</li>
                  <li>中国创青春大学生创新创业大赛安徽省金奖</li>
                </ul>
              </div>
            </div>
          </div>
        </div>
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
  name: 'About',
  components: {
    Navigatebar,
    Banner,
    Footer,
  }
}
</script>

<style scoped>
@import "../assets/css/about.css";
</style>