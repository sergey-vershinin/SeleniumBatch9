package com.class_07;

public class LoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int one = 1;
		if (one<5) {
			System.out.println("Hello");
		}
		System.out.println("----loop---");
		
		while(one<6) {
			System.out.println("Hello "+one);
			one++;
		}
		
		System.out.println("----loop---");
		
		int a=10;
		while(a>0) {
			System.out.print(a + " ");
			a--;	
		}
		
	}

}
