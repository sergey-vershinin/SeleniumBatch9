package com.class05;
import java.util.Scanner;

public class logical_assignment {

	public static void main(String[] args) {
		// ask user to enter age
		//1 - 3 u r baby
		//3-5 bigger baby
		//5-12 kid
		//13-19 teenager
		//20 adult
		
		
		Scanner input;
		String name;
		int age;
		
		
		input = new Scanner(System.in);
		
		System.out.println("Please, enter your name: ");
		name =input.next();
		
		System.out.println("Please, enter your age: ");
		age = input.nextInt();
		
		if(age<0) {
			System.out.println(name+ " you veren't born yet");
		}else if (age >0 && age <=3) {
			System.out.println(name + " you are a baby");
		}else if (age >3 && age <=5) {
			System.out.println(name + " you are a bigger baby");
		}else if (age >5 && age <=12) {
			System.out.println(name + " you are a bigger kid");
		}else if (age >12 && age <=19) {
			System.out.println(name + " you are a teenager");
		}else if (age >19) {
			System.out.println(name + " you are an adult");
		}

	}

}
