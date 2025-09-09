public class Bank{
	//States, properties, data members
	//Instance variables, fields, attributes
	private int accNo;
	private String accName, acType;
	private double balance;	
	//Constructor
	public Bank(int accNo, String accName, String acType, double balance){
		this.accNo = accNo;
		this.accName = accName;
		this.acType = acType;
		this.balance = balance;
	}
	
	//Methods
	//setters
	public int getAccNo(){
		return accNo;
	}
	public String getAccName(){
		return accName;
	}
	public void setAccName(String name){
		accName = name;
	}
	public boolean deposit(int amount){
		//checking whether the amount is multiples of 100
		if (amount % 100 == 0){
			balance = balance + amount;
			return true;
		}
		return false;
	}
	public boolean withdraw(int amount){
		//checking whether the withdrawal amount is lesser or equal to the balance
		//the withdrawal amount is multiples of 100
		if (balance >= amount && amount % 100 == 0){
			balance = balance - amount;
			return true;
		}
		return false;
	}
	//Getter
	public double getBalance(){
		return balance;
	}
	public String toString(){
		return String.format(
			"Bank[Account Number: %d, Account Name : '%s',"+
			" Account Type : '%s', Current Balance : %.2f]",
			 this.accNo, this.accName, this.acType, this.balance);
	}
}
