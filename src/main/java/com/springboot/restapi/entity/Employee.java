package com.springboot.restapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee
{
   @Id
   private String id;
   
   private String name;
   
   private String email;
   
   private String city;
   
   private String  mobile;
   
   public String getId()
   {
	   return id ;
   }
   public void setId(String id)
   {
	 this.id=id;  
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String  getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
 
public Employee(String id, String name, String email, String city, String mobile) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.city = city;
	this.mobile = mobile;
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", mobile=" + mobile + "]";
}


   

   
   
}
