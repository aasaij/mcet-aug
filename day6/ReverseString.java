import java.util.Scanner;
public class ReverseString{
	public static void main(String[] arg){
		//method 1
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
//		String revStr="";
//		for (int i = str.length()-1; i>=0; i--)
//			revStr += str.charAt(i);
//		System.out.println(revStr);
		//method 2
//		StringBuffer sb = new StringBuffer(str);
//		sb.reverse();
//		System.out.println(new String(sb));
		//Method 3
		char[] arr = str.toCharArray();
		for (int i = 0, j = str.length()-1;i<j; i++, j--){
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(new String(arr));			
	}
}