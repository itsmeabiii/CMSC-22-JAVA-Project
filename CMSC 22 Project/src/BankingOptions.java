
import java.util.Scanner; //enables the program to ask for user's input

public class BankingOptions extends BankingMethods {

	public static void main(String[] args) {
		
		//Initialize variables 
		BankFactory myBank = new BankFactory();	           
		BankingMethods theBank;
		Scanner userInput = new Scanner(System.in);            
		String bankName = null;
		
		//this loop is for the title.
		
		for(int i= 0; i<60;i++) {
			if(i == 30) {
				System.out.print("My Banks");				
			}else {
				System.out.print("=");
			}
		}
			
		System.out.println("\n\tHello! What bank would you like to access today?\n\t\ta.) Landbank\n\t\tb.) Gcash\n\t\tc.) Paymaya\n"
				          + "\t\td.) CIMB Bank\n\tPlease input the letter of your choice. Thank you!");
		
		//try and catch blocks for error handling.
		try {
			
			String myChosenBank = userInput.nextLine(); 
			
			/*Switch case. If myChosenBank matched with one of the cases then it will assign the name of the user's chosen bank to bankName
			 *and it will be passed to the myBank which is the bankFactory
			*/
			switch(myChosenBank.toLowerCase()) {
				
				case "a":
					System.out.println("Your chosen Bank is LandBank, Happy Banking!\n");
					bankName = "LandBank";
					break;	
					
				case "b":
					System.out.println("Your chosen Bank is Gcash! Enjoy Shopping Online!\n");	
					bankName = "Gcash";
					break;
				
				case "c":
					System.out.println("Your chosen Bank is Paymaya! Enjoy Paying your bills!\n");
					bankName = "PayMaya";
					break;
					
				case "d":
					System.out.println("Your chosen Bank is CIMB! Don't forget to save money!\n");	
					bankName = "CIMB";
					break;
			}	
				
			theBank = myBank.chooseBank(bankName);
			displayBankInfo(theBank); // the returned value of theBank will be passed to displayBankInfo
				
		}catch(NullPointerException e) {
			System.out.println("Invalid Input");
		}		
				
	userInput.close(); 
}

	public static void displayBankInfo(BankingMethods theBankMethods) {
		theBankMethods.displayInfo(); 	
		//display the current balance
	}
}


