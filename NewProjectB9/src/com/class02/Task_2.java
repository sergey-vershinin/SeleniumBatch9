package com.class02;

public class Task_2 {

	public static void main(String[] args) {
		
		int num_1 = 33;
		int num_2 = 13;
		
		int sum = num_1 + num_2;
		int sub =  num_1 - num_2;
		int mult = num_1*num_2;
		double div = num_1/num_2;
		
		System.out.println("The sum of 2 numbers " + num_1 + " and " + num_2 + " is equal to " + sum);
		System.out.println("The substraction of 2 numbers " + num_1 + " and " + num_2 + " is equal to " + sub);
		System.out.println("The multiplication of 2 numbers " + num_1 + " and " + num_2 + " is equal to " + mult);
		System.out.println("The division of 2 numbers " + num_1 + " and " + num_2 + " is equal to " + div);
//--------------------------
	    double one = 3.9;
	    double sqr = one * one;
	    
	    System.out.println("The square of the " + one + " is " + sqr);
//--------------------------
	    int width = 5;
	    int height = 8;
	    
	    int area = width*height;
	    int perimeter = 2*width + 2*height;
	    
	    System.out.println("The perimeter of rectangle with width " + width + " and height "  + height + " is equal to " + perimeter + " and the are is " + area);
	//-----------------//remainder 
	    int mod = 10%3;
	    System.out.println("Remainder is  "+ mod);  //1
	   
	    int mod1 = 10%2;
	    System.out.println("Remainder is  "+ mod1);  //0
	  
	    
	    int mod2 = 15%4;
	    System.out.println("Remainder is  "+ mod2);  //3
	    
	    int r = (20%7)*3;
	    System.out.println("Remainder is  "+ r);  
	}
	
	

}
