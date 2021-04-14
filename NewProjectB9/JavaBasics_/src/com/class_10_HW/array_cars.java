package com.class_10_HW;

public class array_cars {

	public static void main(String[] args) {
		// Create an array of cars and store 6 
		//elements into it. Using 2 different loops 
		//print all values from the array.
		
		String [] cars = { "audi", "toyota", "merccedes", "lexus", "honda", "hyundai"};
		
		for(String make:cars) {
			System.out.println(make + " ");
		}
		System.out.println("----------");
		
		for (int i =0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		//----------
		
		System.out.println("----------");
		System.out.println("----------");
		
		String[] vehicle = new String[6];
		
		vehicle [0]= "audi";
		vehicle [1] = "totyota";
		vehicle [2] ="mercedece";
		vehicle [3] = "lexus";
		vehicle [4] = "honda";
		vehicle [5] = "bmw";
		
		for(String model:vehicle) {
			System.out.println(model + " ");
		}
		System.out.println("----------");
		
		for (int i =0; i<vehicle.length; i++) {
			System.out.println(vehicle[i]);
		}
	}
}

