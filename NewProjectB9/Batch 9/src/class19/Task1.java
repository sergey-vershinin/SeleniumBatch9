package class19;

public class Task1 {
    String name;
    Task1(){
        System.out.println("This constructor is without a parameter");
    }
    Task1(String name){
        this.name=name;
        System.out.println("this constructor with parameter");
    }
}
