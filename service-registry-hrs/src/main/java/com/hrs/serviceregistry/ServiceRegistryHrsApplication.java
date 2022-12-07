package com.hrs.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryHrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryHrsApplication.class, args);
	}

}
