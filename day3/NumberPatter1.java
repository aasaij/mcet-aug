public class NumberPatter1{
	public static void main(String[] arg){
		int n = new java.util.Scanner(System.in).nextInt();
		for(int i = 1; i<=n; i++){ 
			for (int j = 1; j<=i; j++){ 
				System.out.print(j);
			}
			//printing new line
			System.out.println();
		}
	}
}
/*
5
1
12
123
1234
12345
*/