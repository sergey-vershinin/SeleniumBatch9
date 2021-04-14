package com.class_08;
import java.util.Scanner;
public class fourth {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to
		 *  enter item they want to buy and the price
		 *   of that item. Every time user enters money,
		 *    accumulate the amount and tell the user how much 
		 *    is left to pay off. If user give more money program
		 *     should return a change. Whenever a user done 
		 *     with payments program should say 
		 *     “Thank you for shopping!”
		 */

			Scanner input = new Scanner(System.in);
			System.out.println("Please enter an item you want to buy and the price: ");
			String product = input.nextLine();
			int price = input.nextInt();
			
			
			
			int payoff=0;
			int payment=0;
			int change;
			int remainder;
			
			while(payoff != price) {
				if(payoff>price) {
					change = payoff-price;
					System.out.println("Please take your change: "+ change);
					break;
				}
				remainder = price-payoff;
				System.out.println("please, pay "+ remainder);
				payment = input.nextInt();
				payoff=payoff+payment;
			}
			
			System.out.println("Thank you for shopping!");
			
	}

}
