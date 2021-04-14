package com.class_07;

public class class_exersize {

	public static void main(String[] args) {
		/*
		 *  Print numbers from 1 to 100 in 1 line with space

			Print numbers from 100 to 1

			Print even numbers from 20 to 1 (2 ways)
			
			Print odd numbers between 20 and 50 (2 ways)
			Collapse
		 */
		int i;
		
		for( i = 1; i<=100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for( i = 100; i>0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for( i = 20; i>=1; i--) {
			if(i%2==0) {
			System.out.print(i + " ");
		}
		}
		System.out.println();
		
		for( i = 20; i>=1; i=i-2) {
			System.out.print(i + " ");
		}
		
		
		System.out.println();
		
		for( i = 20; i<=50; i++) {
			if(i%2==1) {
			System.out.print(i + " ");
		}
		}
		
		System.out.println();
		
		for( i = 20; i<=50; i=i+1) {
			if(i%2==1) {
			System.out.print(i + " ");
		}
		}
	
		
	}

}
