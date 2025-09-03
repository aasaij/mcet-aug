import java.util.Scanner;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder sb = new StringBuilder();        
        for (char ch : str.toCharArray()){            
            if (ch =='{' || ch == '[' || ch == '(')
                sb.append(ch);
            else if (sb.length()!=0){
                char get = sb.charAt(sb.length()-1);
                if (ch == '}' && get == '{' 
                    || ch == ']' && get == '[' || ch == ')' && get == '(')
                    sb.deleteCharAt(sb.length()-1);
            }
            else{
                System.out.println(false);
                System.exit(0);
            }
        }
        System.out.println(sb.length() == 0);
        in.close();
    }
}


