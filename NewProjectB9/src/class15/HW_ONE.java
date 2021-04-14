package class15;
import java.util.Scanner;

//"header file"
public class HW_ONE {
	
	//declareing a new method - middle letter
	String middleLetter(String frazze) {
		if(!frazze.isEmpty() && frazze.length()%2==1 && frazze.length()>3) {
			System.out.println(frazze.charAt((frazze.length()-1)/2));
		}else {
			System.out.println("Interesting fact: your frase has an even number of charectors!");
		}
		return frazze;
	}	
	String reverseFrase(String frazzee) {
		if (!frazzee.isEmpty()) {
			String rev= "";
			for(int i=frazzee.length()-1; i>=0; i--) {
				rev+=frazzee.charAt(i);
			}
			System.out.println(rev);
		}		
		return frazzee;
	}
		
	//main method
	public static void main(String[] args) {
	
    //creating an object
	HW_ONE case1 = new HW_ONE();
	
    Scanner input = new Scanner(System.in);
	System.out.println("Please, enter a frase:");
	String frase = input.nextLine();
	
	//calling first method
	case1.middleLetter(frase);
	
	//calling second method
	case1.reverseFrase(frase);
	
	}	
}
