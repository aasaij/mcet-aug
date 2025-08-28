import java.util.Scanner;
import java.util.Arrays;
public class AnagramCheck1{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		//Method 2
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1==len2){
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else
			System.out.println("No");
	}
}