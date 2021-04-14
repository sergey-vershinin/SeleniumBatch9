package HW_06;
import java.util.Scanner;
public class three_calculator {
	
	public static void main(String[] args){
		
		/*
		 * using scanner create a calculator;
		 * allow user to enter two numbers 
		 * (+,-,*,/)
		 * provide the result
		 */
		
		double first, second, result=0.0;
		Scanner input;
		char operation,  sum =  '+', sub =  '-', mult =  '*', div = '/';
		
		
		input = new Scanner(System.in);
		System.out.println("Welcome to the basic calculator!");
		System.out.println("Please, enter your first number: ");
		first= input.nextDouble();
		
		System.out.println("now, please enter your second nuber: ");
		second = input.nextDouble();
		
		System.out.println("specify the operation you would like to execute(+,-,*,/): ");
		operation = input.next().charAt(0);
		if(operation == sum || operation == div || operation == sub ||operation == mult) {
			
		
			switch(operation) {
			case '+':
				result = first+second;
				break;
			case '-':
				result = first-second;
				break;
			case '*':
				result = first*second;
				break;
			case '/':
				result = first/second;
				break;
			default:
				result = result;
			}
			System.out.println(first +" "+ operation + " " + second + " = " + result);
		}else {
			System.out.println("Please, enter valid operation.");
		}	
		
	}

}
