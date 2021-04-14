package class18;

import static java.lang.System.out;

//declaring a new class
public class classPractice<sum> {
//1.
     int sum = 0;  //new int default

    //declareing the new method that will return the sum of the variables;
     int SumOfArray(int [] b) {
        for (int i : b) {
            sum += b[i];
        }
        return sum;
    }
//2.
    //second method
    public static String reverseString(String a) {
        byte[] rev = a.getBytes();
        byte[] revFinal = new byte[rev.length];

        for (int i = 0; i < rev.length; i++) {
            revFinal[i] = rev[rev.length - i - 1];
        }
        System.out.println(new String(revFinal));

        return new String(revFinal);
    }
/*
    String name  ="Sergey";
    StringBuilder obj = new StringBuilder(name);
    obj.reverse();
    name=obj.toString();
    System.out.ptintln(name);
*/
    //3.
     //private static String vowelsOnly(String str){  //can be only access from the same class;
     static String vowelsOnly(String str){
        return str.replaceAll( "[^a,i,o,u,e]", "");
        //return input.replaceAll( "[^a,e,i,o,u]", "");
    }


}