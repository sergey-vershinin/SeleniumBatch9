package com.class05;
import java.util.Scanner;
public class commision_ {

	public static void main(String[] args) {
		
		Scanner scan;
		double saleAmount, commission;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter ypur sale amount: ");
		saleAmount = scan.nextDouble();
		
		
		if (saleAmount <10) {
			commission  = 0;
		}else if (saleAmount >=10 && saleAmount <=100) {
			commission  = saleAmount*0.1;
		}else if (saleAmount >100 && saleAmount <=500) {
			commission  = saleAmount*0.2;
		}else if (saleAmount >500 && saleAmount <=1000) {
			commission  = saleAmount*0.4;
		}else {
			commission  = saleAmount*0.5;
		}
	
		System.out.println("Your commission is " + commission);
		
		if (commission >500) {
			System.out.println("YOu are an amazing seller");
		}
	}


}
