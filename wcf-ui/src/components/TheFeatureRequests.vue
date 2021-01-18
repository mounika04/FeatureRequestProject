<template>
  <div>
    <v-container>
    <v-btn color="primary"
           round
           dark
           align-center
           @click="dialog=true">Add New Client Request
    </v-btn>
    </v-container>
    <v-container
      fluid
      grid-list-md
      px-5
    >
      <v-layout align-center>
        <v-flex>
          <br/>
          <v-card>
            <v-card-text>
              <v-tabs fixed-tabs>
                <v-tab >
                  By Client
                </v-tab>
                <v-tab>
                  By Priority
                </v-tab>
                <v-tab>
                  By Product Area
                </v-tab>
              </v-tabs>
            </v-card-text>
          </v-card>
          <v-tabs-items>
            <v-tab-item>
              <v-card flat>
                <v-card-text>
                  <RequestsByClient></RequestsByClient>
                </v-card-text>
              </v-card>
            </v-tab-item>
            <v-tab-item>
              <v-card flat>
                <v-card-text>
                  <RequestsByPriority></RequestsByPriority>
                </v-card-text>
              </v-card>
            </v-tab-item>
            <v-tab-item >
              <v-card flat>
                <v-card-text>
                  <RequestsByClient></RequestsByClient>
                </v-card-text>
              </v-card>
            </v-tab-item>

          </v-tabs-items>
          <v-dialog v-model="dialog" persistent max-width="500px" @close="dialog = false;">
            <v-card>
              <v-card-text>
                <AddFeatureRequest isVisible="showDialog"></AddFeatureRequest>
              </v-card-text>
            </v-card>
          </v-dialog>

        </v-flex>
      </v-layout>
    </v-container>
  </div>
</template>


<script>

import { mapGetters, mapActions } from 'vuex';
import RequestsByClient from './RequestsByClient.vue';
import AddFeatureRequest from './AddFeatureRequest.vue';
import RequestsByPriority from './RequestsByPriority.vue';
import { fetchClients, fetchFeatureRequests } from '../api/featureRequest';

export default {
  name: 'TheFeatureRequests',
  components: {
    AddFeatureRequest,
    RequestsByClient,
    RequestsByPriority,
  },
  data() {
    return {
      clientName: 'Client A',
      clientRequests: [],
      dialog: false,
    };
  },
  computed: {
    ...mapGetters([
      'clients',
      'featureRequests',
    ]),
  },
  methods: {
    ...mapActions([
      'setClients',
      'setFeatureRequests',
    ]),
  },
  async mounted() {
    try {
      this.setClients(await fetchClients());
    } catch (error) {
      console.log(error);
    }
    try {
      this.setFeatureRequests(await fetchFeatureRequests());
    } catch (error) {
      console.log(error);
    }
  },
};
</script>
<style>

</style>
