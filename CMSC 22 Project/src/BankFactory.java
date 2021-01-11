public class BankFactory {
	
	public BankingMethods chooseBank(String chosenBank){
		/* The bank factory will return the bank that the client want to access by using the switch case. It will compare 
		*  the passed value to the switch's cases and return the class that matched the client's choice.
		*/
		
		BankingMethods bankSelection = null;
		
		switch(chosenBank) {
		
		case "LandBank":
			bankSelection = new LandbankAcc();
			break;
			
		case "Gcash":
			bankSelection = new GcashAcc();
			break;
			
		case "PayMaya":
			bankSelection = new PaymayaAcc();
			break;
		
		case "CIMB":
			bankSelection = new CimbAcc();
			break;
		}
		return bankSelection;
	}
	
}

