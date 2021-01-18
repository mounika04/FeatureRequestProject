<template>
  <div class="root">
    <v-flex xs12 sm6 d-flex>
      <v-select
        :items="clientNames"
        label="Clients"
        solo
        v-model="currentClient"
        @change="getCurrentClientFeatures()"
      ></v-select>
    </v-flex>
    <v-flex xs12 sm6 d-flex>
    <SlickList lockAxis="y" v-model="currentClientFeatures">
      <SlickItem class="padded a-list-item" v-for="(feature) in currentClientFeatures"
                 :index="feature.priority"
                 :key="feature.priority">
        <div class="padded">{{ feature.title }}</div>
        <v-spacer></v-spacer>
      </SlickItem>
    </SlickList>
    </v-flex>
  </div>
</template>
<script>

import { SlickList, SlickItem } from 'vue-slicksort';
import { mapGetters } from 'vuex';


export default {
  name: 'RequestsByClient',
  components: {
    SlickItem,
    SlickList,
  },
  data() {
    return {
      currentClient: '',
      clientChosen: false,
      currentClientFeatures: [],
    };
  },
  methods: {
    getCurrentClientFeatures() {
      this.clientChosen = true;
      this.currentClientFeatures = this.featuresByClientName(this.currentClient);
    },
  },
  computed: {
    ...mapGetters([
      'clients',
      'clientNames',
      'featureRequests',
      'featuresByClientName',
    ]),
  },
};

</script>
<style>
  .padded {
    padding: 10px;
    border: 2px black;
  }

  .a-list-item {
    display: block;
  }
</style>
