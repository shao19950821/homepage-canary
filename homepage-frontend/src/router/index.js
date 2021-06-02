import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../views/Login.vue'
import NewsCenter from '../views/NewsCenter.vue'
import Home from '../views/Home.vue'
import About from '../views/About.vue'
import Member from '../views/Member.vue'
import Development from '../views/Development.vue'
import NewsDetail from '../views/NewsDetail.vue'
import NewsEdit from '../views/NewsEdit.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/login',
    name: 'Login',
    component: Login
  },
  {
    path: '/home',
    name: 'Home ',
    component: Home,
  },
  {
    path: '/about',
    name: 'About',
    component: About,
  },
  {
    path: '/member',
    name: 'Member',
    component: Member,
  },
  {
    path: '/development',
    name: 'Development',
    component: Development,
  },
  {
    path: '/news',
    name: 'NewsCenter',
    component: NewsCenter
  },
  {
    path: '/newsEdit',
    name: 'NewsEdit',
    component: NewsEdit
  },
  {
    path: '/news/:newsId',
    name: 'NewsDetail',
    component: NewsDetail
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
