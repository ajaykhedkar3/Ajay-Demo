package com.spring.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spring.demo.entity.Employee;
import com.spring.demo.repository.EmployeeRepository;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/getEmp")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@GetMapping("/getEmp/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable long id) {
		return employeeRepository.findById(id);
	}
	
	@GetMapping("/getEmpByEmail/{email}")
	public Optional<Employee> getEmployeeById(@PathVariable String email) {
		return employeeRepository.findByemailId(email);
	}
	
	@PostMapping("/saveEmployee")
	public void saveEmployee(@RequestBody Employee emp) {
		employeeRepository.save(emp);
	}
	
	@PutMapping("/updateEmployee")
	public void updateEmployee(@RequestBody Employee emp) {
		employeeRepository.save(emp);	
	}
	
	@DeleteMapping("/deleteEmployee")
	public void deleteEmployee(@RequestBody Employee emp) {
		employeeRepository.delete(emp);
		
	}
	
	

}
