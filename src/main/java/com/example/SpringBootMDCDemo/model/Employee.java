package com.example.SpringBootMDCDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Employee {

	private int id;
	
	private String name;
	
	private int salary;

	private String address;

}
