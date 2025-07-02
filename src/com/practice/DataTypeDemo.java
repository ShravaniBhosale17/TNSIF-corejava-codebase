package com.practice;

public class DataTypeDemo {

	public static void main(String[] args) {
		int value= 9/2;
		System.out.println(value);
		
		//ASCII VALUE
		int name='a';
		System.out.println("ASCII VALUE"+ name);
		
		float value1=101f/61f;
		System.out.println(value1);
		
		double value3=10d/6d;
		System.out.println(value3);
		
		long phn=9067452332L;
		System.out.println("Phone Number: "+ phn);

		int radius=10;
		
		double percentage= 3.14 * radius * radius;
		System.out.println("percentage: "+ percentage);
		
		char ch= 57;		//ASCII VALUE
		char ch1= 67;       //ASCII VALUE
		char ch2= 97;		//ASCII VALUE
		System.out.println("character: "+ ch);
		System.out.println("character: "+ ch1);
		System.out.println("character: "+ ch2);
		
		//TYPECASTING
		//Widening data type is implicit type casting
		//Narrowing is force fully so explicit type casting
		
		byte b=10;
		int i=b;
		System.out.println(i); //widning
		
		float f=22.14f;
		double d=f;
		System.out.println(d);	//widning
		
		double f1=10.52f;
		long l=(long) f1;
		System.out.println(l);
	}

}
