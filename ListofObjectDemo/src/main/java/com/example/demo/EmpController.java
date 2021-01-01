package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/")
	public List<Employee> getAllEmployees()
	{
		return new ArrayList<Employee>(Arrays.asList(new Employee(101, "Murugan", 1000), new Employee(102, "Raja", 2000)));
	}
}
