import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();		
		
		for(int i = 1; i<=x; i++)
			System.out.println(i + " x " + n + " = " + i*n);
	}
}
/*
	1 x 7 = 7
	2 x 7 = 14
	3 x 7 = 21 */
