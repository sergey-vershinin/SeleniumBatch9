package com.class_11;

public class tasks {

	public static void main(String[] args) {
		// 2D array cars
		
		String [] [] cars = {{"american", "german", "korean", "italian"}, 
				{"chevy"},
				{"bmw", "mercedes"},
				{"hyundai"},{"mazerati"}};
		
		
		String [][]cars_1 = new String [4][];
		
		cars_1[0][0] = "american";
		cars_1[0][1] = "german";
		cars_1[0][2] = "korean";
		cars_1[0][3]= "italian";
		
		cars_1[1][0]="chevy";
		
		cars_1[2][0] = "bmw";
		cars_1[2][1] = "mercedes";
		
		cars_1[3][0]="hyundai";
		
		cars_1[4][0]="mazerati";

	
		
		for(int i = 0; i<cars.length; i++) {
			for(int j=0; j<cars[i].length; j++) {
			System.out.println(cars[i][j]);
		}
		
		System.out.println();
		
		for(String [] temp:cars_1) {
			for(String a:temp){
				System.out.print(a);
			}
			System.out.println();
		}		
	}
	}
}


