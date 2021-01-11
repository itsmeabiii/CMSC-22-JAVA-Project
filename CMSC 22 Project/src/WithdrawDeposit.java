
public class WithdrawDeposit{
	
	//This will handle every account withdraw and deposit and return the account's new balance after the calculations
	
	public double withdrawCash(double userCash, double myBalance) {
		myBalance -= userCash;
		return myBalance;
	}
	
	public double depositCash(double userCash, double myBalance) {
		myBalance += userCash;
		return myBalance;
	}
}
