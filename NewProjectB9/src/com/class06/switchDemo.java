package com.class06;

public class switchDemo {

	public static void main(String[] args) {
		// TODO switch method 
		
		int day = 7;
		String weekDay=" ";
		
		if (day ==1) {
			weekDay = "Monday";
		}else if(day ==2) {
			weekDay = "Tuesday";
		}else if(day ==3) {
			weekDay = "Wednesday";
		}else if(day ==4) {
			weekDay = "Thirsday";
		}else if(day ==5) {
			weekDay = "Friday";
		}else if(day ==6) {
			weekDay = "Saturday";
		}else if(day ==7) {
			weekDay = "Sunday";

		}else {
			weekDay = "invalid";
			System.out.println("This is invalid input");
		}
		
	    if(!weekDay.equals("invalid")) {
	    		System.out.println("This is "+ weekDay);
		}
		//-------------------   is a value base;
	    //values must match a variable type;
	    //we must have a break in every case;
		String weekDay1 = null;
		switch(day) {
		
		case 1: 
			weekDay1 = "Monday";
			break;
		case 2:
			weekDay1 = "Tuesday";
			break;
		case 3:
			weekDay1 = "Wednesday";
			break;
		case 4:
			weekDay1 = "Thirsday";
			break;
		case 5:
			weekDay1 = "Friday";
			break;
		case 6:
			weekDay1 = "Saturday";
			break;
		case 7:
			weekDay1 = "Sunday";
			break;
		default: 
			weekDay1 = "invalid";
			break;
		}

		//if(!weekDay1.equals("invalid")) {
		System.out.println("Today is " + weekDay1);
		//}
	}
}
