package com.class06;

public class NotOperator {

	public static void main(String[] args) {
		// not operator practice "!"
		
		boolean rain = true;
		if (!rain){
			System.out.println("I will go to the park!");
			
		}
		
		boolean boo = !true;
		
		System.out.println(boo); //false
		
		boolean boo1 = !false;
		System.out.println(boo1);
		
		boolean trafic = true;
		if (!trafic) {
			System.out.println("I will come on time");
		}
		
		String day = "Friday";
		if(!day.equalsIgnoreCase("Friday")) {     // not Friday ! operator 
			System.out.println("Today is not Friday");
		}else {
			System.out.println("Today is Friday!");
		}
		
		boolean homework = true;
		
		if (!homework) {                         //using ! not operator 
			System.out.println("I am happy!");
		}else {
			System.out.println("We do have a home work.");
		}
	}

}
