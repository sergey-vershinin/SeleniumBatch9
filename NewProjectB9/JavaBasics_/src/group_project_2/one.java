package group_project_2;

public class one {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type 
		 * and store numbers in 3 rows and 3 columns.
		 *  Print the sum of all numbers.
		 */
		
		int [] [] a = {
				{1,1,1},
				{2,2,2},
				{3,3,3}
		};
		int sum=0;
		
		for(int [] b:a) {
			for(int c:b) {
				sum+=c;
			}
		}
		System.out.println(sum);
		
	}

}
