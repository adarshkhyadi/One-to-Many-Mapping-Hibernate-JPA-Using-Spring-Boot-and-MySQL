package com.example.empDepartment.service.impl;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.empDepartment.entity.Department;
import com.example.empDepartment.entity.Employee;
import com.example.empDepartment.repository.DepartmentRepository;
import com.example.empDepartment.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department) {
        List<Employee> employeeList = new ArrayList<>();
        // create first story
        Employee emp1 = new Employee();
        emp1.setEmpName("Adarsh");
        // create second story
        Employee emp2 = new Employee();
        emp2.setEmpName("Praveen");
        // create third story
        Employee emp3 = new Employee();
        emp3.setEmpName("Shubham");
        // add all story into storyList. Till here we have prepared data for OneToMany
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        // Prepare data for ManyToOne
        emp1.setDepartment(department);
        emp2.setDepartment(department);
        emp3.setDepartment(department);
        department.setEmployeeList(employeeList);
        department = departmentRepository.save(department);
        return department;
    }
    public Department findByDeptId(int deptId) {
        Department department = departmentRepository.findByDeptId(deptId);
        return department;
    }
}
