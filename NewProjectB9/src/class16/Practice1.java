package class16;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1 = "hello my name is Sergey";
		System.out.println(var1);
		
		//no spaces
		System.out.println(var1.replace(" ", ""));
		
		String var2 = "hello my232 name is 33 333##*Sergey";
		System.out.println(var2);
		
		String  two = var2.replace("[a-zA-Z0-9 ]", "");
		System.out.println(two.replaceAll("[a-zA-Z]", "").replaceAll(" ", ""));
		System.out.println(two);
		System.out.println(two.length());
		
		
		//System.out.print(count);
	
	String var3 = "hello my232 name is 33 333##*Sergey? sfsf.";
	System.out.println(var3);
	int count3=0;
	for(int i = 0; i<=var3.length(); i++) {
		if(var3.contains("!") || var3.contains("." ) || var3.contains("?")) {
			count3 +=1;
		}
	}
	System.out.print(count3);
}

}
