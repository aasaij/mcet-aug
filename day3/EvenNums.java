import java.util.Scanner;
public class EvenNums{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if ( n % 2 == 1) n--;
		for (int i = n; i>=1; i-=2){
			System.out.println(i);
		}
	}
}
