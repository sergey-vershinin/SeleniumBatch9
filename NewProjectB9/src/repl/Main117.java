package repl;

public class Main117 {
/*
 * calculate the sum of the EVEN integers
 *  from 1 to x (including x)
 */
	 int sum;
	 int sumEvenTox(int x){
		 for (int i=1; i<=x; i++){
		  if(i%2==0) {
		     sum+=i;
	      }else {
	    	  continue;
	      }
	  }
		 return sum;
	 }
		  
 public static void main(String[] args){
	 Main117 obj = new Main117();

	 //obj.sumEvenToX(b);
	 int b = 5;
	 System.out.println(obj.sumEvenTox(b));
	 }
}