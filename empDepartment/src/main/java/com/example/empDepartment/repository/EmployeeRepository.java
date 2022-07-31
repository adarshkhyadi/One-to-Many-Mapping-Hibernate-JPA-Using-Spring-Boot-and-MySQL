package com.example.empDepartment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.empDepartment.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
