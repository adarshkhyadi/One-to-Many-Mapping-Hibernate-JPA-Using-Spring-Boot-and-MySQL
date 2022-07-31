package com.example.empDepartment.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.empDepartment.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
    public Department findByDeptId(int deptId);
}
