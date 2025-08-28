//Program to count number of +ves, -ves and 0s
import java.util.Scanner;
public class CountSequences{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int p,n,z;
		p=n=z=0;
		System.out.println("Enter numbers. Press -1 to terminate...");
		do{
			int x;
			x = in.nextInt();
			if (x == -1) break;
			if (x > 0) p++;
			else if(x<0) n++;
			else z++;
		}while(true);
		System.out.println("Number of +ves : " + p);
		System.out.println("Number of -ves : " + n);
		System.out.println("Number of 0s   : " + z);
	}
}