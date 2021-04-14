package class14;

public class MoreMethodsTester {

	public static void main(String[] args) {
		/* create a method that not take any
		 *  values and always print "hi"
		 */	

		//print method
		MoreMethods_ moreMethodsExample = new MoreMethods_();
		System.out.println(moreMethodsExample.print());

		//double method
		System.out.println(moreMethodsExample.doubleTheValue(10));
		
		//umbrella method
		moreMethodsExample.IsRaining(true);
		
		//print batch9 is great
		moreMethodsExample.printBatch9();
		
		//return the larger number
		//System.out.println(moreMethodsExample.returnGreater(3, 5));
		moreMethodsExample.returnGreater(3, 5);
		
		//even or odd number
		moreMethodsExample.oddEven(3);
		
		//array number
		double [] a = {2,3,4,5,6,7,};
		//System.out.println(moreMethodsExample.sum(a));
		moreMethodsExample.sum(a);
		
		String z = "color";
		System.out.println(moreMethodsExample.mirror(z));
	

}
}
