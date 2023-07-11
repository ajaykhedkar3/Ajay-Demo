package com.spring.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="employeedetails")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="empname")
	private String empName;
	
	@Column(name="salary")
	private int salary ;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="emailid")
	private String emailId;
	
	
	public Employee(long id, String empName, int salary, String designation, String emailId) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
		this.emailId = emailId;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
