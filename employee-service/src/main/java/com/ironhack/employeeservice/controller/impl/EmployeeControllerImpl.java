package com.ironhack.employeeservice.controller.impl;

import com.ironhack.employeeservice.clases.Employee;
import com.ironhack.employeeservice.controller.interfaces.EmployeeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
public class EmployeeControllerImpl implements EmployeeController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/employees")
    @ResponseStatus(HttpStatus.OK)
    public Employee employee() {


        RestTemplate restTemplate = new RestTemplate();
        String baseUrl = discoveryClient.getInstances("employeeName-service").get(0).getUri().toString();
        String apiMethod = "/employees/name";

        String result = restTemplate.getForObject(baseUrl + apiMethod, String.class);
        Employee employee= new Employee(result, "garcia", 20);

        return employee;
    }
}
