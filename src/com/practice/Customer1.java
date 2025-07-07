package com.practice;

public class Customer1 {

	private String name;
	private String city;
	
	//getter and setterb 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//para constructor
	public Customer1(String name, String city) {
		
		this.name = name;
		this.city = city;
	}
	
	//default constructor 
	public Customer1() {
		super();
	}
	
	
	
}