package Account;

import java.util.Scanner;

public class Account {

	protected AccountQuarter quarter = AccountQuarter.Firstquarter;
	protected int date;
	protected String content;
	protected int income;
	protected int expenditure;
	protected int result;
	
	public Account() {	
	}
	
	public Account(int date, String content) {
		this.date = date;
		this.content = content;
		
	}
	
	public Account(int date, String content, int income, int expenditure, int result) {
		this.date = date;
		this.content = content;
		this.income = income;
		this.expenditure = expenditure;
		this.result = result;
	}
	
	public AccountQuarter getMonth() {
		return quarter;
	}

	public void setMonth(AccountQuarter quarter) {
		this.quarter = quarter;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getExpenditure() {
		return expenditure;
	}

	public void setExpenditure(int expenditure) {
		this.expenditure = expenditure;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public void printInfo() {
		result = income - expenditure;
		System.out.println("date:" + date + "Content:"+ content+"Income:"+ income +"Expenditure:"+ expenditure + "Sum:" + result);
	}
	
	public void getUserinput(Scanner input) {
		System.out.print("Date :");
    	int date = input.nextInt();
    	this.setDate(date);
    	
    	System.out.print("Content :");
    	String content = input.next();
    	this.setContent(content);
    	
    	System.out.print("Income :");
    	int income = input.nextInt();
    	this.setIncome(income);
    	
    	System.out.print("Expenditure :");
    	int expenditure = input.nextInt();
    	this.setExpenditure(expenditure);
		
    	int result = income - expenditure;
    	System.out.println("Sum:" + result);
	}
		
}
