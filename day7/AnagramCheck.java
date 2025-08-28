import java.util.Scanner;
public class AnagramCheck{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		//Method 1
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1==len2){
			boolean[] visited = new boolean[len1];
			for (int i = 0; i<len1; i++){
				for (int j = 0; j<len2; j++){
					if (str1.charAt(i)== str2.charAt(j) && visited[j]==false){
						visited[j] = true;
					}
				}
			}	
			for (int i = 0; i<len2; i++){
				if (visited[i] == false){
					System.out.println("No");
					return ;
				}
			}
			System.out.println("Yes");
		
		}
		else
			System.out.println("No");
	}
}