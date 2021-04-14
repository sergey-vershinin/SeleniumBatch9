package repl;
import java.util.Scanner;
public class Main21 {
	
	
	  public static void main(String[] args){

	  
	  int a = 10;
	  Scanner age = new Scanner(System.in);
	  System.out.println("Enter your age: ");
	  int yourAge = age.nextInt();
	  int b = yourAge + a;

	  System.out.println( "Your sge in " + a + " years is "+ b);

	}
	}