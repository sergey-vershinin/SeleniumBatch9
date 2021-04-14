package group_project_2;
import java.util.Scanner;
public class six {

	public static void main(String[] args) {
		/*
		 * Write a java program to check 
		 * whether a given number is prime or not?
		 * prime numbers - natural  numbers that are greater than 1,
		 * and can be divided only on its self 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter the number: ");
		int num = input.nextInt();
		
		if((num<2 || (num+2)%2==0 || num%3==0) && num!=2) {   //not a prime
			System.out.println("The number " + num + " is not a prime number");
		}else {
			System.out.println("The number " + num + " is a prime number");
		}
		
		

	}

}
