package com.class05;
import java.util.Scanner;

public class two {

	public static void main(String[] args) {
	
		
		
		Scanner input;
		String name;
		int height;
		
		
		input = new Scanner(System.in);
		
		System.out.println("Please, enter your name: ");
		name =input.next();
		
		System.out.println("Please, enter your height in inches: ");
		height = input.nextInt();
		
		if(height<0) {
			System.out.println("Please, enter a valid numbers");
		}else if(height>0 && height<=60) {
			System.out.println(name+" you are short");
		}else if(height>60 && height<=72) {
			System.out.println(name+" you are medium");
		}else if(height>72) {
			System.out.println(name+" you are tall");
		}
	
			
			//-----------
		
		int day;
		System.out.println("Please, enter Please enter which day's number between 1 and 7 it is: ");
		day =input.nextInt();
		
		if(day==6 ||day ==7) {
			System.out.println("This is weekend");
		}else {
			System.out.println("This is a weekday");
		}
		
	}
}
	
		
		