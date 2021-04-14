package repl;

public class Main88 {


		  String breed, name, color;
		 
		   void bark(String breeds){    
		      System.out.println(breeds + " can bark"); 
		    }
		    void run(String breeds){    
		      System.out.println(breeds + " can run"); 
		    }
		    void play(String breeds){    
		      System.out.println(breeds + " can play"); 
		    }
		public static void main(String[] args){

		    Main88 dog1 = new Main88();
		    Main88 dog2 = new Main88();
		    Main88 dog3 = new Main88();

		    dog1.breed = "Husky";
		    dog1.name = "dog1";
		    dog1.color = "black";
		    dog1.bark(dog1.breed );
		    dog1.run(dog1.breed );
		    dog1.play(dog1.breed );

		    dog2.breed = "Bulldog";
		    dog2.name = "dog2";
		    dog2.color = "black";
		    dog2.bark(dog2.breed );
		    dog2.run(dog2.breed );
		    dog2.play(dog2.breed );

		    dog3.breed = "Labrador";
		    dog3.name = "dog3";
		    dog3.color = "black";
		    dog3.bark(dog3.breed );
		    dog3.run(dog3.breed );
		    dog3.play(dog3.breed );
		}
		  
		}