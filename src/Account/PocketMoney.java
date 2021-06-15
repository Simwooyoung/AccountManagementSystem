package Account;

import java.util.Scanner;

public  abstract class PocketMoney extends Account {
	
	public PocketMoney(AccountQuarter quarter) {
		super(quarter);
	}
	

	@Override
	public abstract void getUserInput(Scanner input);
	

	@Override
	public void printInfo() {
		String squarter = getQuarterString();
		result = income - expenditure;
		System.out.println("quarter" + squarter + "date:" + date + "Content:"+ content+"Income:"+ income +"Expenditure:"+ expenditure + "Sum:" + result);
	}
	
	public void setAccountincomewithYN(Scanner input) {
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
	}


}
