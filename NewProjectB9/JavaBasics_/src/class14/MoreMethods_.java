package class14;

public class MoreMethods_ {

	String print () {
		return "Hi";
	}
	
	/* create a method that take a number
	 * and returns the double of that number;
	 */
	double doubleTheValue(double input) {
		return input*2;
	}
	
	/*create  method that will take a boolean as input
	if the value is true, take the umbrella
	if the value id false i want to print "gp for a walk"
	*/
	
	void IsRaining(boolean isRain) {
		if(isRain) {
			System.out.println("Please take an ambrella");
		}else {
			System.out.println("Go for a walk");
		}
	}
	
	//prints 5 times
	void printBatch9() {
		for(int i=0; i<5; i++){
			System.out.println("Batch9"
					+ " is great!");
		}
	}
	
	/*write a method that takes two 
	 * numbers Nand return a greater number
	 */
	double returnGreater(double one, double two) {
		if( one>two) {
			return one;
		}else {
			return two;
		}
	}
	
	/* creae a method that takes a numbers 
	 * if number is even print"the numbser is even"
	 * othervise print"the number is  odd"
	 */

	void oddEven(double one) {
		if( one%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("the number is odd");
		}
	}
	
	/* that takes an array and return 
	 * the sum of the elenents
	 */
	double sum(double a[]) {
		int sum=0;
		for(double b:a) {
			sum+=b;
		}
		return sum;
	}
	
	/* will take string as input 
	 * and defined if the string 
	 * is a mirror or not
	 */
	
	boolean mirror ( String str) {
	String newStr="";
	for(int i = str.length()-1; i>=0; i--){
		System.out.println(i+" " + str.charAt(i));
	}
	
	if (str.equals(newStr)) {
		return true;
	}else {
		return false;
	}
	}
		
}

	
	

