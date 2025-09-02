// import java.util.LinkedHashMap;
import java.util.Scanner;
// import java.util.HashMap;
import  java.util.TreeMap;

public class FrequencyCount{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.replaceAll("\\s", "").toLowerCase();
        // LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        // HashMap<Character, Integer> map = new HashMap<>();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(char ch : str.toCharArray())
            map.put(ch, map.getOrDefault(ch,0)+1);
        for (char key : map.keySet())
            System.out.println(key + " : " + map.get(key));
    }
}