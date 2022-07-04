package com.ironhack.employeeNameservice.controller.impl;

import com.ironhack.employeeNameservice.controller.interfaces.EmployeeNameController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeNameControllerImpl implements EmployeeNameController {
    @GetMapping("/employees/name")
    @ResponseStatus(HttpStatus.OK)
    public String name() {
        String name = "Pepe";
        return name;
    }
}
