package com.classs_07_HW;

public class odd_and_even {

	public static void main(String[] args) {
		
		//calculate sum of odd and even numbers from 1 to 50
		int odd=0;
		for(int i=1; i<=50; i+=2) {
			odd = odd+i;
			System.out.print(odd +"/" + i +"; ");
		}
		System.out.println();
		System.out.println("final: " +odd);

	
	System.out.println("______________");
	
	   int even = 0;
	   for( int a = 0; a<=50; a+=2) {
		   even = even +a;
		   System.out.print(even + "/"+ a + "; ");
	   }
	   System.out.println();
	   System.out.println("final: " + even);
	
	}

}
