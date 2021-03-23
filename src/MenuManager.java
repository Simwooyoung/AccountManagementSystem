import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);		
		
		while (num != 6) {
		    System.out.println("*** Accounts Management System Menu ***");
		    System.out.println("1. Add Accounts");
		    System.out.println("2. Delete Accounts");
		    System.out.println("3. Edit Accounts");
		    System.out.println("4. View Accounts");
		    System.out.println("5. Show a menu");
		    System.out.println("6. Exit");
		    System.out.println("Select one number between 1 - 6:");
		    num = input.nextInt();
		    switch(num) {
		    case 1:
		    	System.out.print("Date :");
		    	String accountdate = input.next();
		    	System.out.print("Content :");
		    	String accountname = input.next();
		    	System.out.print("Income :");
		    	int income = input.nextInt();
		    	System.out.print("Expenditure :");
		    	int expend = input.nextInt();
		    	int result = income + expend;
		    	System.out.println("Sum:" + result);
		    	break;
		    case 2:
		    case 3:
		    case 4:
		    	System.out.print("Date :");
		    	String date = input.next();
		 
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
