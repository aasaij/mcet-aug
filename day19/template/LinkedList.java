package template;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size;
    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }    
}
