<template>
  <div>
    <Navigatebar/>
    <div class="c-f1">
      <el-row>
        <el-row style="margin: 30px 0px 10px 0px">
          <label style="font-size: 20px">指导老师</label>
        </el-row>
        <el-row v-for="Row_Index in Math.ceil(member_data.teachers.length/3)" :key="'T_R_' + Row_Index"
                style="margin-left: 10vw; margin-right: 10vw; padding-left: 3vw">
          <el-col :span="7" v-if="(Row_Index - 1) * 3 + 0 < member_data.teachers.length" class="Teacher_Card">
            <el-row>
              <img class="img_background_teacher" src="../assets/img/members/陈恩红.jpg" style="border-radius: 50%"
                   alt="暂无图片">
            </el-row>
            <el-row style="padding-top: 20px">
              <label style="font-size: 18px">{{ member_data.teachers[(Row_Index - 1) * 3 + 0].name }}</label>
            </el-row>
            <el-row style="padding-top: 10px">
              <span><i class="el-icon-message"
                       style="color: #409EFD; font-size: 16px; margin-right: 15px"></i>{{
                  member_data.teachers[(Row_Index - 1) * 3 + 0].mail
                }}</span>
            </el-row>
            <el-row style="padding-top: 10px">
              <span><i class="el-icon-s-home" style="color: #409EFD; font-size: 16px; margin-right: 15px"></i><el-link
                  :href="member_data.teachers[(Row_Index - 1) * 3 + 0].page" :underline="false"
                  target="_blank">{{ member_data.teachers[(Row_Index - 1) * 3 + 0].name }}的个人主页</el-link></span>
            </el-row>
            <el-row style="padding-top: 10px">
              <p style="white-space: pre-line; line-height: 30px; text-align: left;">
                {{ member_data.teachers[(Row_Index - 1) * 3 + 0].intro }}</p>
            </el-row>
          </el-col>
          <el-col :span="7" :offset="1" v-if="(Row_Index - 1) * 3 + 1 < member_data.teachers.length"
                  class="Teacher_Card">
            <el-row>
              <img class="img_background_teacher" src="../assets/img/members/刘淇.jpg" style="border-radius: 50%"
                   alt="暂无图片">
            </el-row>
            <el-row style="padding-top: 20px">
              <label style="font-size: 18px">{{ member_data.teachers[(Row_Index - 1) * 3 + 1].name }}</label>
            </el-row>
            <el-row style="padding-top: 10px">
              <span><i class="el-icon-message"
                       style="color: #409EFD; font-size: 16px; margin-right: 15px"></i>{{
                  member_data.teachers[(Row_Index - 1) * 3 + 1].mail
                }}</span>
            </el-row>
            <el-row style="padding-top: 10px">
              <span><i class="el-icon-s-home" style="color: #409EFD; font-size: 16px; margin-right: 15px"></i><el-link
                  :href="member_data.teachers[(Row_Index - 1) * 3 + 1].page" :underline="false"
                  target="_blank">{{ member_data.teachers[(Row_Index - 1) * 3 + 1].name }}的个人主页</el-link></span>
            </el-row>
            <el-row style="padding-top: 10px">
              <p style="white-space: pre-line; line-height: 30px; text-align: left;">
                {{ member_data.teachers[(Row_Index - 1) * 3 + 1].intro }}</p>
            </el-row>
          </el-col>
          <el-col :span="7" :offset="1" v-if="(Row_Index - 1) * 3 + 2 < member_data.teachers.length"
                  class="Teacher_Card">
            <el-row>
              <img class="img_background_teacher" src="../assets/img/members/谢言虎.jpg" style="border-radius: 50%"
                   alt="暂无图片">
            </el-row>
            <el-row style="padding-top: 20px">
              <label style="font-size: 18px">{{ member_data.teachers[(Row_Index - 1) * 3 + 2].name }}</label>
            </el-row>
            <el-row style="padding-top: 10px">
              <p style="white-space: pre-line; line-height: 30px; text-align: left;">
                {{ member_data.teachers[(Row_Index - 1) * 3 + 2].intro }}</p>
            </el-row>
          </el-col>
        </el-row>
        <el-divider></el-divider>
        <el-row style="margin: 30px 0px 30px 0px">
          <label style="font-size: 20px">团队成员</label>
        </el-row>
        <el-row v-for="Row_Index in Math.ceil(member_data.students.length/3)" :key="'S_R_' + Row_Index"
                style="margin-left: 10vw; margin-right: 10vw; padding-left: 3vw">
          <el-col :span="7" v-if="(Row_Index - 1) * 3 + 0 < member_data.students.length" class="Student_Card">
            <el-row>
              <img class="img_background_student" :src="Get_Student_Img(Row_Index, 0)" style="border-radius: 50%"
                   alt="暂无图片">
            </el-row>
            <el-row style="padding-top: 20px">
              <label style="font-size: 18px">{{ member_data.students[(Row_Index - 1) * 3 + 0].name }}</label>
            </el-row>
            <el-row style="padding-top: 10px">
              <span><i class="el-icon-message"
                       style="color: #409EFD; font-size: 16px; margin-right: 15px"></i>{{
                  member_data.students[(Row_Index - 1) * 3 + 0].mail
                }}</span>
            </el-row>
            <el-row style="padding-top: 10px">
              <span
                  style="white-space: pre-line; line-height: 30px; ">{{
                  member_data.students[(Row_Index - 1) * 3 + 0].intro
                }}</span>
            </el-row>
          </el-col>
          <el-col :span="7" :offset="1" v-if="(Row_Index - 1) * 3 + 1 < member_data.students.length"
                  class="Student_Card">
            <el-row>
              <img class="img_background_student" :src="Get_Student_Img(Row_Index, 1)" style="border-radius: 50%"
                   alt="暂无图片">
            </el-row>
            <el-row style="padding-top: 20px">
              <label style="font-size: 18px">{{ member_data.students[(Row_Index - 1) * 3 + 1].name }}</label>
            </el-row>
            <el-row style="padding-top: 10px">
              <span><i class="el-icon-message"
                       style="color: #409EFD; font-size: 16px; margin-right: 15px"></i>{{
                  member_data.students[(Row_Index - 1) * 3 + 1].mail
                }}</span>
            </el-row>
            <el-row style="padding-top: 10px">
              <span
                  style="white-space: pre-line; line-height: 30px; ">{{
                  member_data.students[(Row_Index - 1) * 3 + 1].intro
                }}</span>
            </el-row>
          </el-col>
          <el-col :span="7" :offset="1" v-if="(Row_Index - 1) * 3 + 2 < member_data.students.length"
                  class="Student_Card">
            <el-row>
              <img class="img_background_student" :src="Get_Student_Img(Row_Index, 2)" style="border-radius: 50%"
                   alt="暂无图片">
            </el-row>
            <el-row style="padding-top: 20px">
              <label style="font-size: 18px">{{ member_data.students[(Row_Index - 1) * 3 + 2].name }}</label>
            </el-row>
            <el-row style="padding-top: 10px">
              <span><i class="el-icon-message"
                       style="color: #409EFD; font-size: 16px; margin-right: 15px"></i>{{
                  member_data.students[(Row_Index - 1) * 3 + 2].mail
                }}</span>
            </el-row>
            <el-row style="padding-top: 10px">
              <span
                  style="white-space: pre-line; line-height: 30px; ">{{
                  member_data.students[(Row_Index - 1) * 3 + 2].intro
                }}</span>
            </el-row>
          </el-col>
        </el-row>
      </el-row>

    </div>

    <Footer/>
  </div>
</template>

<script>
import Navigatebar from '../components/Navigatebar.vue'
import Footer from '../components/Footer.vue'

export default {
  name: "Member",
  components: {
    Navigatebar,
    Footer,
  },
  data() {
    return {
      member_data: {
        "teachers": [
          {
            "intro": "陈恩红，博士，教授，博导，国家杰出青年基金获得者，科技部重点领域创新团队负责人，CCF会士。中国科学技术大学计算机科学与技术学院副院长，语音及语言信息处理国家工程实验室副主任，大数据分析及应用安徽省重点实验室主任。",
            "mail": "cheneh@ustc.edu.cn",
            "name": "陈恩红",
            "page": "http://staff.ustc.edu.cn/~cheneh"
          },
          {
            "intro": "刘淇，特任教授，博导，中国计算机学会(CCF)大数据专家委员会委员、中国人工智能学会(CAAI)机器学习专委会委员、中科院青年创新促进会优秀会员、IEEE/ACM会员。",
            "mail": "qiliuql@ustc.edu.cn",
            "name": "刘淇",
            "page": "http://staff.ustc.edu.cn/~qiliuql"
          },
          {
            "intro": "中国科学技术大学附属第一医院（安徽省立医院）麻醉科副主任。安徽省医师 协会麻醉科医师分会常委，安徽省医学会麻醉学分会常委，安徽省中西医结合学会麻醉学专业委员会常委，安徽省医学会疼痛学分会常委，安徽省医师协会疼痛科医师分会副主委，安徽省医学会麻醉学分会超声学组副组长。",
            "name": "谢言虎",
          },
        ],
        "students": [
          {
            "name": "程明月",
            "mail": "mycheng@mail.ustc.edu.cn",
            "intro": "程明月，男，中国科学技术大学大数据学院数据在读博士。研究方向包括医疗 大数据分析与挖掘、人工智能、推荐系统。"
          },
          {
            "name": "于润龙",
            "mail": "yrunl@mail.ustc.edu.cn",
            "intro": "于润龙，男，中国科学技术大学计算机学院在读博士。研究兴趣包括医疗大数 据、推荐系统、自然计算等。"
          },
          {
            "name": "武晗",
            "mail": "wuhanhan@mail.ustc.edu.cn",
            "intro": "武晗，女，中国科学技术大学计算机学院在读博士。研究兴趣包括大数据、数据挖掘与知识发现，尤其是针对知识产权保护方面的专利数据挖掘。"
          },
          {
            "name": "李徵",
            "mail": "zhili03@mail.ustc.edu.cn",
            "intro": "李徵，男，中国科学技术大学大数据学院在读博士。研究兴趣包括医疗大数据、 推荐系统、工业智能等。"
          },
          {
            "name": "何文强",
            "mail": "wenqianghe@mail.ustc.edu.cn",
            "intro": "何文强，男，中国科学技术大学大数据学院应用统计在读硕士。研究兴趣包括 医疗大数据，金融科技，社会计算等，具有计算机和统计的交叉学科背景"
          },
          {
            "name": "张富康",
            "mail": "1148155368@qq.com",
            "intro": "张富康，男，合肥工业大学经济学本科在读。研究兴趣包括财务分析、创新创 业、市场调查等。"
          },
          {
            "name": "张裕人",
            "mail": "yr160698@mail.ustc.edu.cn",
            "intro": "张裕人，男，中国科学技术大学计算机学院在读硕士。研究兴趣主要包括推荐系统、自然语言处理等。"
          },
          {
            "name": "邵期翔",
            "mail": "qixiangshao@mail.ustc.edu.cn",
            "intro": "邵期翔，男，中国科学技术大学计算机学院在读硕士。研究兴趣包括推荐系统、 计算广告、AutoML 等。"
          },
          {
            "name": "吴桐",
            "mail": "qyt@mail.ustc.edu.cn",
            "intro": "吴桐，男，中国科学技术大学少年班学院在读大四本科生。研究兴趣包括数学、 大数据等。"
          },

        ],

      }
    }
  },
  methods: {
    ToTop() {
      window.scrollTo(0, 0);
    },
    Get_Student_Img(row, index) {
      var i = (row - 1) * 3 + index
      var student = this.member_data.students[i];
      return require("@/assets/img/members/" + student.name + ".jpg")

    },
    Get_Teacher_Img(row, index) {
      var i = (row - 1) * 3 + index
      var teacher = this.member_data.teachers[i];
      if (this.member_data.img_path[teacher.name]) {
        return require(this.member_data.img_path[teacher.name])
      } else {
        return require("../assets/img/members/unknown.png")
      }
    },
  }
}
</script>

<style scoped>
.img_background_teacher {
  margin-top: 30px;
  background-repeat: no-repeat;
  background-position: center center;
  background-size: cover;
  width: 240px;
  height: 240px;
  object-fit: cover;
}

.img_background_student {
  background-repeat: no-repeat;
  background-position: center center;
  background-size: cover;
  width: 120px;
  height: 120px;
  object-fit: cover;
}

.Teacher_Card {
  padding: 2vh 2vw 5vh 2vw;
  height: 650px;
  margin-bottom: 50px;
  -webkit-box-shadow: 8px 10px 12px rgba(25, 25, 25, 0.1);
  box-shadow: 8px 10px 12px rgba(25, 25, 25, 0.1);
  border-radius: 40px;
  background: #F8FBFF;
}

.Student_Card {
  padding: 2vh 2vw 5vh 2vw;
  height: 360px;
  margin-bottom: 50px;
  -webkit-box-shadow: 8px 10px 12px rgba(25, 25, 25, 0.1);
  box-shadow: 8px 10px 12px rgba(25, 25, 25, 0.1);
  border-radius: 40px;
  background: #F8FBFF;
}

.el-divider--horizontal {
  display: block;
  height: 2px;
  width: 90vw;
  margin: 10px 5vw;
}
</style>