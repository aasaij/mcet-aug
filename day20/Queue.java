public class Queue<T> {
    private int maxSize;
    private int front;
    private int rear;
    private T[] elements;
    private int size;

    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        elements  = (T[]) new Object[maxSize];
        front = -1;
        rear = -1;
        size = 0;
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return rear + 1 == maxSize;
    }
    public int size(){
        return size;
    }
    public boolean enqueue(T element){
        if (isFull())
            return false;
        if (front == -1){
            front = 0;
        }
        elements[++rear] = element;
        size++;
        return true;
    }
    public T dequeue(){
        if (isEmpty())
            return null;
        T data = elements[front];
        size--;
        if (front == rear){
            front = -1;
            rear = -1;
        }
        else
            front++;        
        return data;
    }
}
