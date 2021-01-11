
import java.util.InputMismatchException;
import java.util.Scanner; //import scanner for user input

//extends to the bankingMethods 
class CimbAcc extends BankingMethods {
	
	public CimbAcc() {
		Scanner userInput = new Scanner(System.in);	
		setAccountNumber(694325618);
	
			for(int i= 0; i<50;i++) {
				if(i == 25) {
					System.out.print("WELCOME TO CIMB BANK");				
				}else {
					System.out.print("=");
				}
			}
			
			//print the Hi statement with the account number 
			System.out.println("\n\t\tHi! Account Number: " + getAccountNumber());
			
			//try and catch block for error handling.
			try {
				
				System.out.println("\t\tKindly input your account pin:");
				setAccountPin(userInput.nextInt());	 
				//sets the user input as the account pin
			
				setAccountBalance(bankingTransaction());
				
			}catch(InputMismatchException e) {
				System.out.println("Wrong Input!!");
				closeProgram();
			}
				
			userInput.close();	
	}
}

