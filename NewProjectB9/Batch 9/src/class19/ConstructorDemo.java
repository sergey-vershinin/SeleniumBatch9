package class19;

import java.util.Scanner;

public class ConstructorDemo {
    //first constructor
    ConstructorDemo(){
        System.out.println("ConstructorDemo");
    }
    //second constructor
    int returnNumber(){
        return 10;
    }

    public static void main(String[] args){
        ConstructorDemo obj1 = new ConstructorDemo();
        int var1 = obj1.returnNumber();
        Scanner scanner = new Scanner(System.in);


    }
}
