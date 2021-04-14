package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {
		//store a gender 
		//based on the gender we will specify
		//if M - Male
		//if F - Famele
		//otherwise - not sure
		
		
		
		
		
		char gender = 'h';
		String description;
		switch(gender) {
		
		case 'M': 
			description = "Male";
			break;
		case 'F': 
			description = "Female";
			break;
		default: 
			description = "not sure";
			break;
		}

		
		System.out.println("You entered " + description);
		
		//limitation: switch cannot use relational or logical operation (it's simply check);
		//switch cannot be used with boolean, double 
		//it can work  with: byte, short, char, int, string
	
	}
}
