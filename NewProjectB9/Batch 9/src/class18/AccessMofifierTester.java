package class18;

public class AccessMofifierTester {

    public static void main(String[] args){

        AccessModifierDemo obj1 = new AccessModifierDemo();
        System.out.println(obj1.name);
       // System.out.println(obj1.BankAccountPassword); //private error message
        System.out.println(obj1.SSNumber);
    }
}
