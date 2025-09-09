import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountWordFrequency {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String sentence = in.nextLine().toLowerCase();
        String words[] = sentence.split(" ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String word : words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        for (String key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
// 10, 20, 11, 15, 17, 7 6, 15    value : 15