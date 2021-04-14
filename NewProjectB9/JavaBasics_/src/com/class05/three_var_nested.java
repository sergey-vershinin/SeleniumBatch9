package com.class05;

import java.util.Scanner;
public class three_var_nested {

	public static void main(String[] args) {
		// this program ask user to enter three different numbers and returns a largest;
		
		double a, b, c, largerNum=0;   //declare a variables with type double;
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
		
		if(a>b) {
			if(a>c) {
				largerNum = a;
			}else if(c>a) {
				largerNum = c;
			}else  {
				System.out.println("Loks like two numbers are equal");
				return;
			}
				
		}else if(b>a) {
			if(b>c) {
				largerNum = b;
			}else if(c>b) {
				largerNum = c;
			}else {
				System.out.println("Loks like two numbers are equal");
				return;
			}
				
		}else if(c>a) {
			if(c>b) {
				largerNum = c;
			}else if(b>c) {
				largerNum=b;
			}else {
				System.out.println("Loks like two numbers are equal");
					return;
				}
		}else if(a>c) {
			if(a>b) {
				largerNum=a;
			}else if(b>a) {
				largerNum = b;
			}else {
				System.out.println("Loks like two numbers are equal");
			    return;
		    }
		}else if(a>b) {
			if(a>c) {
				largerNum=a;
			}else if(c>a) {
				largerNum = c;
			}else {
				System.out.println("Loks like two numbers are equal");
			    return;
		    }
			
		
		}else {
			System.out.println("looks like all numbers are equal.");
			return;
		}
		
		System.out.println("The largest number you enterd is " + largerNum);

}
}
