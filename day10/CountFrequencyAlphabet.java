//Program to count the frequency of each alphabet in a given string.
import java.util.HashMap;
import java.util.Scanner;
public class CountFrequencyAlphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int index = 0; index<str.length(); index++){
            char ch = str.charAt(index);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (char ch : freq.keySet())         
            System.out.println(ch + " : " + freq.get(ch));
    }
}
