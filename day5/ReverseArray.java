import java.util.Scanner;
public class ReverseArray{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int[] list;
		int n;
		n = in.nextInt();
		list = new int[n];
		//Reading list of integers
		for(int i = 0; i<n; i++)
			list[i] = in.nextInt();
		//Reversing array using two pointers approach
		for (int i =0, j=n-1; i<j; i++, j--){
			//swapping both values
			//int temp = list[i];
			//list[i] = list[j];
			//list[j] = temp;
			list[i] = (list[i] + list[j]) - (list[j] = list[i]);
		}
		//printing list of integers
		for (int i = 0; i<n; i++)
			System.out.println(list[i]);
		
			
	}
}