package com.practice;

public class HierachicalDriver {

	public static void main(String[] args) {
		
		
		Person2 p1=new Person2();
		System.out.println("------Person Details ------");
		System.out.println(p1);
		
		System.out.println("--------------------------");
		//Student s=new Student();
		Person2 p;
		p=new Person2("Shubham", "mumbai");
		System.out.println("Person Details "+ p);
		
		p=new Student("Sunil", "Nashik", "SY", 67.89f);
		System.out.println("Students details "+ p);
		
		p=new Employee("Isha", "Nagar", 1002, 450000, "Development");
		System.out.println("employee details "+ p);
		


		
	}

}
