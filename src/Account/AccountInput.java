package Account;

import java.util.Scanner;

public interface AccountInput {
	
	public String getDate();
	
	public String getContent();
	
	public int getIncome();
	
	public int getExpenditure();
	
	public void setDate(String date);
	
	public void setContent(String content);
	
	public void setIncome(int income);
	
	public void setExpenditure(int expenditure);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setAccountDate(Scanner input);
	
	public void setAccountContent( Scanner input);
	
	public void setAccountIncome(Scanner input);
	
	public void setAccountExpenditure( Scanner input);

}
