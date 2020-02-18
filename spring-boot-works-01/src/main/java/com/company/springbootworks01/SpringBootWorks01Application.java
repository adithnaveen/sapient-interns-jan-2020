package com.company.springbootworks01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;




@EnableDiscoveryClient
@EnableFeignClients("com.company.springbootworks01.service")
@SpringBootApplication(scanBasePackages = {"com.company.springbootworks01.service", "com.company.springbootworks01.controler"})
public class SpringBootWorks01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWorks01Application.class, args);
	}

}
