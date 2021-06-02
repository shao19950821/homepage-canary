<template>
  <div>
    <div class="m-content">

      <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
        <el-form-item label="标题" prop="title">
          <el-input v-model="ruleForm.title"></el-input>
        </el-form-item>

        <el-form-item label="摘要" prop="description">
          <el-input type="textarea" v-model="ruleForm.description"></el-input>
        </el-form-item>

        <el-upload class="upload-demo" action="auto" :http-request="uploadSectionFile" list-type="picture">
          <el-button size="small" type="primary">点击上传</el-button>
          <div slot="tip" class="el-upload__tip">标题图片，只能上传jpg/png文件，且不超过2MB</div>
        </el-upload>

        <el-form-item label="内容" prop="content">
          <mavon-editor v-model="ruleForm.content" ref="md" @imgAdd="$imgAdd"></mavon-editor>
        </el-form-item>

        <el-form-item>
          <el-button type="primary" @click="submitForm('ruleForm')">立即创建</el-button>
          <el-button @click="resetForm('ruleForm')">重置</el-button>
        </el-form-item>
      </el-form>

    </div>


  </div>
</template>

<script>
export default {
  name: "NewsEdit",
  data() {
    return {
      ruleForm: {
        id: '',
        title: '',
        description: '',
        content: '',
        imageUrl: ''
      },
      rules: {
        title: [
          {required: true, message: '请输入标题', trigger: 'blur'},
          {min: 3, max: 25, message: '长度在 3 到 25 个字符', trigger: 'blur'}
        ],
        description: [
          {required: true, message: '请输入摘要', trigger: 'blur'}
        ],
        content: [
          {trequired: true, message: '请输入内容', trigger: 'blur'}
        ]
      }
    };
  },
  methods: {
    uploadSectionFile(param) {
      let fileObj = param.file;
      const isLt2M = fileObj.size / 1024 / 1024 < 2;
      if (!isLt2M) {
        this.$message.error("上传头像图片大小不能超过 2MB!");
        return;
      }
      if (fileObj.type === "image/jpeg") {
        this.uploadFile = new File([fileObj], new Date().getTime() + ".jpg", {
          type: "image/jpeg"
        });
      } else if (fileObj.type === "image/png") {
        this.uploadFile = new File([fileObj], new Date().getTime() + ".png", {
          type: "image/png"
        });
      } else {
        this.$message.error("只能上传jpg/png文件");
        return;
      }
      var formData = new FormData(); // FormData 对象
      formData.append("file", this.uploadFile); // 文件对象
      this.$axios.post("/image/upload", formData).then(res => {
        console.log(res)
        if (res.data.code == 200) {
          this.ruleForm.imageUrl = res.data.data
          this.$message({
            message: '上传成功',
            type: 'success'
          });
        }
      })
    },
    $imgAdd(pos, $file) {
      // 封装数据
      var formData = new FormData()
      formData.append('file', $file)
      // 上传图片给后台
      this.$axios.post('/image/upload', formData).then(res => {
        if (res.data.code == 200) {
          this.$message({
            message: '上传成功',
            type: 'success'
          });
          //用来替换文章中的图片方法。将后台返回的图片地址把编辑器中的图片进行替换
          this.$refs.md.$img2Url(pos, res.data.data)
        }
      })
    },
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          const _this = this
          console.log(this.ruleForm)
          this.$axios.post('/news/create', this.ruleForm,).then(res => {
            console.log(res)
            _this.$alert('操作成功', '提示', {
              confirmButtonText: '确定',
              callback: action => {
                _this.$router.push("/news")
              }
            });
          })
        } else {
          console.log('error submit!!');
          return false;
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    }
  }
  ,
}
</script>

<style scoped>
.m-content {
  text-align: center;
}
</style>