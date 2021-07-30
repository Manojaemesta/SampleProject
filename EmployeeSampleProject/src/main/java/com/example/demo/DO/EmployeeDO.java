package com.example.demo.DO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeDO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	
	private String empFirstName;
	
	private String empLastName;
	
	private String job;
	
	private String manager;
	
	private String hireDate;
	
	private int sallary;
	
	private int commission;
	
	private String deptCode;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public int getSallary() {
		return sallary;
	}

	public void setSallary(int sallary) {
		this.sallary = sallary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	@Override
	public String toString() {
		return "EmployeeDO [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", job=" + job + ", manager=" + manager + ", hireDate=" + hireDate + ", sallary=" + sallary
				+ ", commission=" + commission + ", deptCode=" + deptCode + "]";
	}
	
	
}
