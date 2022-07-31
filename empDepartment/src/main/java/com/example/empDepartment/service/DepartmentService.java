package com.example.empDepartment.service;

import org.springframework.stereotype.Component;
import com.example.empDepartment.entity.Department;

@Component
public interface DepartmentService 
{
	    public Department saveDepartment(Department department);
	    public Department findByDeptId(int deptId);
	
}
