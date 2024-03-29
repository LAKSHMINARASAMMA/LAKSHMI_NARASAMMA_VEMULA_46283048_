package com.cg.room;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@EnableDiscoveryClient
public class RoomMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomMicroserviceApplication.class, args);
	}

}
