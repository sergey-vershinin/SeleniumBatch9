package com.class04;

public class nestedExamples {

	public static void main(String[] args) {
		
		/*
		 * if itd friday - its a move day
		 * if its friday 13 - its a scary move day
		 */

		
		boolean isFriday = true;
		int day=13;
		
		if(isFriday) {
			System.out.println("It is a movie day!");
			
			if(day==13) {
				System.out.println("I will watch a scary movie!");
			}else {
				System.out.println("I will watch any availble movie");
			}
		}else {
			System.out.println("I will stay at home and study Java");
		}
	}

}
