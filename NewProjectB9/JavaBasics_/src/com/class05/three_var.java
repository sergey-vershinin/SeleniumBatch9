package com.class05;

import java.util.Scanner;
public class three_var {

	public static void main(String[] args) {
		// This program ask to enter three different numbers and returns the largest number
		
		double a, b, c, largerNum;   //declare a variables with type double;
		Scanner num; // declare a Scanner;
		num = new Scanner(System.in); //Initialize a new scanner;
		
		//print out first statement;
		System.out.println("Please, enter the first number: ");
		a= num.nextDouble();
		
		//print out a second statement;
		System.out.println("Please, enter the second number: ");
		b= num.nextDouble();
		
		//print out a third statement;
		System.out.println("Please, enter the third number: ");
		c= num.nextDouble();
		
		if(a > b && a >c) {
			largerNum = a;
		}else if(b> a && b>c) {
			largerNum =b;
		}else if(c> a && c>b) {
			largerNum = c;
		}else {
			System.out.println("At least one number must be different");
			return;
		}
		
		System.out.println("The largest number you enterd is " + largerNum);
	}

}
