import java.util.Scanner;

public abstract class BankingMethods {
	
	//Declare variables. 
	private int accountNumber;
	private int accountPin;
	private double accountBalance;
				
	/*All the banks will need to verify the pin code and if true then it will proceed to ask if it wants to deposit, withdraw
	 * or check the balance. 
	 */
	final double bankingTransaction() {
	
		double newBalance = 0.0;
			Scanner userInt = new Scanner(System.in);
			/*The bankFacade is called and the account number and the pin is passed. Later on, the program can use the 
			 * accessMyAccount  when needed to perform pin verification, withdraw, deposit or check balance.
			 */
			BankFacade accessMyAccount = new BankFacade(getAccountNumber(), getAccountPin());	
			
			//if-else statement. If true then it will proceed to ask the client what it would like to do, else it will terminate the program.
			if(accessMyAccount.verifyPinCode()) {	
				System.out.println("Would you like to:\n\t\t"
						+ "a.) Withdraw\n\t\t"
						+ "b.) Deposit\n\t\t"
						+ "c.) Check Balance");
				
				/*Since java is case sensitive and if the user's input is in capital letters then toLowerCase() will  
				 *change it to lower case to avoid errors due to its case sensitivity.
				*/
				String myChoice = userInt.nextLine().toLowerCase(); 
				
				//Switch case, whichever case matched with myChoice it will execute the code under that case.
				switch(myChoice) {	
					case "a":
						/*For withdrawing cash, accessMyAccount.cashWithdraw will return the new cash balance of the account
						 * after withdrawing money and store it to the variable newBalance.
						 */
						System.out.println("You are withdrawing your money, please enter the amount!:");
						newBalance = accessMyAccount.cashWithdraw(userInt.nextDouble());
						break;		
					
					case "b":
						/*For depositing cash, accessMyAccount.cashDeposit will return the cash balance of the account 
						 * after adding the money the client wish to deposit and store it to newBalance.
						 */
						System.out.println("You are making a deposit, please enter amount:!");	
						newBalance = accessMyAccount.cashDeposit(userInt.nextDouble());	
						break;
					
					case "c":
						//accessMyAccount.getBalance will return the balance of the account and store it to newBalance
						newBalance = accessMyAccount.getBalance();
						break;
							
					default:
						System.out.print("Choose between a , b and c only!");
						closeProgram();
					}
				
				
			}else {
				System.out.print("Warning! you entered a wrong pin"); //if the pin is not correct it will print this message and close the program.
				closeProgram();		
			}	
			userInt.close();
			return newBalance; //return the new account balance.	 
}
	
	//return a boolean value, true if the pin is correct.
	final boolean verifyMyPin() {
		BankFacade accessMyAccount = new BankFacade(getAccountNumber(), getAccountPin());
		return accessMyAccount.verifyPinCode();
	}
	
	// getter and setter for account number, pin and account balance and where the money is from (deposit) or where it will be used(Withdraw).
	final void setAccountNumber(int newAccountNumber) {
		accountNumber = newAccountNumber;					
	}
	final void setAccountPin(int newAccountPin) {
		accountPin = newAccountPin;
	}
	final void setAccountBalance(double newAccountBalance) {
		accountBalance = newAccountBalance;
	}
	public int getAccountNumber() {return accountNumber;}
	
	public int getAccountPin() {return accountPin;}
	
	public double getAccountBalance() {return accountBalance;}
		
	//close program, if this method is called it will automatically terminate the program.
	public void closeProgram() {
		 System.exit(0); 	
	}					 
	
	//This method will display the account balance and where the money is from or where it is used.
	public void displayInfo() {
		System.out.println("CurrentBalance:\t" + getAccountBalance());
	}
	
}
