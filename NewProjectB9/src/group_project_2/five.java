package group_project_2;
import java.util.Scanner;
public class five {

	public static void main(String[] args) {
		/*
		 * Write a program to swap 2 numbers
		 *  without a temporary variable?
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		int [] a = new int [2];
			
		a[0]= input.nextInt();
		a[1]= input.nextInt();
		
		System.out.println("Before swap: " +"one= "+a[0] + " "+ "two= "+a[1]);
		System.out.println("After swap: " +"one= "+a[1] + " "+ "two= "+a[0]);
		
		/*Alternative:
		 * System.out.println("Please enter two numbers: ");
		 * int one = imput.nextInt();
		 * int two = imput.nextInt();
		 * 
		 * one = one- two;
		 * two = one+two;
		 * one = two - one;
		 * System.out.println("one: " +one + " " + "two: " +two);
		 * 
		 */
		
		
	}

}
