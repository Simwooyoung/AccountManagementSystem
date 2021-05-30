package Account;

import java.util.Scanner;

public abstract class  Account {

	protected AccountQuarter quarter = AccountQuarter.Firstquarter;
	protected String date;
	protected String content;
	protected int income;
	protected int expenditure;
	protected int result;
	
	public Account() {	
	}
	
	public Account(AccountQuarter quarter) {
		this.quarter = quarter;
	}
	
	public Account(String date, String content) {
		this.date = date;
		this.content = content;
		
	}
	
	public Account(String date, String content, int income, int expenditure, int result) {
		this.date = date;
		this.content = content;
		this.income = income;
		this.expenditure = expenditure;
		this.result = result;
	}
	
	public Account(AccountQuarter quarter, String date, String content, int income, int expenditure, int result) {
		this.quarter = quarter;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
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

	
	public abstract void printInfo();
}
