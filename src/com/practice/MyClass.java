package com.practice;

public class MyClass {
	private int section;         //non static var

	private Object Sr;
	
	private static int SrNo;     //static
	
	static
	{
		System.out.println("------within ststic block");
		SrNo=1000;
		//Section=10000;   non static so cant
		
	}

	public MyClass(int section) {
		super();
		this.section = section;
		
		System.out.println("---------within default constructor----------");
		SrNo++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [serial No "+SrNo+", section= + section + "];
	}

//STSTIC VOID
	static void display()
		System.out.println("Serial No:"+SrNo);
	
	
	

}
