import java.util.Scanner;
public class FindSecondMin{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int[] list;
		int n, min, smin;
		n = in.nextInt();
		list = new int[n];
		for(int i = 0; i<n; i++)
			list[i] = in.nextInt();
		min = Integer.MAX_VALUE;
		smin = Integer.MAX_VALUE;
		for (int i = 0; i<n; i++){
			if (list[i]<min) {
				smin = min;
				min = list[i];
			}
			else if (list[i] < smin && list[i] != min)
				smin = list[i];
		}
		System.out.println(smin != Integer.MAX_VALUE?smin:"N/A");	
	}
}