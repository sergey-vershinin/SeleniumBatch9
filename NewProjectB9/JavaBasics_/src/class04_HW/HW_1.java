package class04_HW;
import java.util.Scanner;
public class HW_1 {

	public static void main(String[] args) {
		//This program about a loan specialist 
		//if loan >=200000, then you would lend the money
		
		int loan;
		
		
		Scanner specialist = new Scanner(System.in);
		System.out.println("Plese, speciafy the amount of the loan needed: ");
		int laon = specialist.nextInt();
	
		if(laon<=200000) {
			System.out.println("Congratulatios, you can get a loan!");
		}else {
			System.out.println("Unfortinutly, you can not get a loan.");
		}

	}

}
