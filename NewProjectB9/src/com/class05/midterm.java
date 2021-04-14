package com.class05;

import java.util.Scanner;
public class midterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner score;
		int quiz;
		int midterm;
		int finaly;
		int gpa;
		char grade;
		score = new Scanner(System.in);
		
		System.out.println("Please enter you quiz score: ");
		quiz = score.nextInt();
		
		System.out.println("Please enter your midterm score: ");
		midterm = score.nextInt();
		
		System.out.println("Please enter your final score: ");
		finaly = score.nextInt();
		
		gpa = (quiz+midterm+finaly)/3;
		
		if (gpa >=90) {
			grade = 'A';
		}else if  (gpa >=70 && gpa<90) {
			grade = 'B';
		}else if (gpa >=50 && gpa<70) {
			grade = 'C';
		}else {
			grade = 'C';
		}
	
		System.out.println("Your grade is "+ grade);
	
	}

}
