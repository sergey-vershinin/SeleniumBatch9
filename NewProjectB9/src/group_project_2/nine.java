package group_project_2;
import java.util.Scanner;
public class nine {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the
		 * second largest number in the array?
		 */

		int max1, max2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter the size of the desirble array: ");
		int size = input.nextInt();
		int [] a = new int [size];
		
		System.out.println("Please, enter " + size + " distinctive numbers for your array: ");
		
		for(int i =0; i<size; i++) {
			a[i]=input.nextInt();
		}
		
		max1=a[0];
		max2=a[0];
		for(int j=0; j<a.length; j++) {
			if(a[j]>max1) {
				max1=a[j];
			}
		}
			
		for(int j=0; j<a.length; j++) {
			if(a[j]==max1) {
				continue;
			}else if(a[j]>max2) {
				max2=a[j];
		}
		}
		System.out.println("The second largest number is: "+max2);
	}
}
	

