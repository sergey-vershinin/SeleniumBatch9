package class13;

public class SimpleClass {

	String var1;
	int va2;
	
	public void method1() {
		System.out.println( "Value of var 1 is "+ var1);
	}
	
	public String returnTheValueOfVar1() {
		return var1;
		//return "Monica";
	}
	
	public void method2(String variable1) {
		var1=variable1;
	}
}

/*
public class Main {
	public static void main(String[] args) {
		SimpleClass class1 = new SimpleClass();
		class1.var1="Eva";
		class1.method1();
		}
}
*/