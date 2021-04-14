package group_project_2;

public class three {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type
		 *  where you will store integer values 
		 *  in 3 rows and 4 columns.
		 *  Develop a program which will calculate 
		 *  the sum of even and odd numbers for that array.
		 */
		int [] [] a = {
				{123,23,23,23},
				{12,21,12,32},
				{3243,343,23,23}};
		int sumEven=0;
		int sumOdd = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				if(a[i][j]%2==0) {
					sumEven+=a[i][j];
				}else {
					sumOdd+=a[i][j];
				}
			}
		
		}
		System.out.println("The sum of the even numbers is equals to " + sumEven);
		System.out.println("The sum of the odd numbers is equal to " + sumOdd);

	}

}
