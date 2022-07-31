package com.example.empDepartment.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "department")
public class Department 
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int deptId;
	    @Column(name = "dept_name")
	    private String deptName;
	    @OneToMany(fetch = FetchType.EAGER, mappedBy = "department", cascade = CascadeType.ALL)
	    @JsonIgnoreProperties("department")
	    private List<Employee> employeeList = new ArrayList<>();
	    public int getDeptId() {
	        return deptId;
	    }
	    public void setDeptId(int deptId) {
	        this.deptId = deptId;
	    }
	    public String getDeptName() {
	        return deptName;
	    }
	    public void setDeptName(String deptName) {
	        this.deptName = deptName;
	    }
	    public List<Employee> getEmployeeList() {
	        return employeeList;
	    }
	    public void setEmployeeList(List<Employee> employeeList) {
	        this.employeeList = employeeList;
	    }
}
