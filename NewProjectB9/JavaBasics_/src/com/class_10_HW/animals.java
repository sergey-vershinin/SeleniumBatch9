package com.class_10_HW;

public class animals {
	public static void main(String[] args) {
		/*
		 * Create an array of animals 
		 * and store 6 elements into it.
		 *  Using 2 different loops print
		 *  all elements from the array.
		 */
	
		String [] animals_ = {"cat", "dog", "chicken", "bird", "elephant", "horse"};
		for(String item:animals_) {
			System.out.println(item + ";");
		}
		
		//------------------
		System.out.println("==============");
		
		String [] animalsss = new String[6];
		animalsss [0] = "cat";
		animalsss [1] = "dog";
		animalsss [2] = "parrot";
		animalsss [3] = "cow";
		animalsss [4] = "hamster";
		animalsss [5] = "chipmank";
		
		for (int i = 0; i<animalsss.length; i++) {
			System.out.println(animalsss[i]);
		}
		
		
	}

}
