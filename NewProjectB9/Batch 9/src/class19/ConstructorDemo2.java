package class19;

//import java.lang.reflect.Constructor;

public class ConstructorDemo2 {

    double bonus;
    double salary;
    String name;
    int numberofdayWOrked;
    double bonusPercentage;


    ConstructorDemo2(String name, double salary, int numberofdayWOrked, double bonusPercentage){
        this.bonus=5000;
        this.name=name;
        this.salary=salary;
        this.numberofdayWOrked=numberofdayWOrked;
        this.bonusPercentage=bonusPercentage;
    }
    void printBonus(){
       // int numberOfdayWorked=0;
        if(this.numberofdayWOrked>300){
            bonus=7000;
        }else{
            bonus=6000;
        }
    }
    public static void main(String[] args){

        ConstructorDemo2 obj1=new ConstructorDemo2("Ram",10000,300,100);
        obj1.printBonus();//first call;
        System.out.println(obj1.bonus+" bonus");
        System.out.println(obj1.salary+" salary");
        System.out.println(obj1.name+"name");
        System.out.println(obj1.bonusPercentage+" precebtage");
        System.out.println(obj1.numberofdayWOrked+ " numDays");
        obj1.printBonus();


    }
}
