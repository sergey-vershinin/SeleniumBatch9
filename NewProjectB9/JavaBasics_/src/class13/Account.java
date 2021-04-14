package class13;

public class Account {
	
	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String passedUserNameWhenLogging, String passedPasswordWhenLogging) {
		if(userName.equals(passedUserNameWhenLogging)&& password.equals(passedPasswordWhenLogging)) {
			System.out.println("welcome to BA, your balance is " + balance);
		}
	}
		
	
		public void printInfo() {
			if(isLoggedIn) {
				System.out.println("Your account number is "+ accountNumber+ "Your balance is"+ balance);
			}
		}
	}
	
