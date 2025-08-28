import java.util.Scanner;
public class PalindromeCheck1{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		//Method 2
		for (int i = 0, j = str.length()-1; i<j;i++, j--){
			if (str.charAt(i) != str.charAt(j)){
				System.out.println("No");
				return;
			}
		}		
		System.out.println("Yes");
	}
}