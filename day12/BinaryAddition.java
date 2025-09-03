import java.util.Scanner;
public class BinaryAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num1 = in.nextLine();
        String num2 = in.nextLine();
        StringBuilder sb = new StringBuilder();
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;
        int carry = 0;
        while (n1 >=0 || n2 >=0 || carry != 0){
            int x = n1>=0?num1.charAt(n1--) - '0':0;
            int y = n2>=0?num2.charAt(n2--) - '0':0;
            int sum = x + y + carry;
            sb.append(sum%2);
            carry = sum /2;
        }
        System.out.println(sb.reverse().toString());
        in.close();
    }
}


