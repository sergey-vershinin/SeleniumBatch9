package class13;

public class BankApplication {

	public static void main(String[] args) {
		
		Account ghulamsAccount = new Account();
		ghulamsAccount.accountNumber="123";
		ghulamsAccount.userName = "GHulmn123";
		ghulamsAccount.password = "pass123";
		ghulamsAccount.balance=1400;
		
		ghulamsAccount.login("GHulmn123", "pass123");
	}

}
