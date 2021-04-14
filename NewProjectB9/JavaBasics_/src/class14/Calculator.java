package class14;

public class Calculator {

	//public static void main(String[] args) {
		
		int add (int num1, int num2) {
			return num1+num2;
		}
		
		double sub(double num1, double num2) {
			return num1-num2;
		}
		
		double mult(double num1, double num2) {
			return num1*num2;
		}
		
		double div(double num1, double num2) {
			if(num2!=0) {
				return num1/num2;
			}else {
				return 0;
			}
		}

	}
