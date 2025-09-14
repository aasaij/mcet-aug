package circular;

public class CircularLinkedListDemo {
    public static void main(String[] args) {
        CircularLinkedList<String> list = new CircularLinkedList<>();
        list.addFirst("Mithradevi");
        list.addFirst("Selvabharathi");
        list.addFirst("Ranjani");
        list.addFirst("Tharshini");
        list.addLast("Muhasri");
        list.addLast("Rithika");
        list.print();
        // list.removeFirst();
        // list.print();
        list.removeLast();
        list.print();
    }
    
}
// Kindly submit your Feedback
// https://forms.gle/gxVcY4x5dta1owaUA
