package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Account.AccountInput;
import manager.Accountmanager;

public class AccountViewer extends JPanel{

	WindowFrame frame;
	
	Accountmanager accountManager;
	
	public Accountmanager getAccountManager() {
		return accountManager;
	}

	public void setAccountManager(Accountmanager accountManager) {
		this.accountManager = accountManager;
		this.removeAll();
	
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date");
		model.addColumn("Content");
		model.addColumn("Income");
		model.addColumn("Expenditure");
		model.addColumn("Sum");
		
		for (int i=0; i< accountManager.size(); i++) {
			Vector row = new Vector();
			AccountInput si = accountManager.get(i);
			row.add(si.getDate());
			row.add(si.getContent());
			row.add(si.getIncome());
			row.add(si.getExpenditure());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}


	public AccountViewer(WindowFrame frame, Accountmanager accountManager) {
		this.frame = frame;
		this.accountManager = accountManager;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date");
		model.addColumn("Content");
		model.addColumn("Income");
		model.addColumn("Expenditure");
		model.addColumn("Sum");
		
		for (int i=0; i< accountManager.size(); i++) {
			Vector row = new Vector();
			AccountInput si = accountManager.get(i);
			row.add(si.getDate());
			row.add(si.getContent());
			row.add(si.getIncome());
			row.add(si.getExpenditure());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
