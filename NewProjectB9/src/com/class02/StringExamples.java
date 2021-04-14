package com.class02;

public class StringExamples {

	public static void main(String[] args) {
		
		//All non-primitive type with start with the upper case
		String name;
		name = "Chris";
		
		String greeting = "Good Morining!";
		String phoneNumber = "123-234-3232";
		
		String stringNumber = "12";
		String wordWithSpace = " ";
		
		//Hello my name is Chris
		
		System.out.println ("Hello, my name is " + name);
		
		
		//How are you Chris?
		 System.out.println ("How are you " + name + "?");

		 int age = 33;
		 System.out.println("I am " + age);
		 
		 char grade = 'A';
		 //Chris is an A student
		 
		 System.out.println(name + " is an " + grade + " studemt.");
		 
		 
		 /*
		  * String concatenation operator  + can be used when
		  * we attach string to another string 
		  *  char, int and etc
		  */
		 
		 String car = "Tesla";
		 int year = 2021;
		 //I drive 2021 Tesla 
		 
		 System.out.println("I drive " +year + " " + car + ".");
		 
		 
		 String combineValue = year + " " + car; //whatever is attached to string - becomes a tring
		 
		 System.out.println(combineValue);
		 
		 
		//
		 byte day = 7;
		 String month =  "February ";
		 
		String date = month+day;
		System.out.println(date);
		
		 
		 
	}

}
