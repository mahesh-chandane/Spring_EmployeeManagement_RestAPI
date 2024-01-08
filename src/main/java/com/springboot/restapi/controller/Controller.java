package com.springboot.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapi.entity.Employee;
import com.springboot.restapi.service.EmployeeService;


@RestController
public class Controller 
{
  @Autowired
  private EmployeeService service;
  
  @PutMapping("/save")
  public Employee saveEmployee(@RequestBody Employee employee)
  {
	return service.saveEmployee(employee);
	  
  }
  @PutMapping("/saveAll")
 public List<Employee> saveAllEmployee(@RequestBody List<Employee> employees)
 {
	return service.saveAllEmployee(employees);
	 
 }
  @GetMapping("/FetchAll")
  public List<Employee>  findAllEmployees()
  {
	return service.findAllEmployee();
	  
  }
  @GetMapping("/Fetch/{id}")
  public Employee findById(@PathVariable String id)
  {
	  return service.findById(id);
  }
 
  @GetMapping("/fetchByName/{name}")
  public Employee findProductByName(@PathVariable String name) {
      return service.getEmployeeDetailByName(name);
  }
  
  @PutMapping("/update")
  public Employee updateEmployee(@RequestBody Employee employee)
  {
	  return service.updateEmployee(employee);
  }
  @DeleteMapping("/delete/{id}")
  public String deleteEmployee(@PathVariable  String id)
  {
	  return service.deleteEmployee("id");
}
   
}
