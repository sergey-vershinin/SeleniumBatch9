package class17;


//crating the local variables;


public class Method_scope {
	

	void printInfo(String name) {
		String phonenumber ="123454343";
		System.out.println(name);
	}
	
	void printWithAdress(String name, String adress) {
		System.out.println(name+adress);
	}
	
	//main
	public static void main(String[] args) {
		String name = "Local";
		
		for (int i =0; i<5; i++) {
			System.out.println(i);
		}
	}
}
