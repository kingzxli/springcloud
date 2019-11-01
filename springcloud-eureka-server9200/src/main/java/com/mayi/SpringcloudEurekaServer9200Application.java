package com.mayi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaServer9200Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaServer9200Application.class, args);
	}

}
