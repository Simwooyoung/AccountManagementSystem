import java.util.Scanner;

public class Accountmanager {
	Account account;
	Scanner input;	
	Accountmanager(Scanner input){
		this.input = input;
	}
	
	public void addAccount() {
		account = new Account();
		System.out.print("Date :");
    	account.date = input.nextInt();
    	System.out.print("Content :");
    	account.content = input.next();
    	System.out.print("Income :");
    	account.income = input.nextInt();
    	System.out.print("Expenditure :");
    	account.expenditure = input.nextInt();
		int result = account.income - account.expenditure;
    	System.out.println("Sum:" + result);
		
	}
	public void deleteAccount() {
		System.out.print("date :");
    	int accountdate = input.nextInt();
    	if (account == null ) {
    		System.out.println("the date has not been registered");
    		return;
    	}
    	if(account.date == accountdate) {
    		account = null;
    		System.out.println("the date is deleted");
    	}
	}
	
	public void editAccount() {
		System.out.print("Date :");
    	int accountdate = input.nextInt();
    	if (account.date == accountdate) {
    		System.out.println("the date to be edited is " + accountdate);
    	}
	}
	
	public void viewAccount() {
		System.out.print("Date :");
    	int accountdate = input.nextInt();
    	if (account.date == accountdate) {
    		account.printInfo();
    	}
	}

}
