package reviewClass5;

//import java.sql.SQLOutput;

public class EmployeeTest {

    public static void main(String[] args){
        Employee obj = new Employee();

        obj.name = "Sergey";
        obj.id = "3123123";
        obj.department = "IT";
        obj.salary = 222222;

        Employee obj2 = new Employee();
        obj2.name = "Alex";
        obj2.id = "3123123";
        obj2.department = "IT";
        obj2.salary = 222222;

        Employee[] employee=new Employee[2];
        employee[0] = obj;
        employee[1] = obj2;

        for (int i =0; i<employee.length; i++){
            System.out.println(employee[i].name + ", "+employee[i].id + ", "+employee[i].department + ", "+employee[i].salary + ";" );
            employee[i].work();
            System.out.println();
        }

    }
}
