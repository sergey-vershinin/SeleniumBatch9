package com.class05;

public class logical_operations {

	public static void main(String[] args) {
		//we have to identify if number is small, medium , large
		
		int num = 100;
		
		if (num>=1 && num<=10) {
			System.out.println(num+" is a smaaler number");
			
		}else if(num>=11 && num<=100) {
			System.out.println(num +" is medium number");
		}else if(num>=101 && num<=1000) {
			System.out.println(num +" is a large number");
		}else if(num>=1001 && num <=100000) {
			System.out.println(num + " is a very large number");
		}
		
		
		//----------------
		String day ="Saturday";
		
		if(day.equals("Monday") || day.equals("Friday")) {
			System.out.println("Today is no class");
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today we have a manual class");
		}else if (day.equals("Thursday")) {
			System.out.println("Today we have a review class");
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today we have a Java class");
		}else {
			System.out.println(day + " is invalid");
		}
	}

}
