import {
  SET_CLIENTS,
  SET_FEATURE_REQUESTS,
  ADD_FEATURE_REQUEST,
} from './mutation-types';

export default {
  setClients(context, clients) {
    context.commit(SET_CLIENTS, clients);
  },
  setFeatureRequests(context, featureRequests) {
    context.commit(SET_FEATURE_REQUESTS, featureRequests);
  },
  saveFeatureRequest(context, featureRequest) {
    context.commit(ADD_FEATURE_REQUEST, featureRequest);
  },
};
