import java.util.Scanner;
public class DigitCount{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int cnt = 0;
		if (n == 0)
			cnt = 1;
		else {
		while(n != 0){
			cnt++;
			n = n / 10; // n/=10
		}
		}
		System.out.println(cnt);
	}	
}
/*while (<condition>){
	<statements>
}
*/


