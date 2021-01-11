
import java.util.InputMismatchException;
import java.util.Scanner; //import scanner for user input

//extends to the bankingMethods 
class PaymayaAcc extends BankingMethods {
	
	public PaymayaAcc() {
		Scanner userInput = new Scanner(System.in);
		setAccountNumber(287160428);
			
			for(int i= 0; i<50;i++) {
				if(i == 25) {
					System.out.print("WELCOME TO PayMaya");				
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
				
				//calls the bankTransaction and the returned value will be set as the account balance.
				setAccountBalance(bankingTransaction());
				
			}catch(InputMismatchException e) {
				System.out.println("You entered a wrong input!");
				closeProgram();
			}
			
			userInput.close();	
	}
}
