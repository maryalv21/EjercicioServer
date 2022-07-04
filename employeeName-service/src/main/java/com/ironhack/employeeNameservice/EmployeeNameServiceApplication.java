package com.ironhack.employeeNameservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeNameServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeNameServiceApplication.class, args);
	}

}
