import java.util.Scanner;
public class StringPattern1{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int n = str.length();
		for (int i = 1; i<=n; i++)
			System.out.println(" ".repeat(n-i)+str.substring(0,i));
	}
}


/*Sakthi

     S
    Sa
   Sak
  Sakt
 Sakth
Sakthi
*/