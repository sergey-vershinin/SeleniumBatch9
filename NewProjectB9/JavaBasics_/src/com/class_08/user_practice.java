package com.class_08;
import java.util.Scanner;
public class user_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int even=0;
		int odd=0; 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter the starting point:  ");
		int start = input.nextInt();
		
		System.out.println("Please, enter the ending point:  ");
		int end = input.nextInt();
		 //System.out.println(end);
		 while(start <= end) {
			 if(end>=start) {
				 System.out.println("Please, enter the correct numbers");
				 break;
			 }
			 //System.out.println("The sum of odd numbers are: " + odd );
			 else if (start%2==0) {
				 even+=start;
				 
			 }else {
				 odd+=start;
				 
			 }
			 start++;
		 }
		 
		 System.out.println("The sum of odd numbers are: " + odd );
		 System.out.println("The sum of the even num are: "+ even);
	}

}
