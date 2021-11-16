package csvbanc;

import com.opencsv.bean.CsvBindByPosition;

public class transaccio {

	@CsvBindByPosition(position = 0)
	private String Date;
	@CsvBindByPosition(position = 1)
	private String Description;
	@CsvBindByPosition(position = 2)
	private String Deposits;
	@CsvBindByPosition(position = 3)
	private String Withdrawls;
	@CsvBindByPosition(position = 4)
	private String Balance;
	
	public transaccio() {
		
	}
	
	
	public transaccio(String date, String description, String deposits, String withdrawls, String balance) {
		super();
		Date = date;
		Description = description;
		Deposits = deposits;
		Withdrawls = withdrawls;
		Balance = balance;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getDeposits() {
		return Deposits;
	}
	public void setDeposits(String deposits) {
		Deposits = deposits;
	}
	public String getWithdrawls() {
		return Withdrawls;
	}
	public void setWithdrawls(String withdrawls) {
		Withdrawls = withdrawls;
	}
	public String getBalance() {
		return Balance;
	}
	public void setBalance(String balance) {
		Balance = balance;
	}
	@Override
	public String toString() {
		return "transaccio [Date=" + Date + ", Description=" + Description + ", Deposits=" + Deposits + ", Withdrawls="
				+ Withdrawls + ", Balance=" + Balance + "]";
	}

	
	
}
