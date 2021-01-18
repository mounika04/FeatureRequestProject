/* eslint-disable arrow-parens */
/* eslint-disable arrow-body-style */
/* eslint-disable max-len */
export default {
  clients: state => state.clients,
  clientNames: state => state.clients.map(x => x.clientName),
  features: state => state.featureRequests,
  featuresByClientName: state => clientName => state.featureRequests.filter(fr => fr.client.clientName === clientName),
};
