
public class BankFacade {
	
	/* This class will simplify the process of bank transaction. Using the facade design pattern the complicated 
	 * stuff of withdrawing/depositing will be simplified and hidden from the clients side.
	 */
	
	/*
	 * Declare variables to be used.
	 */
	private int newAccountNumber;
	private int userInputPin;
	
	PinCheckPoint 	     pinVerify;
	BalanceCheckPoint    getBalance;
	WithdrawDeposit      withDepFunction;
	
	public BankFacade(int myAccountNumber, int myAccountPin) {
		/*
		 * Initialize variables with the values passed.
		 */
		
		newAccountNumber = myAccountNumber;
		userInputPin = myAccountPin;
		
		pinVerify = new PinCheckPoint();
		getBalance = new BalanceCheckPoint();
		withDepFunction = new WithdrawDeposit();	
	}
	
	
	public boolean verifyPinCode(){
		//will return true or false if the pin of entered by the user matched with the account number
		return pinVerify.pinVerification(newAccountNumber, userInputPin);
	}
	
	/*
	 * cashDeposit's function is to deposit the user's cash input
	 * it will first pass the values (current balance and user's cash input) to
	 * depositCash that is under withDepFunction that will do the calculation 
	 * and print a message that transaction is complete then return the sum(account's new balance)
	 */
	public double cashDeposit(double myDepAmount) {
		System.out.print("Transaction successfully made! Thank you for banking with us!\n");
		return (withDepFunction.depositCash(myDepAmount, getBalance()));
	}

	/*
	 * cashWithdraw will first check if the user's current balance will allow a withdraw  then if true it will pass the 
	 * user's cash input and the current balance then the withdrawCash under withDepFuntion will do the calculation and
	 * print the message return the new balance. However if false it will just print the message and return the account's original balance.
	 */
	public double cashWithdraw(double myWithAmount) {
		double cashOut = 0.0;
		if(getBalance.balanceChecker(newAccountNumber, myWithAmount)) {
			cashOut = withDepFunction.withdrawCash(myWithAmount, getBalance());
			System.out.print("Transaction successfully made! Thank you for banking with us!\n");
			
		}else {
			System.out.print("Transaction not successfull :((");
			cashOut = getBalance();
		}
		return cashOut;	
	}
	
	/*
	 * return the current balance of the account 
	 */
	
	public double getBalance() {
		double currBalance = getBalance.accountBalance(newAccountNumber);
		return currBalance;
	}

}
