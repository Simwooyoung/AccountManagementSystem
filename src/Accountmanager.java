import java.util.ArrayList;
import java.util.Scanner;

import Account.Account;

public class Accountmanager {
	ArrayList<Account> accounts = new ArrayList<Account>();
	Scanner input;	
	Accountmanager(Scanner input){
		this.input = input;
	}
	
	public void addAccount() {
		int quarter = 0;
		Account account;
		while(quarter!= 1 && quarter!= 2) {
		System.out.print("1 for firstquarter:");
		System.out.print("2 for secondquarter:");
		System.out.print("Select num for Account Quarter:");
		quarter = input.nextInt();
		if (quarter == 1) {
			 account = new Account();
		     accounts.add(account);
			break;
		}
		else if (quarter == 2) {
			 account = new Account();
		     accounts.add(account);
			break;
		}
		else {
			System.out.print("Select num for Account Quarter between 1 and 2");
		}
      }		
	}
	
	public void deleteAccount() {
		System.out.print("date :");
    	int accountdate = input.nextInt();
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
    	int accountdate = input.nextInt();
    	for (int i = 0; i<accounts.size(); i++) {
    		Account account = accounts.get(i);
    		if (accounts.get(i).getDate() == accountdate) {
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
        		    	int date = input.nextInt();
        		    	account.setDate(date);
        		    }
        		    else if(num == 2) {
        		    	System.out.print("Content:");
        		    	String contnet = input.next();
        		    	account.setContent(contnet);
        		    }
        		    else if(num == 3) {
        		    	System.out.print("Income:");
        		    	int income = input.nextInt();
        		    	account.setIncome(income);
        		    }
        		    else if(num == 4) {
        		    	System.out.print("Expenditure:");
        		    	int expenditure = input.nextInt();
        		    	account.setExpenditure(expenditure);
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
		System.out.println("# of registered Accounts: " +accounts.size());
		for (int i = 0; i<accounts.size(); i++) {
			accounts.get(i).printInfo();
		}
	
	}

}
