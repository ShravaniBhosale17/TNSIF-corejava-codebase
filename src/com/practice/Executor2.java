package com.practice;

public class Executor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address=new Address("405 Laxmi nagar", "Pune", "Maharashtra", "4110001");
	
	
		Person1 p=new Person1("Shubham", address);
		p.displayInfo();
		System.out.println(p);
	
	
	
	}

}