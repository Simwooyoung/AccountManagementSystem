import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Accountmanager accountManager = new Accountmanager(input);
		
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
		    	accountManager.addAccount();
		    }
		    else if(num == 2) {
		    	accountManager.deleteAccount();
		    }
		    else if(num == 3) {
		    	accountManager.editAccount();
		    }
		    else if(num == 4) {
		    	accountManager.viewAccount();
		    }
		    else {
		    	continue;
		    }
		  		 
		    
		}
		
	}

}


*** Accounts Management System Menu ***
1. Add Accounts
2. Delete Accounts
3. Edit Accounts
4. View Accounts
5. Show a menu
6. Exit
Select one number between 1 - 6:
1
Date :3/30
Content :알바비
Income :200000
Expenditure :0
Sum:200000
*** Accounts Management System Menu ***
1. Add Accounts
2. Delete Accounts
3. Edit Accounts
4. View Accounts
5. Show a menu
6. Exit
Select one number between 1 - 6:
1
Date :3/31
Content :음식
Income :0
Expenditure :-20000
Sum:-20000
*** Accounts Management System Menu ***
1. Add Accounts
2. Delete Accounts
3. Edit Accounts
4. View Accounts
5. Show a menu
6. Exit
Select one number between 1 - 6:
2
Date :3/31
*** Accounts Management System Menu ***
1. Add Accounts
2. Delete Accounts
3. Edit Accounts
4. View Accounts
5. Show a menu
6. Exit
Select one number between 1 - 6:
