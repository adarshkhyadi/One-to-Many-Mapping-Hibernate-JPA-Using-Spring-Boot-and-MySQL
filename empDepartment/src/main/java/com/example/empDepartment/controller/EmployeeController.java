package com.example.empDepartment.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.empDepartment.entity.Employee;
import com.example.empDepartment.repository.EmployeeRepository;
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @ResponseBody
    @RequestMapping(value = "/employees")
    public List<Employee> getEmployeeDetails() {
        List<Employee> employeeresponse = (List<Employee>) employeeRepository.findAll();
        return employeeresponse;
    }
}
