package class04_HW;
import java.util.Scanner;
public class HW_5 {

	public static void main(String[] args) {
		// program that ask about work years
		
		Scanner ask = new Scanner(System.in);
		System.out.println("Please, enter number if years that you worked: ");
		int years = ask.nextInt();

		
		if(years >=5) {
			System.out.println("You are eligible for the bonus!");
			System.out.println("Please, enter your annual salary: ");
			int salary = ask.nextInt();
			if(salary>50000) {
				System.out.println("Your bonus is 5000!");
			}else {
				System.out.println("Your bonus is 3000");
			}
		}else {
			System.out.println("You are not eligible for the bonus.");
		}
	}

}
