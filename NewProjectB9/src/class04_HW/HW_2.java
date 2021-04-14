package class04_HW;
import java.util.Scanner;

public class HW_2 {

	public static void main(String[] args) {
		//This program to check if the DMV customer is 16yo or older

		int age;
		
		Scanner DMV = new Scanner(System.in);
		System.out.println("Plese, enter your age: ");
		age = DMV.nextInt();
		
		//if statement
		if(age>=18) {
			System.out.println("Congratulations, you are eligible for the driver licence.");
		}else {
			System.out.println("Unfortunately, you are too young to gwt a driver licence");
		}
	}

}
