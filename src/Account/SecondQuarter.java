package Account;

import java.util.Scanner;

public class SecondQuarter extends PocketMoney {
	
	
	public SecondQuarter(AccountQuarter quarter) {
		super(quarter);
	}
	
	public void getUserInput(Scanner input) {
		setAccountDate(input);
    	setAccountContent(input);
    	setAccountincomewithYN(input);
    	setAccountExpenditure(input);
		
    	int result = income - expenditure;
    	System.out.println("Sum:" + result);
	}

}
