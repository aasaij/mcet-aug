public class LinkedListDemo{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.printList();
        // list.removeFirst();
        list.remove(2);
        list.printList();
        // list.removeLast();
        // list.printList();
    }
}