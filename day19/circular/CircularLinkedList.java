package circular;

public class CircularLinkedList<T> {
    Node<T> tail;
    int size;
    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        if (tail==null){
            newNode.next = newNode;
            tail = newNode;
        }
        else{
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }
    public void addLast(T data){
        Node<T> newNode = new Node<>(data);
        if (tail==null){
            newNode.next = newNode;
            tail = newNode;
        }
        else{
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void removeFirst(){
        if (tail!=null){
            Node<T> temp = tail.next;
            tail.next = temp.next;
            temp = null;
        }
    }
    public void removeLast(){
        if(tail != null){
            Node<T> temp;
            for (temp = tail.next; temp.next != tail; temp=temp.next);
            temp.next = tail.next;
            Node<T> temp1 = tail;
            tail = temp;
            temp1=null;
        }
    }
    public void print(){
        if (tail == null){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        Node<T> temp;
        for (temp = tail.next; temp!=tail; temp=temp.next)
            System.out.print("'"+temp.data+"',");
        System.out.println("'"+tail.data+"']");
    }
}
