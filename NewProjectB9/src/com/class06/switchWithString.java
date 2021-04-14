package com.class06;
import java.util.Scanner;
public class switchWithString {

	public static void main(String[] args) {
		/*
		 * we need to identify favorite food
		 * -capture the country from the user
		 * -base on the country identify favorite food
		 * -
		 */
		Scanner input;
	    String country, food;
	    
	    input = new Scanner(System.in);
	    
	    
	    System.out.println("Please, enter your country: ");
	    country = input.nextLine();
	    
	    switch(country.toLowerCase()) {    // country.toUpperCase(); / country.toLowercase();
	    
	    case "usa":
	    		food = "burger";
	    		break;
	    case "afganistan":
	    		food = "Kebab";
	    		break;
	    case "vietnam":
	    		food = "Pho";
	    		break;
	    case "poland":
	    		food = "Pierogi";
	    		break;
	    case "kazakstan":
	         food = "horse";
	         break;
	    case "belarus":
	    		 food = "draniki";
	    		 break;
	    case "tajikistan":
	         food = "plov";
	         break;
	    case "mexico":
	    	     food = "tacos";
	    	     break;
	    	default:
	    		food = "unknown";
	    }
	    System.out.println("Your favorit food is " + food);
	}

}
