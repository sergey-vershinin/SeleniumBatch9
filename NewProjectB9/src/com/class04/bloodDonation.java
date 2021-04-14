package com.class04;

import java.util.Scanner;

import java.util.Scanner;

public class bloodDonation {

	public static void main(String[] args) {
		
		//if statement to check donation eligibility
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please, enter your age: ");
		String next=scan.nextLine();
		
		
		System.out.println(next);
		
		
		System.out.println("Please, enter your word: ");
		String name=scan.next();
		System.out.println(name);
		
		System.out.println("Please, enter your age: ");
		int age=scan.nextInt();
		System.out.println(age);

		
		System.out.println("Please, enter your age: ");
		int weight=scan.nextInt();
		System.out.println(weight);
		
		//outter if statement
		if(age>=18) {
			System.out.println("You passed the age requierement");
		 	if(weight>=110) { // inner if
			System.out.println("You are eligible to donate blood");
			}else {
			System.out.println("Sorry, you are not eligible to donate blood");
			}
	    }else {
	    		System.out.println("Sorry, you are not eligible to donate blood");
	    }
	}

}

