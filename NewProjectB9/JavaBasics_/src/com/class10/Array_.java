package com.class10;

public class Array_ {

	public static void main(String[] args) {
		
		int num = 10;
		num = 20;
		System.out.println(num);
		
		int[] array = new int[5];  //double[] = new double[6];
		
		array [0] = 10;
		array [1] = 12;
		array [2] = 15;
		array [3] = 9;
		array [4] = 13;
		
		System.out.println(array[0]+array[4]);
		
		String[] names = new String[3];
		names[0]="Alex";
		names[1] = "Katya";
		names[2]= "Dasha";
		
		System.out.println(names[1]);
		
		int size = names.length;
		System.out.println(size);
		
		char[] abc = new char[6];
		abc[0]='A';
		abc[1]='B';
		abc[2]='C';
		abc[3]='D';
		abc[4]='E';
		abc[5]='F';
		System.out.println(abc[1]);
		
		char[] grades= {'A','B','C'};
		
		String[] group = new String[6];
		group[0]="caner";
		group[1] = "Evgenia Genni";
		group[2]= "Karina";
		group[3]="Maksym";
		group[4] = "Sergey";
		group[5]= "Valeriia Golovina";
		
		System.out.println(group[4]);
		
		
		
        String[] group_2 = {"caner", "Evgenia Genni", "Karina", "Maksym", "Sergey","Valeriia Golovina" };
		
		System.out.println(group_2[4]);
		
		for(int i =0; i<group_2.length; i++) {
			System.out.print(group_2[i]+ " ");
		};
		
		System.out.println();
		//--------
		String[] sentence = {"Java ","Saturday ","Day ", "coding ", "is "};
		
		System.out.println(sentence[1] + sentence[4] + sentence[0]+ sentence[3]+sentence[2]);
		
		//--------
		System.out.println("-----------------");
		
		int [] numbers = {10,14, 13,23, 312,123,2312};
		
		for (int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
		System.out.println("-----------------");
		
		for (int i = numbers.length - 1; i>=0; i--) {
			System.out.println(numbers[i] + " & ");
		}
			System.out.println("-----------------");
			
			
			//for each, enhance for loop, advanced for loop
			int [] numbers_2 = {10,14, 13,23, 312,123,2312};
			
			for(int numb:numbers_2) { //typeVariable + nameVariable
				System.out.println(" ,numb " + numb);
			}
			
			System.out.println("-----------------");
			
			
			//for each, enhance for loop, advanced for loop
			boolean [] numbers_87 = {true, false, true, true, false};
			
			for(boolean number:numbers_87) { //typeVariable + nameVariable
				System.out.println(" bool " + number);
			}
		}
		

}
	
