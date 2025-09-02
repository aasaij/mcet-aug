//Program to reverse vowels in a string

import java.util.Scanner;

public class VowelReverse {
    public static boolean isVowel(char ch){
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char word[] = str.toCharArray();
        for (int i = 0, j= word.length-1; i < j; i++, j--) {
           if (isVowel(word[i]) && isVowel(word[j])){
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
           }
           else if (isVowel(word[i])) 
            i--;
           else if (isVowel(word[j]))
            j++;
        }
        System.out.println(new String(word));
    }
}
