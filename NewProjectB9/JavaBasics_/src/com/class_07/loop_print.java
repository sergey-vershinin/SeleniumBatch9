package com.class_07;

public class loop_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("1 to 10");
		int num=1;
		while(num<=100) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
		System.out.println("100 to 1");
	
		num = 100;
		while(num>=1) {
			System.out.print(num+" ");
			num--;
		}
		System.out.println();
		System.out.println();
	
		System.out.println("20 to 100");
	
		num=20;
		while (num<=100) {
			if(num%2==0) {
			System.out.print(num+" ");
			}
			num++;
		}
		System.out.println();
	}
}
		
		

