package class14;

public class CalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.add(10,12));
		
		double results=calculator.sub(15.3, 34.5);
		System.out.println(results);
		
		double result2=calculator.div(15.3, 34.5);
		System.out.println(result2);
		
		//double result1=calculator.mult(15.3, 34.5);
		System.out.println(calculator.mult(15.3, 34.5));
	}

}
