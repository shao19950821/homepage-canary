<template>
  <div>
    <el-upload class="upload-demo" action="auto" :http-request="uploadSectionFile" list-type="picture">
      <el-button size="small" type="primary">点击上传</el-button>
      <div slot="tip" class="el-upload__tip">只能上传jpg/png文件，且不超过2MB</div>
    </el-upload>
    <el-button size="small" type="primary" @click="upload">提交</el-button>
  </div>
</template>
<script>
export default {
  data() {
    return {
      uploadFile: ""
    };
  },
  methods: {
   
  }
};
</script>