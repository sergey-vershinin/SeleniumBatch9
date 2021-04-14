package repl;
import java.util.Scanner; 

public class Main35 {
	
	
	  public static void main(String[] args){
	    
	    
	    String eligibility = "efef";
	    Scanner input = new Scanner(System.in);
	    System.out.println("Do you need a loan?");
	    boolean loan_q = input.nextBoolean();

	  if(loan_q){
	      System.out.println("What is your credit score?");
	      int score = input.nextInt();
	      if(score<600){
	        eligibility = "Not eligible";
	      }else if(score>=600 && score <=700){
	        eligibility = "Maybe eligible";
	      }else if(score>700 && score<=800){
	        eligibility = "Eligible";
	      }else if (score>800){
	        eligibility = "Definitely eligible";
	      }
	  }else{
	      eligibility = "uknown";
	      System.out.println(eligibility);
	      return;
	  }
	  System.out.println("The eligibility is " + eligibility);

	  }
	 
	}
