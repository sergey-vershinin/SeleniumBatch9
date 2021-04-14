package class04_HW;
import java.util.Scanner;
public class HW_03 {

	public static void main(String[] args) {
		
	//this program is to ask user the temt and the city and convert into fahrenheit
		
		Scanner Me = new Scanner(System.in);
		System.out.println("Please, enter the city you are in: ");
		String City = Me.nextLine();
	
		System.out.println("Please, enter 'F' if the temp is in Fahrenheit and 'C', if it's in Celcius: ");
	    String FC = Me.nextLine();
		
		
		System.out.println("Please, enter the temperature in your city: ");
		int Temp = Me.nextInt();
		

		if(FC.equals("F")){
			System.out.println("The temperature in "+ City + " is "+Temp +" degrees.");
		}else if(FC.equals("C")) {
			System.out.println("The temperature in "+ City + " is "+ (Temp*1.8+32) +" degrees.");
		}else {
			System.out.println("Plaese, check the iformation you entered.");
		}
		
		
	}

}
