import java.util.Scanner;
import java.util.HashMap;
public class FrequencyList{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		HashMap<Integer, Integer> freq = new HashMap<>();
		int[] list;
		int n, sum=0;
		n = in.nextInt();
		list = new int[n];
		for (int i= 0; i<n; i++)
			list[i] = in.nextInt();
		for (int i = 0; i<n; i++){
			if (freq.containsKey(list[i]))
				freq.put(list[i], freq.get(list[i])+1);
			else
				freq.put(list[i], 1);
		}
		for (Integer key : freq.keySet())
			System.out.println(key + " -> " + freq.get(key));
	}
}