import java.util.Scanner;
public class CountAlphabets{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine(); // "testing@15155"
		int vowels, consonants, others;
		vowels = consonants=others = 0;
		for (int i = 0;i<str.length(); i++){
			char ch = str.charAt(i);
			if("aeiouAEIOU".contains(""+ch))
				vowels++;
			else if (Character.isLetter(ch))
				consonants++;
			else
				others++;	
		}
		System.out.println("Number of vowels        : "+ vowels);
		System.out.println("Number of consonants    : " + consonants);
		System.out.println("Number of non-alphabets : " + others);
	}
}

