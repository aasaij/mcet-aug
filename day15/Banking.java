import java.util.ArrayList;
import java.util.Scanner;

public class Banking {
    static Scanner in;
    public static void mainMenu(){
        System.out.println("Bank Application");
        System.out.println("****************");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Show Balance");
        System.out.println("5. Show Account Details");
        System.out.println("6. Exit");
        System.out.println("Enter your choice : ");
    }
    public static Bank createAccount(){
        System.out.print("Account Number : ");
        int accNo = in.nextInt();
        System.out.print("Account Name : ");
        String accName = in.nextLine();
        accName = in.nextLine();
        System.out.print("Account Type[Saving/Current] : ");
        String acType = in.next();
        System.out.print("Initial Deposit : ");
        double balance = in.nextDouble();        
        return new Bank(accNo, accName, acType, balance);
    }
    public static void main(String[] args) {
        int choice;
        in = new Scanner(System.in);
        ArrayList<Bank> accountList = new ArrayList<>();
        while(true){
            mainMenu();
            choice = in.nextInt();
            switch(choice){
                case 1:
                    accountList.add(createAccount());
                    break;
                case 2:{
                    System.out.print("Account Number : ");
                    int accountNumber = in.nextInt();
                    boolean found = false;
                    for(Bank account : accountList){
                        if(account.getAccNo() == accountNumber){
                            System.out.print("Amount to be deposited (Should be multiples of 100) : ");
                            if (account.deposit(in.nextInt())){
                                System.out.println("Deposited...");
                                System.out.println("Current Balance : " + account.getBalance());
                            }
                            else{
                                System.out.println("Amount should be in multiples of 100...");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Account number does not exist!");
                    break;
                }
                case 3:{
                    System.out.print("Account Number : ");
                    int accountNumber = in.nextInt();
                    boolean found = false;
                    for(Bank account : accountList){
                        if(account.getAccNo() == accountNumber){
                            System.out.print("Amount to be Withdraw (Should be multiples of 100) : ");
                            if (account.withdraw(in.nextInt())){
                                System.out.println("Withdrawn...");
                                System.out.println("Current Balance : " + account.getBalance());
                            }
                            else{
                                System.out.println("Amount should be in multiples of 100 or Insufficient Balance");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Account number does not exist!");
                    break;
                }
                case 4:{
                    System.out.print("Account Number : ");
                    int accountNumber = in.nextInt();
                    boolean found = false;
                    for (Bank account : accountList) {
                        if (account.getAccNo()==accountNumber){
                            System.out.println("Current Balance : " + account.getBalance());
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Account does not exist!");                   
                    break;
                }
                case 5:{
                    System.out.print("Account Number : ");
                    int accountNumber = in.nextInt();
                    boolean found = false;
                    for (Bank account : accountList) {
                        if (account.getAccNo()==accountNumber){
                            System.out.println(account);
                            found = true;
                            break;
                        }
                        if (!found)
                            System.out.println("Account does not exist!");                    
                    }
                    break;
                }
                case 6:
                    System.out.println("Thank you for being very very interactive in the class");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}

