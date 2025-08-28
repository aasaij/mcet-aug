import java.util.Scanner;
public class StringPattern3{
	public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        for (int i = 1; i<=len; i++)
            System.out.println(String.format("%"+len+"."+i+"s", str));
    }
}
