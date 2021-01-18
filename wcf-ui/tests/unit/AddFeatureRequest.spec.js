import { shallowMount } from '@vue/test-utils';
import Vuex from 'vuex';
import AddFeatureRequest from '@/components/AddFeatureRequest.vue';

const localVue = createLocalVue();
localVue.use(Vuex);

describe('AddFeatureRequest.vue', () => {
  let getters;
  let wrapper;
  let store;

  beforeEach(() => {
    getters = {
      clientNames: jest.fn().mockReturnValue([
        'Client A', 'Client B', 'Client C',
      ]),
    };
    store = new Vuex.Store({
      modules: {
        getters,
      },
    });
    wrapper = shallowMount(AddFeatureRequest, {
      localVue,
      store,
    });
  });

  it('populates the client dropdown', () => {
    expect(getters.clientNames).toHaveBeenCalled();
  });
});
