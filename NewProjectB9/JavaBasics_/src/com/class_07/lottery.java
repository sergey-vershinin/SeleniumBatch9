package com.class_07;
import java.util.Scanner;
public class lottery {

	public static void main(String[] args) {
		
	
				int numero;
				int lotery_winner = 1;
				Scanner input = new Scanner(System.in);
				
				do {
					System.out.println("Please enter any number from 1 to 100 to win the lotery: ");
					numero = input.nextInt();
				}while(numero!=lotery_winner);
				
					System.out.println("Congretualtion, you entered " + numero + " which is a lucky number!");
				
			}

		}