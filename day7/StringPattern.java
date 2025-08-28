import java.util.Scanner;
public class StringPattern{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		for (int i = 1; i<=str.length(); i++)
			System.out.println(str.substring(0,i));
	}
}


/*Sakthi

S
Sa.
Sak
Sakt
Sakth
Sakthi
*/