package repl;

public class Main85 {


		public static void main(String[] args)
		{
			int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
	    int count =0;

		for(int [] one:a){
	    for(int two:one){
	      if (two%2==-1){
	        count++;
	      }else{
	        continue;
	      }    
	    }
	  }
		System.out.print(count + " ");
			
		}
	}