package com.ferdinand.api;

import com.ferdinand.api.controller.EmployeeController;
import com.ferdinand.api.model.Employee;
import com.ferdinand.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class ApiApplication {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return (List<Employee>) employeeService.getEmployees();
	}


}
