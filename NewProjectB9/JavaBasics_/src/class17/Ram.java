package class17;

public class Ram {
	
  public static void main (String[] args) {
  
  int salary = 55435445;
  StringBuilder sb = new StringBuilder(String.valueOf(salary));
  sb.reverse();
  salary = Integer.parseInt(sb.toString());
  System.out.println(salary);
  
	}
}
