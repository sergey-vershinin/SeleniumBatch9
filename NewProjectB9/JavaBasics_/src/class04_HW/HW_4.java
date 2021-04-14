package class04_HW;
import java.util.Scanner;
public class HW_4 {

	public static void main (String[] args) {
		//program that check if the user has a credut card
		
		Scanner card = new Scanner(System.in);
		System.out.println("Do you have a credit card? ");
		String cc = card.next();
		
		
		if(cc.equals("yes"))
		{
			System.out.println("Please, tell us what is your balance: ");
			int balance = card.nextInt();
			
			if(balance >= 1000) {
				System.out.println("Please, pay off your card immediately.");
			}else {
				System.out.println("You can spend more money.");
			}
		 }else {
			System.out.println("We can offer yuo a credit card.");
		}
			
	}
}
