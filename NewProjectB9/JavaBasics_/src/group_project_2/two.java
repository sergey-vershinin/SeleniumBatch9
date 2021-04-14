package group_project_2;

public class two {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type
		 *  where you will store odd and even 
		 *  numbers in 3 rows and 4 columns.
		 *  Develop a program which will
		 *  identify/print the even numbers only.
		 */
		
		int [] [] a= {
				{2,3,4,5},
				{234,324,3,4},
				{3,4,5,7}
		};
		for(int [] b:a) {
			for(int c:b) {
				if(c%2==0) {
					System.out.print(c+ " ");
				}
			}
		}

	}

}
