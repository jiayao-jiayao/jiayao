package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy //开启路由功能
@EnableEurekaClient
@SpringBootApplication
public class Day0730SpringcloudEurekazuul10010Application {

	public static void main(String[] args) {
		SpringApplication.run(Day0730SpringcloudEurekazuul10010Application.class, args);
	}

}
