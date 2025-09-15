package stackusingLL;

public class Stack<T> {
    private Node<T> top;
    private int size;
    public Stack(){
        top = null;
        size = 0;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public int size(){
        return size;
    }
    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    public T pop(){
        if(isEmpty())
            return null;
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }
}
