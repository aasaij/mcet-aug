import java.util.Scanner;
public class MissingNumber{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int[] list;
		int n, sum=0;
		n = in.nextInt();
		list = new int[n];
		//Reading list of integers
		for(int i = 0; i<n; i++){
			list[i] = in.nextInt();
			sum += list[i];
		}
		n = list[n-1];
		System.out.println((n*(n+1))/2-sum);		
	}
}