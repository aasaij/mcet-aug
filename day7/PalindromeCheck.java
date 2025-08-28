import java.util.Scanner;
public class PalindromeCheck{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String revStr = "";
		//Method 1
		for (int i = str.length()-1; i>=0; i--){
			revStr = revStr+str.charAt(i);
		}
		if(str.equalsIgnoreCase(revStr))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}