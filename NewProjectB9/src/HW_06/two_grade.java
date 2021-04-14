package HW_06;
import java.util.Scanner;
public class two_grade {
	public static void main(String[] args) {
		/*
		 * Allow user to enter the grade
		 * provide them with the explanation;
		 */
		
		/*
		 * pseudocode:
		 * ask user for the grade (scanner);
		 * (A,b,C,D);
		 * provide them with an explanation
		 * swich
		 */
		
		Scanner input;
		String grade, explain;
		
		input = new Scanner(System.in);
		System.out.println("Please, enter the grade: ");
		grade = input.next();
		
		switch(grade) {
		
		case "A":
			explain = "Excellent";
			break;
		case "B":
			explain = "Good";
			break;
		case "C":
			explain = "Avarage";
			break;
		case "D":
			explain = "Bad";
			break;
		default:
			explain = "not defined";
		}
		
		System.out.println("You entered " +grade+ " which means "+ explain);
		
		}	
		
	}
