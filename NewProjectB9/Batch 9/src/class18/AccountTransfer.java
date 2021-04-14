package class18;

import java.util.Scanner;

public class AccountTransfer {
    public static void main(String[] args){
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter 1 for signup, 2 for the login, 3 for transfer, 4 to exit the program");
            int input = scanner.nextInt();
            if(input ==4){
                break;
            }else if(input==3) {
                System.out.println("Enter the amount you want to tranfer: ");
                double amount = scanner.nextDouble();
                System.out.println("please, renetered your password");
                String pass = scanner.next();
                account.TransferFunds(pass, amount);
            }else if(input==2){
                System.out.println("Welcome to our bank, please neter your user name and password");
                String username=scanner.next();
                String password=scanner.next();
                account.login(username, password);
            }else if(input==1){
                System.out.println("Enter your user name, password and the amount you would like to deposit:");
                account.signUp(scanner.next(),scanner.next(), scanner.nextDouble());
            }
        }
        System.out.println("Thank you, Bye!");
    }
}
