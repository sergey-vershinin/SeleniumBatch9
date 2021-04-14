package com.class_07;
import java.util.Scanner;
public class name_capture_loop {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		while(num<5) {
			System.out.println("Plesae, input your name: ");
			String name = input.nextLine();
			System.out.println("Hello " + name +" !");
			num++;
		}

	}

}
