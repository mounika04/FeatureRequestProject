import {
  SET_CLIENTS,
  SET_FEATURE_REQUESTS,
  ADD_FEATURE_REQUEST,
} from './mutation-types';

/* eslint-disable no-param-reassign */
export default {

  [SET_CLIENTS](state, clients) {
    state.clients = clients;
  },
  [SET_FEATURE_REQUESTS](state, featureRequests) {
    state.featureRequests = featureRequests;
  },
  [ADD_FEATURE_REQUEST](state, featureRequest) {
    state.featureRequests.push(featureRequest);
  },
};
