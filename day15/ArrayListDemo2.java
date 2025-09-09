import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Bank> accountList = new ArrayList<>();
        accountList.add(new Bank(1, "Kamali", "Savings", 10000.0));
        accountList.add(new Bank(2, "Harini", "Savings", 20000.0));
        accountList.add(new Bank(3, "Nithya", "Savings", 30000.0));
        accountList.add(new Bank(4, "Deepika", "Savings", 40000.0));
        int accNo = in.nextInt();
        accountList.forEach(account -> {
            if (account.getAccNo() == accNo){
                System.out.println("Account Name : " + account.getAccName());
                System.out.println("Balance      : " + account.getBalance());
                System.exit(0);
            }
        });
        System.out.println("Account not found");
    }
}
