package class13;

public class Main{
	public static void main(String[] args) {
		SimpleClass class1 = new SimpleClass();
		class1.var1="Eva";
		class1.method1();
		class1.method2("Azizillah"); //either first or second /class1.var1="Eva";
		
		String var1 = class1.returnTheValueOfVar1();
		System.out.println(var1);
		}
	
}