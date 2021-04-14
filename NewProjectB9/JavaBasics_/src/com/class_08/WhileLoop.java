package com.class_08;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		// we need to male user to pay for the soda
		// please ask user to pay
		
		double price =3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please pay 3 dollars for your soda");	
		double money = input.nextDouble();
		
		while(price!=3) {

			if(money<3) {
				System.out.println("Please give more money");
				money = input.nextDouble();
			}else if(money>3) {
				System.out.println("Please give less money");
				money = input.nextDouble();
			}
			
			}
		System.out.println("Enjoy your soda");
			
		}
		
		
		

	}
