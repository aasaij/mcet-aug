import java.util.Scanner;
public class FindMax{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int[] list;
		int n, max;
		n = in.nextInt();
		list = new int[n];
		for(int i = 0; i<n; i++)
			list[i] = in.nextInt();
		max = list[0];
		for (int i = 1; i<n; i++)
			if (list[i]>max) max = list[i];
		System.out.println(max);
	}
}