import java.util.Scanner;
public class CountOccurence{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char ch = in.next().charAt(0);
		int cnt = 0;
		for (int i = 0; i<str.length();i++){
			if (ch == str.charAt(i))
				cnt++;
		}
		if(cnt==0)
			System.out.println(-1);
		else
			System.out.println(cnt);
	}
}