public class BalanceCheckPoint {
	
	//Initialize the balance of each account.
	private double lbBalance = 2000.00;
	private double gmBalance = 500.00;
	private double pmBalance = 100.00;
	private double cbBalance = 3000.00;
	
				
	public double accountBalance(int Accnum) {
		
		/*The switch case will check each case for a account number match and
		*  return the corresponding balance of the account number given
		*/
		
		double accountBalance = 0.0; 
		switch(Accnum){
			
		case 46327861:
			accountBalance = lbBalance;
			break;
			
		case 897365176:
			accountBalance = gmBalance;
			break;
			
		case 287160428:
			accountBalance = pmBalance;
			break;
			
		case 694325618:
			accountBalance = cbBalance;
			break;
		}
		return accountBalance;
	}
	
	//this will return a boolean and check whether the user is not withdrawing more than the account's current balance 
	
	public boolean balanceChecker(int myAccountNum,double userCashInput ) {	
		if(userCashInput <= accountBalance(myAccountNum)) {
			return true;
			
		}else {
			return false;
		}	
	}
}
