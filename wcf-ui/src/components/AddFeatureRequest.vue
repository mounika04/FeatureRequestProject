<template>
  <v-layout row justify-center>
      <v-card>
        <v-card-title>
          <span class="headline">Add Feature Request</span>
        </v-card-title>
        <v-card-text>
          <v-container grid-list-md>
            <v-layout wrap>
              <v-flex xs12>
                <v-select
                  :items="clientNames"
                  label="Please choose a Client"
                  solo
                  v-model="clientName"
                ></v-select>
              </v-flex>
              <v-flex xs12>
                <v-text-field solo label="Feature Title" required
                hint="Title for the feature request"></v-text-field>
              </v-flex>
              <v-flex xs12>
                <v-textarea label="Description" solo
                            hint="A more detailed description of the feature request.">
                </v-textarea>
              </v-flex>
            </v-layout>
          </v-container>
        </v-card-text>
        <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn color="blue darken-1" flat @click="this.emit('close', {})">Close</v-btn>
          <v-btn color="blue darken-1" flat @click="this.saveRequest()">Save and Prioritize</v-btn>
        </v-card-actions>
      </v-card>
  </v-layout>
</template>

<script>

import { mapGetters } from 'vuex';

export default {
  name: 'AddFeatureRequest',
  data() {
    return {
      clients: [],
      clientName: '',
    };
  },
  methods: {
    saveRequest() {
      console.log('saving');
    },
  },
  computed: {
    ...mapGetters([
      'clientNames',
      'featureRequests',
    ]),
  },
};
</script>
