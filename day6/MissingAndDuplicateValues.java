import java.util.Scanner;
public class MissingAndDuplicateValues{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i<n; i++)
			arr[i] = in.nextInt();
		int[] f = new int[n+1];
		for(int i = 0; i<n; i++){
			f[arr[i]]++;
		}
		int missing = 0, duplicate=0;
		for (int i = 1; i<=n; i++){
			if (f[i]==2)
				duplicate = i;
			else if (f[i] == 0)
				missing = i;
		}
		System.out.println(duplicate + "," + missing);
		
	}
}