package com.example.empDepartment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.empDepartment.entity.Department;
import com.example.empDepartment.service.DepartmentService;
@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping(value = "/savedepartment", method = RequestMethod.POST)
    @ResponseBody
    public Department saveDepartment(@RequestBody Department department) {
       Department dr = departmentService.saveDepartment(department);
        return dr;
    }
    @RequestMapping(value = "/{deptId}", method = RequestMethod.GET)
    @ResponseBody
    public Department getDepartmentDetails(@PathVariable int deptId) {
        Department departmentResponse = departmentService.findByDeptId(deptId);
        return departmentResponse;
    }
}
