
public class Account {	
	int date;
	String content;
	int income;
	int expenditure;
	
	public Account() {	
	}
	
	public Account(int date, String content) {
		this.date = date;
		this.content = content;
		
	}
	
	public Account(int date, String content, int income, int expenditure) {
		this.date = date;
		this.content = content;
		this.income = income;
		this.expenditure = expenditure; 	
	}
	
	public void printInfo() {
		System.out.println("date:" + date + "Content:"+ content+"Income:"+ income +"Expenditure:"+ expenditure);
	}
		
}
