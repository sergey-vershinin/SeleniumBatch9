package class18;

import java.sql.SQLOutput;

public class AccessModifierDemo {

    public String name;
    private String BankAccountPassword;
    String SSNumber;

    void printInfo(){
        System.out.println(name);
        System.out.println(BankAccountPassword);
        System.out.println(SSNumber);
    }


}
