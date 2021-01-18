package com.mouni.wcf.featurerequests

import com.mouni.wcf.featurerequests.controller.FeatureRequestController
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FeatureRequestsApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	private FeatureRequestController featureRequestController

	@Test
	void sanityCheckEndpoints () {
		String test = this.restTemplate.getForObject("http://localhost:" + port + "/", String.class)
		assert(test.contains('featureRequests'))
		assert(test.contains('clients'))
	}

	@Test
	void contextLoads() {
		assert(featureRequestController != null)
	}

}
