package class18;

public class classPracticeTester {
    //main method
    public static void main(String[] args){
        //new array, that can be access from anywhere i the package;
        classPractice obj1 = new classPractice();
        int arr[] = {1,1,1,1};

        System.out.println(obj1.SumOfArray(arr));  // calling a method to return the sum of th array;

        String str = "Hello world!";  //declare the new string
        System.out.println(obj1.reverseString(str)); //cal method the reverse the string;

        //String str2 = "dewe3ds";
        System.out.println(obj1.vowelsOnly("asdedsa"));
    }
}
