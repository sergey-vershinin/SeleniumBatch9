package com.class_08;
import java.util.Scanner;
public class second {

	public static void main(String[] args) {
		// keep asking
		
		Scanner input= new Scanner(System.in);
		
		String answer="no";
		
		while(!answer.equalsIgnoreCase("yes")){
			System.out.println("Please, apply for the credit card");
			answer = input.nextLine();
			//answer.toLowerCase();
		}
		System.out.println("Thanks");
		
	}

}
