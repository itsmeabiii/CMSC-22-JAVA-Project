
public class PinCheckPoint {
	
	//Initialize each pin code of the account
	private int lbpin = 2152;
	private int gmpin = 8756;
	private int pmpin = 7650;
	private int cbpin = 3951;
	
	/*
	 * Will return the corresponding pin of the account number given
	 */
	
	public int getPin(int AccNum) {
		int accountPin = 0; 
		
		switch(AccNum){
			
		case 46327861:
			accountPin = lbpin;
			break;
			
		case 897365176:
			accountPin = gmpin;
			break;
			
		case 287160428:
			accountPin = pmpin;
			break;
			
		case 694325618:
			accountPin = cbpin;
			break;
		}
		return accountPin;
	}
	
	//This will return a boolean depending if the user's pin code matched with the account number given
	public boolean pinVerification(int userAccount, int userPinInput) {
		if(userPinInput == getPin(userAccount)) {
			return true;
			
		}else {
			return false; 
		}
	}
}
