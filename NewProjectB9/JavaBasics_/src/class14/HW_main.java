package class14;
import java.util.Scanner;
public class HW_main {
	public static void main(String[] args) {
		
		//get the country name and print the greeting
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter your country: ");
		String a = input.nextLine();
		
		HW_one homeWork = new HW_one();
		homeWork.Greetings(a);

		
	}
}
