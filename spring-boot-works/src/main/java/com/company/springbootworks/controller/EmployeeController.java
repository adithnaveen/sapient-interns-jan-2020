package com.company.springbootworks.controller;

import static javax.servlet.http.HttpServletResponse.SC_BAD_REQUEST;
import static javax.servlet.http.HttpServletResponse.SC_OK;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.company.springbootworks.beans.Employee;
import com.company.springbootworks.exception.UserNotFoundException;
import com.company.springbootworks.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Employee API")

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private Environment environment;

	///////////////////////////

	@GetMapping("/emps")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@ApiOperation(value = "Gets information about one employee from the system")
	@ApiResponses(value = { @ApiResponse(code = SC_OK, message = "ok"),
			@ApiResponse(code = SC_BAD_REQUEST, message = "An unexpected error occurred") })
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)

	@GetMapping("/emps/{empId}")
	public HttpEntity<Employee> getEmployee(@PathVariable int empId) {

		Employee employee = employeeService.findOneEmployee(empId);

		if (employee == null) {
			throw new UserNotFoundException("Sorry User Not Found");
		}

		employee.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

//		Employee emp = employee.add(linkTo(methodOn(EmployeeController.class).getAllEmployees()).withSelfRel());

		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@PostMapping("/emps")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
}
