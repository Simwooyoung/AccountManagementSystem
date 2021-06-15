package Account;

import java.util.Scanner;

public class FirstQuarter extends PocketMoney   {
	
	public FirstQuarter(AccountQuarter quarter) {
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

	
	public void printInfo() {
		String squarter = getQuarterString();
		result = income - expenditure;
		System.out.println("quarter" + squarter + "date:" + date + "Content:"+ content+"Income:"+ income +"Expenditure:"+ expenditure + "Sum:" + result);
	}
	


}
