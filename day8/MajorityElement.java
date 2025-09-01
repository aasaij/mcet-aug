import java.util.Scanner;
public class MajorityElement{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int arrSize = in.nextInt();
		int[] arr = new int[arrSize];
		for(int index = 0; index <arrSize; index++)
			arr[index] = in.nextInt();
		int max=0,maxElement=0;
		for (int i = 0; i<arrSize; i++){
			int cnt = 1;
			for (int j = i+1; j<arrSize; j++){
				if (arr[i] == arr[j])
					cnt++;
			}
			if (max < cnt){
				max = cnt;
				maxElement = arr[i];
			}
		}
		if (max > arrSize/2)
			System.out.println(maxElement);
		else
			System.out.println(-1);		
	}
}