import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting size of the list
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        //Getting elements from the user and adding to the list
        for (int index= 0; index<n; index++)
            list.add(sc.nextInt());
        //Removing duplicate elements from the list
        //Converting list into set
        // LinkedHashSet<Integer> set = new LinkedHashSet(list);
        // list = new ArrayList<>(new LinkedHashSet(list));
        new ArrayList<>(new LinkedHashSet(list)).forEach(element->System.out.println(element));
    }
    
}
