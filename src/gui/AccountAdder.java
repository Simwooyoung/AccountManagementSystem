package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;

import listener.AccountAdderCancelListener;
import listener.AccountAdderListener;
import manager.Accountmanager;

public class AccountAdder extends JPanel {
	
	WindowFrame frame;
	Accountmanager accountManager;

    public AccountAdder(WindowFrame frame, Accountmanager accountManager) {
    	this.frame = frame;
    	this.accountManager = accountManager;
    	
    	JPanel panel = new JPanel();
       panel.setLayout(new GridBagLayout());
       
       JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
       GridBagConstraints gbc = new GridBagConstraints();
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 0;
       gbc.gridy = 0;
       gbc.insets = new Insets(0, 10, 0, 0);
       gbc.weightx = 1;
       panel.add(labelDate, gbc);
       
       JTextField txtDate = new JTextField();
       gbc = new GridBagConstraints();
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridwidth = 3;
       gbc.gridx = 1;
       gbc.gridy = 0;
       gbc.insets = new Insets(5, 0, 0, 10);
       gbc.weightx = 1;
       panel.add(txtDate, gbc);

       JLabel labelContent = new JLabel("Content: ", JLabel.TRAILING);
       gbc = new GridBagConstraints();
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 0;
       gbc.gridy = 1;
       gbc.insets = new Insets(0, 10, 0, 0);
       gbc.weightx = 1;
       panel.add(labelContent, gbc);
       
       JTextField txtContent = new JTextField();
       gbc = new GridBagConstraints();
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridwidth = 3;
       gbc.gridx = 1;
       gbc.gridy = 1;
       gbc.insets = new Insets(5, 0, 0, 10);
       gbc.weightx = 1;
       panel.add(txtContent, gbc);

       JLabel labelIncome = new JLabel("Income : ", JLabel.TRAILING);
       gbc = new GridBagConstraints();
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 0;
       gbc.gridy = 2;
       gbc.insets = new Insets(0, 10, 0, 0);
       gbc.weightx = 1;
       panel.add(labelIncome, gbc);
       
       JTextField txtIncome = new JTextField();
       gbc = new GridBagConstraints();
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridwidth = 3;
       gbc.gridx = 1;
       gbc.gridy = 2;
       gbc.weightx = 1;
       gbc.insets = new Insets(5, 0, 0, 10);
       panel.add(txtIncome, gbc);

       JLabel labelExpenditure = new JLabel("Expenditure: ", JLabel.TRAILING);
       gbc = new GridBagConstraints();
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 0;
       gbc.gridy = 3;
       gbc.insets = new Insets(0, 10, 0, 0);
       gbc.weightx = 1;
       panel.add(labelExpenditure, gbc);
       
       JTextField txtExpenditure = new JTextField();
       gbc = new GridBagConstraints();
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridwidth = 3;
       gbc.gridx = 1;
       gbc.gridy = 3;
       gbc.weightx = 1;
       gbc.insets = new Insets(5, 0, 0, 10);
       panel.add(txtExpenditure, gbc);

       JLabel labelSum = new JLabel("Sum : ", JLabel.TRAILING);
       gbc = new GridBagConstraints();
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 0;
       gbc.gridy = 4;
       gbc.insets = new Insets(0, 10, 0, 0);
       gbc.weightx = 1;
       panel.add(labelSum, gbc);
       
       JTextField txtSum = new JTextField();
       gbc = new GridBagConstraints();
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridwidth = 3;
       gbc.gridx = 1;
       gbc.gridy = 4;
       gbc.weightx = 1;
       gbc.insets = new Insets(5, 0, 0, 10);
       panel.add(txtSum, gbc);

       JButton btnSave = new JButton("Save");
       btnSave.addActionListener(new AccountAdderListener(txtDate,txtContent,txtIncome,txtExpenditure,txtSum, accountManager));
       gbc = new GridBagConstraints();
       gbc.anchor = GridBagConstraints.WEST;
       gbc.fill = GridBagConstraints.NONE;
       gbc.gridwidth = 1;
       gbc.gridx = 0;
       gbc.gridy = 5;
       gbc.insets = new Insets(10, 10, 10, 0);
       gbc.weightx = 1;
       panel.add(btnSave, gbc);
       
       JButton btnCancel = new JButton("Cancel");
       btnCancel.addActionListener(new AccountAdderCancelListener(frame));
       gbc = new GridBagConstraints();
       gbc.anchor = GridBagConstraints.EAST;
       gbc.gridwidth = 1;
       gbc.gridx = 3;
       gbc.gridy = 5;
       gbc.insets = new Insets(10, 0, 10, 10);
       gbc.weightx = 1;
       panel.add(btnCancel, gbc);
       
       
        this.add(panel);
        this.setVisible(true);
    }


}