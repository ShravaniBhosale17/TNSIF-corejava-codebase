package com.practice;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		
		//Student s=new Student(0, null)
		Student3 [] arr;
		
		//declared memory for 5 object or type students
		
		arr=new Student3[5];
		
		arr[0] = new Student3(101, "Heti");
		arr[1] = new Student3(102, "Zeel");
		arr[2] = new Student3(103, "Aditya");
		arr[3] = new Student3(104, "Rahul");
		arr[4] = new Student3(105, "Akshay");
		//arr[5] = new Student(106, "Suraj");
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Elemnts at"+ i+": "
		+arr[i].getRollNo()+"\t"+arr[i].getName());
		}

	}

}