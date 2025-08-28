import java.util.Scanner;
//Program to check whether the given Character is vowel or Consonant or not
public class Vowel
{
	public static void main(String[] args) {
		char ch;
		Scanner in = new Scanner(System.in);
		ch = in.next().charAt(0);
		if ("aeiouAEIOU".contains(""+ch))
		    System.out.println("Vowel");
		else if (Character.isLetter(ch))
		    System.out.println("Consonant");
		else
		    System.out.println("Not an alphabet!");
	}
}

