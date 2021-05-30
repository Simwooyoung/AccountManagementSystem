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
		    	accountManager.viewAccounts();
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
5. Exit
Select one number between 1 - 5:
1
1 for firstquarter:
2 for secondquarter:
3 for thirdquarter:
Select num 1,2, or 3 for Account Quarter:2
Date :5/3
Content :책구입
Is this a poket money? (Y/N)
n
income :0
Expenditure :10000
Sum:-10000
*** Accounts Management System Menu ***
1. Add Accounts
2. Delete Accounts
3. Edit Accounts
4. View Accounts
5. Exit
Select one number between 1 - 5:
4
# of registered Accounts: 1
quarterSecond.date:5/3Content:책구입Income:0Expenditure:10000Sum:-10000
*** Accounts Management System Menu ***
1. Add Accounts
2. Delete Accounts
3. Edit Accounts
4. View Accounts
5. Exit
Select one number between 1 - 5:
