package com.mouni.wcf.featurerequests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan({"com.mouni.wcf"})
@EntityScan("com.mouni.wcf.featurerequests.model")
@EnableTransactionManagement
@EnableConfigurationProperties
@EnableJpaRepositories(basePackages="com.mouni.wcf.featurerequests.repository")
public class FeatureRequestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeatureRequestsApplication.class, args);
	}

}
