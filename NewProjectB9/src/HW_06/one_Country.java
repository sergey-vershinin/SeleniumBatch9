package HW_06;
import java.util.Scanner;
public class one_Country {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it.
		 *  Once values are captured print
		 *   which language user speaks.
		 */
		
		/*
		 * Ask user to entry their country(Scanner)
		 * capture vales in String variables;
		 * using switch, print out what language they speak;
		 */
		Scanner input;
		String country, language;
		
		input = new Scanner(System.in);
		System.out.println("Please, enter the country name: ");
		country = input.next();
		
		switch(country.toLowerCase())
		{
		case "usa":
			language = "english";
			break;
		case "russia":
			language = "russian";
			break;
		case "poland":
			language = "polish";
			break;
		case "mexico":
			language = "spanish";
			break;
		case "spain":
			language = "spanish";
			break;
		case "ukrain":
			language = "ukranian";
			break;
		case "belarus":
			language = "belarussian";
			break;
		case "kazakstan":
			language = "kazack";
			break;
		case "afganistan":
			language = "afgan";
			break;
		case "germany":
			language = "german";
			break;
		default:
			language = "undrfined";
		}
		System.out.println("The language of " + country+ " is "+ language);
	}

}
