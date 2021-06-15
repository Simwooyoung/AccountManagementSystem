package Account;

import java.util.Scanner;

public class ThirdQuarterAccount extends Account  {
	
	protected int poketmoney;
	
	public ThirdQuarterAccount(AccountQuarter quarter) {
		super(quarter);
	}
	
	public void getUserInput(Scanner input) {
		setAccountDate(input);
    	setAccountContent(input);
    	
    	char answer = 'x';
    	while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
    	{
    		System.out.println("Is this a poket money? (Y/N)");
    	    answer = input.next().charAt(0);
    	    if(answer == 'y' || answer == 'Y') {
    	    	 setAccountIncome(input);
        	    break;
    	    }
    	    else if (answer == 'n' || answer == 'N') {
    	    	 System.out.print("income :");
         	    int income = input.nextInt();
    	    	this.setIncome(income);
    		    break;
    	    }
    	    else {  		
    	    }
    	}    	
    	setAccountExpenditure(input);
		
    	int result = income - expenditure;
    	System.out.println("Sum:" + result);
	}
	
	public void printInfo() {
		String squarter = getQuarterString();
		result = income - expenditure;
		System.out.println("quarter" + squarter + "date:" + date + "Content:"+ content+"poket money:"+ income +"Expenditure:"+ expenditure  + "Income:"+ income + "Sum:" + result  );
	}

}


