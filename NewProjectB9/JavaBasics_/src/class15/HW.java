package class15;
import java.util.Scanner;
public class HW {
	
	//method declaration
	String babeName(String mom, String dad, String gender1) {
		
		if (gender1.equalsIgnoreCase("Boy")){
			System.out.println(dad.substring(0,dad.length()/2) + (mom.substring(mom.length()/2)));
		}else if(gender1.equalsIgnoreCase("Girl")){
			System.out.println(mom.substring(0,mom.length()/2) + (dad.substring(dad.length()/2)));
		}else {
			System.out.println("Plsese, specify the gender of the child");
		}
		return gender1;
	}
	
	
	//main method
	public static void main(String[] args) {
	
	HW babeName = new HW();  //new object of the class
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please, enter Mom's first name:");
	String momName = input.nextLine();
	
	System.out.println("Please, enter Dad's first name:");
	String dadName = input.nextLine();
	
	System.out.println("Boy or Girl");
	String gender = input.nextLine();
	
	//calling the function
	babeName.babeName(momName,dadName,gender);
	
	}

}
