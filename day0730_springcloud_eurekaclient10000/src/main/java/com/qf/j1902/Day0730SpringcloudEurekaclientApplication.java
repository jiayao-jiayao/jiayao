package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //表示为发现者
@SpringBootApplication
public class Day0730SpringcloudEurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day0730SpringcloudEurekaclientApplication.class, args);
	}

}
