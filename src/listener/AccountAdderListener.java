package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Account.AccountInput;
import Account.AccountQuarter;
import Account.FirstQuarter;
import manager.Accountmanager;

public class AccountAdderListener implements ActionListener {
	JTextField txtDate;
	JTextField txtContent;
	JTextField txtIncome;
	JTextField txtExpenditure;
	JTextField txtSum;

	Accountmanager accountManager;

	public AccountAdderListener(
			JTextField txtDate, 
			JTextField txtContent, 
			JTextField txtIncome,
			JTextField txtExpenditure, 
			JTextField txtSum, Accountmanager accountManager) {

		this.txtDate = txtDate;
		this.txtContent = txtContent;
		this.txtIncome = txtIncome;
		this.txtExpenditure = txtExpenditure;
		this.txtSum = txtSum;
		this.accountManager = accountManager;
	}		

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(txtDate);
		System.out.println(txtContent);
		System.out.println(txtIncome);
		System.out.println(txtExpenditure);
		System.out.println(txtSum);
		
		AccountInput account =  new FirstQuarter(AccountQuarter.Firstquarter);
		
		account.setDate(txtDate.getName());
		account.setContent(txtContent.getName());
		account.setIncome(Integer.parseInt(txtIncome.getText()));
		account.setExpenditure(Integer.parseInt(txtExpenditure.getText()));
		accountManager.addAccount(account);
		putObject(accountManager, "accountmanager.ser");
		account.printInfo();
		
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
