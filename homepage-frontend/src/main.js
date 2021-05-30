import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import Element from 'element-ui'
import axios from 'axios'
import mavonEditor from 'mavon-editor'
import "element-ui/lib/theme-chalk/index.css"
import 'mavon-editor/dist/css/index.css'
import "./axios"
import "./permission"

import "./assets/css/bootstrap.min.css";
import "./assets/css/common.css";
import "./assets/css/totop.css";
import "./assets/css/reset.css";
import "./assets/css/footer.css";
import "./assets/css/header.css";
import "./assets/css/swiper-3.3.1.min.css";
import "./assets/css/index.css";



Vue.use(Element)
Vue.use(mavonEditor)

Vue.config.productionTip = false
Vue.prototype.$axios = axios

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
