public class BankDemo{
	public static void main(String[] arg){
		int x = 10;
		//Creating a reference to Bank class - never occupy any memory
		Bank b;
		//Creating an object for Bank class
		b = new Bank();	
		//b.accNo = 101;	// error
		b.setAccNo(101);
		b.setAccName("Mukesh");
		b.setAcType("S");
		b.setBalance(10000);
		System.out.println("Current Balance : " + b.getBalance());
		b.deposit(10000);
		System.out.println("Current Balance : " + b.getBalance());
		b.withdraw(5000);
		System.out.println("Current Balance : " + b.getBalance());

	}
}