import java.util.Scanner;
public class CountOccurenceV2{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char ch = in.next().charAt(0);
		int cnt=0, startIndex = -1; //"Suhasakthikumar"
		while(true){
			startIndex = str.indexOf(ch, startIndex+1);
			if(startIndex == -1) break;
			cnt++;
		}
		System.out.println(cnt==0?-1:cnt);
	}
}