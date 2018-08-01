package com.javaDev.controller;

import com.javaDev.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoXmlController {
    @RequestMapping("/demo")
    public Employee demo() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Java Developer Zone");
        employee.setRole("HR");
        return employee;
    }
}


