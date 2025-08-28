public class NumberPattern6{
	public static void main(String[] arg){
		int n = new java.util.Scanner(System.in).nextInt();
		for (int r = n; r>=1; r--){
			for (int c = 1; c<=r; c++)
//				System.out.print(c);
				System.out.print((char)(c+64));
			for(int c = 1; c<=n-r;c++)
				System.out.print("  ");
			for (int c = 1; c<=r; c++)
//				System.out.print(c);
				System.out.print((char)(c+64));
			System.out.println();
		}
		for (int r = 1; r<=n; r++){
			for (int c = 1; c<=r; c++)
//				System.out.print(c);
				System.out.print((char)(c+64));
			for(int c = 1; c<=n-r;c++)
				System.out.print("  ");
			for (int c = 1; c<=r; c++)
//				System.out.print(c);
				System.out.print((char)(c+64));
			System.out.println();
		}

	}
}

/*
12345
 1234
  123
   12
    1
*/