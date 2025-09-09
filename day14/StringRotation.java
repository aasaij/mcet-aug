/*
 * Problem Description
Rotate a given String in specified direction by specified magnitude.
After each rotation make a note of first character of the rotated String, 
After all rotation are performed the accumulated first character as noted 
previously will form another string, say FIRSTCHARSTRING. 
Check If FIRSTCHARSTRING is an Anagram of any substring of the Original string. 
If yes print "YES" otherwise "NO".
 */

import java.util.Scanner;
import java.util.Arrays;
public class StringRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String firstCharString = "";
        int rotations = in.nextInt();
        //Generating firstCharString of the rotated string
        for (int i= 1; i<=rotations; i++){
            char dir;
            int m;
            dir = in.next().charAt(0);
            m = in.nextInt();
            if (dir=='R' || dir == 'r')
                firstCharString += str.charAt(str.length() - m);
            else if (dir == 'L' || dir == 'l')
                firstCharString += str.charAt(m);
        }
        char[] word1 = firstCharString.toCharArray();
        Arrays.sort(word1);        
        //Generating substring of the original string
        for (int i = 0; i<str.length()-rotations;i++){
            String str2 = str.substring(i,i+rotations);            
            char[] word2 = str2.toCharArray();
            Arrays.sort(word2);
            if (Arrays.equals(word1, word2)){
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }    
    // carrace
}
