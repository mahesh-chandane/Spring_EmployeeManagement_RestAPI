package com.springboot.restapi.service;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.restapi.entity.Employee;
import com.springboot.restapi.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
  private EmployeeRepository repository;
	
	
	public Employee saveEmployee(Employee employee)
	{
		return repository.save(employee);
	}
	
	public List<Employee> saveAllEmployee(List<Employee> employees)
	{
		return repository.saveAll(employees);
	}
	
     public List<Employee> findAllEmployee() 
     {
	  return repository.findAll();
     }
     
     public Employee findById(String id)
     {
    	 return repository.findById("id").orElse(null); 
     }

     public Employee getEmployeeDetailByName(String name) {
         return repository.findByName(name);
     }
     
//    
//     public Employee getEmployeetByEmail(String email)
//     {
//    	  return repository.findbyEmail(email);
//     }
//     public Employee getEmployeetByMobile(long mobile)
//     {
//    	  return repository.findbyMobile(mobile);
//     }
//     
//     public Employee getEmployeetByCity(String city)
//     {
//    	  return repository.findbyCity(city);
//     }
     
     public Employee updateEmployee(Employee employee )
     {
		Employee oldEmployee=repository.findById(employee.getId()).orElse(null);
		oldEmployee.setId(employee.getName());
		oldEmployee.setEmail(employee.getEmail());
		
		oldEmployee.setCity(employee.getCity());
		oldEmployee.setMobile(employee.getMobile());
		return repository.save(oldEmployee);
		
     }
     
     public String deleteEmployee(String id)
     {
    	 repository.deleteById("id");
    	 return " employee Datails remove !"+id;
     }
     
  
	
	
}
