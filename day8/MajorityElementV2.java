import java.util.Scanner;
import java.util.HashMap;
public class MajorityElementV2{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		HashMap<Integer,  Integer> map = new HashMap<>();
		int arrSize = in.nextInt();
		int[] arr = new int[arrSize];
		for(int index = 0; index <arrSize; index++)
			arr[index] = in.nextInt();
		for (int index = 0; index < arrSize; index++){
			map.put(arr[index], map.getOrDefault(arr[index],0)+1);
		}
		for (int key : map.keySet()){
			if (map.get(key) > arrSize/2){
				System.out.println(key);
				return;
			}		
		}	
		System.out.println(-1);
	}
}



