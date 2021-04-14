package com.class06;
import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		// need to calculate final price after the discount 
		/*
		 * 1. check if there is a sale -> i'm not going to shop
		 * 2. if there is a sale:
		 * 			we will ask for the item
		 * 			we will ask for the price
		 * 
		 * 			if the price less then 10$ -> apply 5% discount
		 * 			if the price 10 -100 -> apply 10% discount 
		 * 			if the price 100 - 500 -> apply 20%
		 * 			if is more then 500 -> 30%
		 */		

		
		                                     
		double originalPrice, discPrice = 0.0;                           //boolean sale =true;
		Scanner input;
		input = new Scanner(System.in);
		String item, sale;
		
		System.out.println("PLease, let me know if there is a sale: ");
		sale = input.next();                                              //sale = inputBoolean();
		
		if(sale.equalsIgnoreCase("No")) {                                 //if(!sale)  
			System.out.println("I am not going to shop.");
			return;
		}else if (sale.equalsIgnoreCase("Yes")){                          //else if (sale)
			System.out.println("What would you like to purchase?");
			item = input.next();                                          // item 
			System.out.println("What is original price?");
			originalPrice = input.nextDouble();                           //original price
			
			if (originalPrice <= 10) {
				discPrice = originalPrice - (originalPrice*0.05);
				
			} else if (originalPrice>10 && originalPrice<=100) {
				discPrice = originalPrice - (originalPrice*0.1);
				
			}else if (originalPrice>100 && originalPrice<=500) {
				discPrice = originalPrice - (originalPrice*0.2);
				
			}else if (originalPrice>500 ) {
				discPrice = originalPrice - (originalPrice*0.3);
			}
			
			System.out.println("You buying "+ item + " for the sale price of  " + discPrice);
			System.out.println("Thank you for shopping!");
			
		}
	}

}
