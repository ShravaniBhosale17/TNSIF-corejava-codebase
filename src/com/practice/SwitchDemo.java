package com.practice;

public class SwitchDemo {

	public static void main(String[] args) {
		int userinput=5;
		
		switch(userinput)
		{
		case 1:System.out.println("rechrage details");
		break;
		
		case 2:System.out.println("recgarge expiry");
		break;
		
		case 3:System.out.println("rechrage offer");
		break;
		
		default:
			System.out.println(userinput + "is not valid");
			
		}
		
		
		
	}

}
