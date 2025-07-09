package com.practice;

//Entity
public class Student3 {

	
	//data members
	private int rollNo;
	private String name;
	
	//para constructor
	public Student3(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	//getter and setter 
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}