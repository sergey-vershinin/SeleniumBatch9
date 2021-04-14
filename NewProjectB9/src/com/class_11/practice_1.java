package com.class_11;
import java.util.Scanner;
public class practice_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the size of the arr: ");
		int item = input.nextInt();

		String [] a = new String [item];
		
		System.out.println("Please, enter the values: ");
		for (int i = 0; i<item; i++) {
			
			//System.out.println("Please, enter the value: ");
			a[i] = input.next();
			
		}
		System.out.println("let's print out everyhing");
		
		for(String b:a) {
			System.out.println(b);
		}

	}

}
