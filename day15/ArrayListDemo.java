import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListDemo{
    // public static void print(String name){
    //     System.out.println(name);
    // }
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();        
        nameList.add("Kamali");
        nameList.add("Harini");
        nameList.add(0,"Nithya");
        nameList.add(3,"Deepika");
        ArrayList<String> duplicateList = new ArrayList<String>(nameList);
        duplicateList.addAll(nameList);
        // System.out.println(duplicateList);
        // System.out.println(nameList.get(0));
        nameList.set(0,"Roshini");
        // System.out.println(nameList);
        nameList.sort(null);
        // for (int i = 0; i<nameList.size(); i++)
        //     System.out.println(nameList.get(i));
        // Iterator itr = nameList.iterator();
        // while(itr.hasNext())
        //     System.out.println(itr.next());
        // ListIterator itr = nameList.listIterator();
        // while(itr.hasNext())
        //     System.out.println(itr.next());
        // itr.add("Vaishnavi");
        // while(itr.hasPrevious())
        //     System.out.println(itr.previous());
        // System.out.println(nameList.indexOf("vaishnavi"));
        // nameList.lastIndexOf("Vaishnavi");
        // nameList.forEach(ArrayListDemo::print);
        // nameList.forEach((name) -> System.out.println(name.toUpperCase()));
        // nameList.removeIf(name -> name.endsWith("a"));
        // nameList.forEach(name -> {
        //     if(name.endsWith("a"))
        //         System.out.println(name);
        // });

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(11);
        list.add(20);
        list.add(15);
        list.add(30);
        list.add(23);
        //Removing even values in the list
        list.removeIf(num -> num%2==0);
        list.forEach(num -> System.out.println(num));
        // list.forEach(data -> System.out.println(data));

    }

}