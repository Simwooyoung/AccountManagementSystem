package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.Accountmanager;

public class WindowFrame extends JFrame {
	
	Accountmanager accountManager;
	
	MenuSelection menuselection ;
	AccountViewer accountviewer ;
	AccountAdder accountadder ;
	
	public WindowFrame(Accountmanager accountManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.accountManager = accountManager;
		menuselection = new MenuSelection(this);
		accountviewer = new AccountViewer(this, this.accountManager);
		accountadder = new AccountAdder(this);
		
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}

	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
		
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}


	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}


	public AccountViewer getAccountviewer() {
		return accountviewer;
	}


	public void setAccountviewer(AccountViewer accountviewer) {
		this.accountviewer = accountviewer;
	}


	public AccountAdder getAccountadder() {
		return accountadder;
	}


	public void setAccountadder(AccountAdder accountadder) {
		this.accountadder = accountadder;
	}


}
