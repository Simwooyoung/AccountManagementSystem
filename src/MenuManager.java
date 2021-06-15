import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Accountmanager accountManager = new Accountmanager(input);
		
		selectMenu(input, accountManager);
	}
	
	public static void selectMenu(Scanner input, Accountmanager accountManager) {
		int num = -1;
		while (num != 5) {
			try {
		        showMenu();
		        num = input.nextInt();
		        switch(num) {
		        case 1:
		    	    accountManager.addAccount();
		    	    break;
		        case 2:
		    	    accountManager.deleteAccount();
		    	    break;
		        case 3:
		    	    accountManager.editAccount();
		    	    break;
		        case 4:
		    	     accountManager.viewAccounts();
		    	    break;
		        default:
		    	    continue;
		        }
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;				 
			}
		}
	}

    public static void showMenu() {
	   System.out.println("*** Accounts Management System Menu ***");
       System.out.println("1. Add Accounts");
       System.out.println("2. Delete Accounts");
       System.out.println("3. Edit Accounts");
       System.out.println("4. View Accounts");
       System.out.println("5. Exit");
       System.out.println("Select one number between 1 - 5:");
 }
}
