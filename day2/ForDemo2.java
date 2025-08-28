//Program to print natural numbers from 1 to N
import java.util.Scanner;
public class ForDemo2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		for (int i = 1; i<=n; i++)
			System.out.println(i);
	}
}