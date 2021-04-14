package group_project_2;
import java.util.Scanner;
public class eight {

	public static void main(String[] args) {
		//Maximum and minimum number in the array?
		int min, max;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter the size of the desirble array: ");
		int size = input.nextInt();
		int [] a = new int [size];
		
		System.out.println("Please, enter " + size + " distinctive numbers for your array: ");
		
		for(int i =0; i<size; i++) {
			a[i]=input.nextInt();
		}
		
		min=a[0];
		max=a[0];
		for(int j=0; j<a.length; j++) {
			if(a[j]<min) {
				min=a[j];
			}else if(a[j]>max) {
				max=a[j];
			}
		}
		System.out.println("min number is: "+min);
		System.out.println("max number is: "+max);
		}
	}

		
