import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class UnionOf2Sets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();
        for (int i = 1; i<=n1; i++)
            set1.add(sc.nextInt());
        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();
        for (int i  = 1; i<=n2; i++)
            set2.add(sc.nextInt());
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);
    }    
}
