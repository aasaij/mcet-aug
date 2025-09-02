import java.util.Scanner;

public class StringCompress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String cstr = "";
        for (int i =0; i<str.length();){
            char ch = str.charAt(i);
            int cnt=1;
            ++i;
            while(i < str.length() && ch == str.charAt(i)){
                cnt++;
                i++;
            }
            cstr = cstr+ ch + cnt;
        }
        System.out.println(cstr);
    }
}
