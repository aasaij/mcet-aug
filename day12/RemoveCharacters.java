import java.util.Scanner;
public class RemoveCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        StringBuilder sb = new StringBuilder();
        for(char ch : str2.toCharArray())
            if(str1.indexOf(ch) == -1) sb.append(ch);
        System.out.println(sb);
        in.close();
    }
}
