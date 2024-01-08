package com.springboot.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.restapi.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, String>
{
  

//
//	public Employee findbyEmail(String email);
//
//	public Employee findbyMobile(long mobile);
//
//	public Employee findbyCity(String city);

	public Employee findByName(String name);
}
