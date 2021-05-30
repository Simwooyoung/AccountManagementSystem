import java.util.ArrayList;
import java.util.Scanner;
import Account.Account;
import Account.AccountInput;
import Account.AccountQuarter;
import Account.FirstQuarter;
import Account.SecondQuarter;
import Account.ThirdQuarterAccount;

public class Accountmanager {
	ArrayList<AccountInput> accounts = new ArrayList<AccountInput>();
	Scanner input;	
	Accountmanager(Scanner input){
		this.input = input;
	}
	
	public void addAccount() {
		int quarter = 0;
		AccountInput accountInput;
		while(quarter!= 1 && quarter!= 2) {
		System.out.println("1 for firstquarter:");
		System.out.println("2 for secondquarter:");
		System.out.println("3 for thirdquarter:");
		System.out.print("Select num 1,2, or 3 for Account Quarter:");
		quarter = input.nextInt();
		if (quarter == 1) {
			 accountInput = new FirstQuarter(AccountQuarter.Firstquarter);
			 accountInput.getUserInput(input);
		     accounts.add(accountInput);
			break;
		}
		else if (quarter == 2) {
			 accountInput = new SecondQuarter(AccountQuarter.Secondquarter);
			 accountInput.getUserInput(input);
		     accounts.add(accountInput);
			break;
		}
		else if (quarter == 3) {
			 accountInput = new ThirdQuarterAccount(AccountQuarter.Thirdquarter);
			 accountInput.getUserInput(input);
		     accounts.add(accountInput);
			break;
		}	
		else {
			System.out.print("Select num for Account Quarter between 1,2 or 3 : ");
		}
      }		
	}
	
	public void deleteAccount() {
		System.out.print("date :");
    	String accountdate = input.next();
    	int index = -1;
    	for (int i = 0; i<accounts.size(); i++) {
    		if(accounts.get(i).getDate() == accountdate) {
        		index = i;
        		break;
        	}
    	}
    	
    	if(index >= 0) {
    		accounts.remove(index);
    		System.out.println("the date" + accountdate + "is deleted");
    	}
    	else {
    		System.out.println("the date has not been registered");
    		return;
    	}
    
	}
	
	public void editAccount() {
		System.out.print("Date :");
    	String accountdate = input.next();
    	for (int i = 0; i<accounts.size(); i++) {
    		AccountInput accountInput = accounts.get(i);
    		if (accountInput.getDate() == accountdate) {
        		int num = -1;
        		while (num != 5) {
        		    System.out.println("*** Accounts Management System Menu ***");
        		    System.out.println("1. Add Accounts");
        		    System.out.println("2. Delete Accounts");
        		    System.out.println("3. Edit Accounts");
        		    System.out.println("4. View Accounts");
        		    System.out.println("5. Exit");
        		    System.out.println("Select one number between 1 - 5:");
        		    num = input.nextInt();
        		    if(num == 1) {
        		    	System.out.print("Date:");
        		    	String date = input.next();
        		    	accountInput.setDate(date);
        		    }
        		    else if(num == 2) {
        		    	System.out.print("Content:");
        		    	String contnet = input.next();
        		    	accountInput.setContent(contnet);
        		    }
        		    else if(num == 3) {
        		    	System.out.print("Income:");
        		    	int income = input.nextInt();
        		    	accountInput.setIncome(income);
        		    }
        		    else if(num == 4) {
        		    	System.out.print("Expenditure:");
        		    	int expenditure = input.nextInt();
        		    	accountInput.setExpenditure(expenditure);
        		    }
        		    else {
        		    	continue;
        		    }
        		}
        		break;
        	}
        }
	}
	
	public void viewAccounts() {
		//System.out.print("Date :");
    	//int accountdate = input.nextInt();
		System.out.println("# of registered Accounts: " + accounts.size());
		for (int i = 0; i<accounts.size(); i++) {
			accounts.get(i).printInfo();
		}
	
	}

}
