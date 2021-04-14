package class16;

public class ReplaceDemo {
	public static void main(String[] args) {
		String var1="hello";
		var1=var1.replace('e', 'a');
		System.out.println(var1);
		String var2 = "Synatx is the best. Batch 9 is best.";
		System.out.println(var2.replace("best", "amazing"));
		
		//regular expression 
		String var3 = "Synatx is the best3443. Batch 9 is best.";
		System.out.println(var3.replace("3443", ""));
		
		//replace all the numbers
		System.out.println(var3.replace("[0-9", ""));
		
		//replace special charectors
		System.out.println(var3.replace("[a-z", ""));
		
		String var4 = "Synatx is the best3443. Batch 9 is best.";
		System.out.println(var4.replaceAll("[^a-zA-Z]", ""));
	}
}
