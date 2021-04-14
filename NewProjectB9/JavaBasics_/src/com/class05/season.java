package com.class05;

import java.util.Scanner;
public class season {
	
	public static void main(String[] args) {
//this program ask user to enter his/her birth month, nad base on that defines the season
		
		String month, season = null;
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.println("Please, enter a month your were born: ");
		month = input.next();
		
		if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") ||month.equalsIgnoreCase("February")){
			season="Winter";
		}else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") ||month.equalsIgnoreCase("May")){
			season="Spring";
		}else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") ||month.equalsIgnoreCase("August")){
			season="Summer";
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") ||month.equalsIgnoreCase("November")){
			season="Fall";
		}else {
			System.out.println("PLease, enter the valid input");
			return;
		}
		
		System.out.println("You were born in "+ season);
	}
}
