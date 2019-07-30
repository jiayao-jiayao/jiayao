package com.qf.j1902.day0730_springcloud_loginclient10001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Day0730SpringcloudLoginclient10001Application {

    public static void main(String[] args) {
        SpringApplication.run(Day0730SpringcloudLoginclient10001Application.class, args);
    }

}
