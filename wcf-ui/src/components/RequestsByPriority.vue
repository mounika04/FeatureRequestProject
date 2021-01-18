<template>
<p>Hello</p>
</template>

<script>
import { mapGetters } from 'vuex';

export default {
  name: 'RequestsByPriority',
  data() {
    return {
    };
  },
  computed: {
    ...mapGetters([
      'featureRequests',
    ]),
  },
};

</script>

<style scoped>

</style>
