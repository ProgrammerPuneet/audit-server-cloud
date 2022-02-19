package com.example.SpringBootMDCDemo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootMDCDemo.model.Employee;
import com.example.SpringBootMDCDemo.service.EmployeeService;

@RestController
public class EmployeeController {

	private static final Logger LOGGER =LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmpployee(){
		LOGGER.info("Inside getAllEmpployee method of EmployeeController");
		return service.getAllEmployee();
	}
}
