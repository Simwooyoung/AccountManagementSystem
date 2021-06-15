import java.util.ArrayList;
import java.util.InputMismatchException;
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
		while(quarter < 1 || quarter > 3) {
			try {
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
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				quarter = -1;	
			}
		}		
	}

	public void deleteAccount() {
		System.out.print("date :");
		String accountdate = input.next();
		int index = findIndex(accountdate);
		removefromAccounts(index,  accountdate);
	}

	public int findIndex(String accountdate) {
		int index = -1;
		for (int i = 0; i<accounts.size(); i++) {
			if(accounts.get(i).getDate() == accountdate) {
				index = i;
				break;
			}
		} 
		return index;
	}

	public int removefromAccounts(int index, String accountdate) {
		if(index >= 0) {
			accounts.remove(index);
			System.out.println("the date" + accountdate + "is deleted");
			return 1;
		}
		else {
			System.out.println("the date has not been registered");
			return -1;
		}

	}

	public void editAccount() {
		System.out.print("Date :");
		String accountdate = input.next();
		for (int i = 0; i<accounts.size(); i++) {
			AccountInput account = accounts.get(i);
			if (account.getDate() == accountdate) {
				int num = -1;
				while (num != 5) {
					showEditMEnu();
					num = input.nextInt();
					switch(num) {
					case 1:
						account.setAccountDate(input);
						break;
					case 2:
						account.setAccountContent(input);
						break;
					case 3:
						account.setAccountIncome(input);
						break;
					case 4:
						account.setAccountExpenditure(input);
						break;
					default:
						continue;
					}

				}
				break;
			}
		}
	}

	public void viewAccounts() {
		System.out.println("# of registered Accounts: " + accounts.size());
		for (int i = 0; i<accounts.size(); i++) {
			accounts.get(i).printInfo();
		}

	}



	public void showEditMEnu() {
		System.out.println("*** Accounts Management System Menu ***");
		System.out.println("1. Add Accounts");
		System.out.println("2. Delete Accounts");
		System.out.println("3. Edit Accounts");
		System.out.println("4. View Accounts");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}

}
