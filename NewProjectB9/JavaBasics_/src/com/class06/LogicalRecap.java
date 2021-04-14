package com.class06;
import java.util.Scanner;
public class LogicalRecap {

	public static void main(String[] args) {
		
		Scanner scan;
		int time;
		String timeOfTheDay=null; //better to assign to "invalid";
		
		scan = new Scanner(System.in);
		System.out.println("Please, enter time in 24 hpour format: ");
		time = scan.nextInt();
		
		if(time>=1 && time<=11) {
			timeOfTheDay = "Morning";
		}else if (time >=12 && time<= 13) {
			timeOfTheDay = "Noon";
		}else if (time >=14 && time<= 17) {
			timeOfTheDay = "Afternoon";
		}else if (time >=18 && time<= 21) {
			timeOfTheDay = "Evening";
		}else if (time >=22 && time<= 24) {
			timeOfTheDay = "Night";
		}
		
		System.out.println("Based on the entered time, time of the day is "+ timeOfTheDay);

	}
	/*
	 * compiler can initialize variables to their default values:
	 * default value for the int  = 0;
	 * default value for the double 0.0;
	 * default value for the boolean is true;
	 * default value for the String is null;
	 */

}
