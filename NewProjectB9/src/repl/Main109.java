package repl;

public class Main109 {
		  //declaration of a new method
		  void newLine(){
		    System.out.println("newLine method implementation");
		  }

		//calling a main mrthod
		public static void main(String[] args){

		//declaration of an object of a Main class
		Main109 obj = new Main109();

		//calling newLine method
		for(int i=0; i<3; i++)
		{
		  obj.newLine();
		}
		}
}