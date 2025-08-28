public class NumberPatter2{
	public static void main(String[] arg){
		int n = new java.util.Scanner(System.in).nextInt();
		for(int i = 1; i<=n; i++){ 
			//space printing
			for(int j = 1; j<=n-i; j++)
				System.out.print(" ");
			//Number printing
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