package class14;

public class HW_one {
		/*
		 * Create a method that will
		 *  say Hello in different language
		 *   based on the country that will 
		 *   passed when method is executed.
		 */
		 
	void Greetings (String country) {
		
		String str = country.toLowerCase();
		
		switch (str) {
		
			case "usa":
				System.out.println("Hello");
				break;
				
			case "mexica":
				System.out.println("Holla");
				break;
			
			case "spain":
				System.out.println("Holla");
				break;
			
			case "germany":
				System.out.println("Guten Tag");
				break;
			
			case "france":
				System.out.println(" Bonjour");
				break;
			
			case "russia":
				System.out.println(" Privet");
				break;
			
			case "china":
				System.out.println("Nǐn hǎo");
				break;
			default:
				System.out.println("PLease teach me how to say 'Hi' in your language ");
				
		}
	
	}
}

