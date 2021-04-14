package repl;
import java.util.Scanner; 
public class Main40 {
	

	  public static void main(String[] args){
	    Scanner input= new Scanner(System.in);
	    String responsibility;
	    System.out.println("Enter name of the instructor");
	    String name = input.nextLine();

	    switch(name)
	    {
	      case "Asghar":
	        responsibility = "Will take care of Java Assignment";
	        break;
	      case "Moazzam":
	        responsibility = "Will take care of SDLC Assignment";
	        break;
	      case "Weqas":
	        responsibility = "Will take care of Selenium Assignment";
	        break;
	      case "Asel":
	        responsibility = "Will take care of every Assignment";
	        break;
	      default:
	        responsibility = " Invalid instructor selected";
	    }
	    System.out.println(responsibility);

	    }
	  }

