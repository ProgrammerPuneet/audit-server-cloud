package com.example.SpringBootMDCDemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.SpringBootMDCDemo.controller.EmployeeController;
import com.example.SpringBootMDCDemo.model.Employee;
import com.example.SpringBootMDCDemo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger LOGGER =LoggerFactory.getLogger(EmployeeController.class);
	
	@Override
	public List<Employee> getAllEmployee() {
		LOGGER.info("Inside getAllEmpployee method of EmployeeServiceImpl");
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee1 = new Employee(1, "karan", 5000);
		Employee employee2 = new Employee(2, "Vivek", 7000);
		Employee employee3 = new Employee(3, "Mohit", 9000);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		LOGGER.info("list of employees : {} ",employees);
		return employees;
	}

}
