package com.class04;

public class class_assignement {

	public static void main(String[] args) {
		
		
		//if statement to chaeck if the studnet has diploma and the gpa rate
		boolean Diploma = true;
		int gpa = 4;
		
		//outter if statement 
		if(Diploma) {
			System.out.println("Congartulations!");
			//inner if statement
			if(gpa>=3.5) {
				System.out.println("You are eligible for scolarship!");
			}else {
				System.out.println("You should studied harder");
			}
				
		}else {
			System.out.println("Please, get a degree.");
		}	//end of the otter if statement 
				
		System.out.println("\n");   //break/empty line
		
		
		//if statement to check the mortgage rate and a loan value
		int mortgage_rate = 4;
		int mortgage_price = 2000001;
		//outter if 	
		if(mortgage_rate >4.5) {
			System.out.println("You not buying a house.");
			
		}else {
			System.out.println("You may consider buying a house.");
		}	if(mortgage_price >200000) {     //inner if
			System.out.println("You will need a loan.");
		}else {
			System.out.println("You can pay in cash.");
		}
	}
	
	}


