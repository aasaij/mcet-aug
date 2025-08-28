import java.util.Scanner;
public class DigitSum{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		while(n != 0){
			sum += n%10; // sum = sum + digit
			n = n / 10; // n/=10
		}
		System.out.println(sum);
	}	
}
/*while (<condition>){
	<statements>
}
*/


