import java.util.Scanner;
public class IsAscending{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int[] list;
		int n;
		n = in.nextInt();
		list = new int[n];
		//Reading list of integers
		for(int i = 0; i<n; i++)
			list[i] = in.nextInt();
		for (int i = 0; i<n-1; i++){
			if (list[i] > list[i+1]){
				System.out.println("False");
				System.exit(0);
			}
		}	
		System.out.println("True");		
	}
}