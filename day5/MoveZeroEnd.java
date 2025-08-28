import java.util.Scanner;
public class MoveZeroEnd{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int[] list;
		int n;
		n = in.nextInt();
		list = new int[n];
		//Reading list of integers
		for(int i = 0; i<n; i++)
			list[i] = in.nextInt();
		for (int i = 0, j = n-1; i<j;){
			while (list[i]!=0 && i < j) i++;
			while (list[j]==0 && i<j)j--;
			if (i<j){
				int temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
		}	
		for(int i = 0; i<n; i++)
			System.out.println(list[i]);	
	}
}