package doubly;

public class LinkedList<T> {
    Node<T> head;
    int size;
    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        if (head != null) head.prev = newNode;        
        head = newNode;
        size++; 
    }
    public void addLast(T data){
        Node<T> newNode = new Node<>(data);
        Node<T> temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        size++;
    }
    public void insert(int position, T data){
        if (position == 0 || position == 1) addFirst(data);
        else if (position == size+1) addLast(data);
        else if (position > 1 && position <= size){
            Node<T> temp = head;
            for (int i=1; i<position-1; i++) temp = temp.next;
            Node<T> newNode = new Node<>(data);
            newNode.next = temp.next;
            temp.next.prev = newNode; 
            newNode.prev = temp;
            temp.next = newNode;
            size++;
        }
    }
    public void removeFirst(){
        if (head != null){
            Node<T> temp = head;
            head = temp.next;
            head.prev = null;
            temp.next = null;
            temp = null;
        }
    }
    public void print(){
        if (head == null){
            System.out.println("[]");
            return;
        }
        System.out.println("Forward Traversal");
        System.out.print("[");
        Node<T> temp;
        for (temp = head; temp.next!=null; temp = temp.next)
            System.out.print(temp.data +",");
        System.out.println(temp.data+"]");
        System.out.println("Reverse Traversal");
        System.out.print("[");
        for (; temp.prev!=null; temp = temp.prev)
            System.out.print(temp.data +",");
        System.out.println(temp.data + "]");        
    }
    public void removeLast(){
        if (head != null){
            Node<T> temp;
            for (temp = head; temp.next.next != null; temp=temp.next);
            Node<T> temp1 = temp.next;
            temp1.prev = null;
            temp1=null;
            temp.next = null;
        }
    }
}
