package class15;
import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the user name: ");
			String userName = input.nextLine();
			System.out.println("Please enter the password: ");
			String pas = input.nextLine();
			System.out.println("Please repit the password: ");
			String pas1 = input.nextLine();
			
		if(pas.isEmpty()) {
			System.out.println("Password cannot be empty");
		}else if(pas.length() < 8) {
			System.out.println("Password is too short");
		}else if(pas.contains(userName)) {
		//else if(pas.equalsIgnoreCase(userName)) {
			System.out.println("Password cannot be your usser Name");
		}else if(pas != pas1) {
			System.out.println("Password do not match");
		}else {
		
		System.out.println("Your username and password has been created");
	     }
}
}
