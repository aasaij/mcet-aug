public class Bank{
	//States, properties, data members
	//Instance variables, fields, attributes
	private int accNo;
	private String accName, acType;
	private double balance;	
	//class variable or static variable
	private static String bankName = "Aasai Bank Of Switzerland";
	//Methods
	//setters
	public void setAccNo(int no){
		accNo = no;
	}
	public void setAccName(String name){
		accName = name;
	}
	public void setAcType(String type){
		acType = type;
	}
	public void setBalance(double initialAmount){
		balance = initialAmount;
	}
	public boolean deposit(int amount){
		int x, y, z;
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
}

//Varible Types
//1. Local variables
	
//2. Instance variables
//3. Class variables
