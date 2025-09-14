package doubly;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Vishwash");
        list.addFirst("Gopal");
        list.addLast("Arjun");
        list.insert(3,"Karthick");
        list.print();
        // list.removeFirst();
        // list.print();
        list.removeLast();
        list.print();
    }
    
}
