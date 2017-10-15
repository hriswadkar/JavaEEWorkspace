package com.learnkafka.complex.obj;

import java.io.Serializable;

public class Employee {
	public int empId;
	public String empName;
	public String deptName;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String empName, String deptName) {
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
	}
	
	public int getEmpId() {
		return this.empId;
	}
	
	public String getEmpName() {
		return this.empName;
	}
	
	public String getDeptName() {
		return this.deptName;
	}
}
