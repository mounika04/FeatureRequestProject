import Vue from 'vue';
import Vuetify from 'vuetify';
import Vuex from 'vuex';
import { store } from './store/store';
import App from './App.vue';
import router from './router';
import 'vuetify/dist/vuetify.min.css';


Vue.config.productionTip = false;
Vue.use(Vuetify);
Vue.use(Vuex);

Vue.use(store);

new Vue({
  router,
  store,
  render: h => h(App),
}).$mount('#app');
