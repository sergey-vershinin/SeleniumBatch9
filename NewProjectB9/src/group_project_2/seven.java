package group_project_2;

public class seven {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to print the 
		 * first 10 numbers of Fibonacci series.
		 * 
		 * F[0] =0; F[1]=1;
		 * F{n}=F{n-1}+F{n-2}
		 */
		
		int [] a= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		int num=0;
		
		for(int i = 0; i<10; i++) {
			if(i==0 || i==1) {
				System.out.print(i + " ");
			}else {
				num=a[i-1] +a[i-2];
				System.out.print(num+ " ");
				
				System.out.println("=================");

		    }
		}
		
		int k =0;
		int d = 1;
		int g;
		
		for(int h=0; h<=10; h++) {
			System.out.print(k+ " ");
			g=k+d;
			k=d;
			d=g;
		}
	}

}
