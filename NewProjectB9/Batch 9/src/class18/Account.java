package class18;

public class Account {
    private double accountBalance=1000;
    private String userName;
    private String password;

    public boolean login(String enteredUserName, String enteredPassword) {
        return enteredUserName.equals(userName) && enteredUserName.equals(password);  //if statement;
    }
    public boolean signUp(String enteredUserName, String enteredPassword, double enteredAccountBalance){
        if (enteredUserName.length()>15){
            return false;
        }else{
            accountBalance=enteredAccountBalance;
            userName=enteredUserName;
            password=enteredPassword;
            return true;
        }
    }


   boolean TransferFunds(String confirmEnteredPassword, double desierdAmountTransfer) {
       if (password.equals(confirmEnteredPassword) && accountBalance>=desierdAmountTransfer) {
           return true;
       } else {
           return false;
       }
   }
}
