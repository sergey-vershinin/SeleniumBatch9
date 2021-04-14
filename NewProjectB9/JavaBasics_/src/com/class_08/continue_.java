package com.class_08;

public class continue_ {

	public static void main(String[] args) {
		//if you need to print number from 1 to 10, except 5 and 6
		
		for (int i =0; i<=10; i++) {
			if(i==5 || i ==7) {
				System.out.println("Skip");
				continue;
			}
			System.out.println(i + " ");
		}

	}

}
