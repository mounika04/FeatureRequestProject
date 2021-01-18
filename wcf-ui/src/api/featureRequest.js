import axiosInstance from './featureRequestAxios';

/**
 * This function calls the back end to retrieve all of the clients
 * @returns Promise to retrieve the clients
 */
const fetchClients = async () => axiosInstance.get('/clients')
  .then(res => res.data);

/**
 * This function calls the back end to retrieve all of the feature requests
 * @returns Promise to retrieve the feature requests
 */
const fetchFeatureRequests = async () => axiosInstance.get('/featurerequests')
  .then(res => res.data);

export {
  fetchClients,
  fetchFeatureRequests,
};
