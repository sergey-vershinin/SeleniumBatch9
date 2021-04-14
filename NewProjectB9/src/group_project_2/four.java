package group_project_2;

public class four {

	public static void main(String[] args) {
		/*
		 * Create 2D array of countries: 
		 * north america countries, 
		 * south america countries, 
		 * europe countries, 
		 * asian countries, 
		 * african countries. 
		 * Then print all values from that array
		 *  using 2 different loops 
		 *  and calculate how many total countries
		 *   have been stored.
		 */
		String [] [] countries = {
				{"USA", "Canda", "Mexico"},
				{"Brazil", "Peru", "Argentina", "Chile"},
				{"France", "Spain", "Portugies", "Italy"},
				{"China", "Japan", "Thailand", "Indonisia"},
				{"South Sfrica", "Kenya", "Angola", "Zambia"}};
		int sum=0;
		
		for(int i = 0; i<countries.length; i++) {
			for(int j = 0; j<countries[i].length; j++) {
				System.out.print(countries[i][j] + " ");
			}	
			System.out.println();
		}
		System.out.println("----------");
		
		for(String[] a:countries) {
			for(String b:a) {
				System.out.print(b+" ");
				sum+=1;
			}
			System.out.println();
		}	
		System.out.println("\nThe total number of countries stored in the Matrix is "+sum);
	}

}
