package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Accountmanager accountManager = getObject("accountmanager.ser");
		if (accountManager == null) {
			 accountManager = new Accountmanager(input);
		}
		else {
			accountManager.setScanner(input);
		}

		WindowFrame frame = new WindowFrame(accountManager);
		selectMenu(input, accountManager);
		putObject(accountManager, "accountmanager.ser");
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
					logger.log("add an account");
					break;
				case 2:
					accountManager.deleteAccount();
					logger.log("delete an account");
					break;
				case 3:
					accountManager.editAccount();
					logger.log("edit an account");
					break;
				case 4:
					accountManager.viewAccounts();
					logger.log("view a list of account");
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
	
	public static Accountmanager getObject(String filename) {
		Accountmanager accountManager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			accountManager = (Accountmanager) in.readObject();
			
			in.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			return accountManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return accountManager;
	}
	
	public static void putObject(Accountmanager accountManager ,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(accountManager);
			
			out.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

