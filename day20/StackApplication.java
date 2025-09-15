//Balanced Parenthesis Problem

import java.util.Scanner;

public class StackApplication {
    public static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>(str.length());
        for (char ch : str.toCharArray()){
            if ("{[(".contains(""+ch)){
                stack.push(ch);
            }
            else{
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if (ch == '}' && top != '{' || ch == ']' && top != '[' || ch == ')' && top != '(')
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isBalanced(str)?"Yes":"No");
    }
}
