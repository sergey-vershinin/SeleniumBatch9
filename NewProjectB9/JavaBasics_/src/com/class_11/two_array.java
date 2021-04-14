package com.class_11;

public class two_array {

	public static void main(String[] args) {
		// two array 
		int[] [] num = new int[3] [4];
		
		num [0][0] = 00;
		num [0][1] = 01;
		num [0][2] = 02;
		num [0][3] = 04;
		
		num [1][0] = 10;
		num [1][1] = 11;
		num [1][2] = 12;
		num [1][3] = 13;
		
		num [2][0] = 20;
		num [2][1] = 21;
		num [2][2] = 22;
		num [2][3] = 23;
		
	
	//-------------
	int [] [] numbers = {
			{1,2,60},
			{1,2,3},
			{1,2,3}
	};
	
	System.out.println(numbers[0][2]); //60
	//-----------
	
	String [] [] names = {{"Mr", "Mrs", "Ms", "Miss"}, {"Smith", "Jackson" , "Obama"}};
	
	System.out.println(names[0][0]+ " "+ names[1][2]);
	
	//----------------
	String [] [] students = { {"Smith", "Jackson" , "Obama"}, {"A","B", "C"}};
	System.out.println(students[0][0]+ " "+ students[1][0] +"\n"+ students[0][1]+ " "+ students[1][1] );
	
	//---------------
	System.out.println("------------------");
	String [] [] usa = {
			{"Alexandria", "Oakton", "Virginia Beach"},
			{"Philadelfia", "Strasburg", "Pitsburg"}, 
			{"Boston", "Quincy", "Springfield", "Burington"},
			{"Los Angeles", "Long Beach", "Santa Barbara"},
			{"Miami", "Orlando", "Tampa", "key West"}};

				for(int i =0; i<usa.length; i++) {
					for(int j =0; j<usa[i].length; j++) {
						System.out.println(usa[i][j]);
					}
					System.out.println();
				}
				System.out.println("////////inhence fro loop///////");		
		for(String[] temp : usa) {
			for(String temp2:temp) {
				System.out.println(temp2);
			}
			System.out.println();
		}
	}
}

