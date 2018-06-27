import Vue from 'vue'
import VueRouter from 'vue-router';
import VueResource from 'vue-resource';
import App from './App.vue'
import { routes } from './routes';

Vue.use(VueRouter);
Vue.use(VueResource);
Vue.http.options.root = 'https://purchasing-2f42c.firebaseio.com/quotations.json';
const router = new VueRouter ({
  routes,
  mode: 'history'
});

new Vue({
  el: '#app',
  router,
  render: h => h(App)
})
