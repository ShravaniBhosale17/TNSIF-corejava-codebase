package com.practice;

public class Person2 {

	
	private String name;
	private String city;
	
	//Default Constructor 
	public Person2() {
		System.out.println("person class default value constructor ");
		name="Amit";
		city="Pune";
	}

	public Person2(String name, String city2) {
	
		this.name = name;
		this.city = city2;
	}

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

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	
	
	
}