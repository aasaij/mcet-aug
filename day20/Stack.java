public class Stack<T> {
    //Stores Maximum size of Stack
    private int maxSize;
    //Stores current size of Stack
    private int size;
    //Stores elements of Stack
    private T[] elements;
    @SuppressWarnings("unchecked")
    //Constructor
    public Stack(int maxSize){
        this.maxSize = maxSize;
        //Sets size to -1 to indicate that Stack is empty
        this.size = -1; 
        elements = (T[])new Object[maxSize];
    }
    //Checks if Stack is empty
    public boolean isEmpty(){
        return size == -1;
    }
    public boolean isFull(){
        return size+1 == maxSize;
    }
    public int size(){
        return size+1;
    }
    public boolean push(T element){
        if(isFull())
            return false;
        size++;
        elements[size] = element;
        return true;
    }
    public T pop(){
        if (isEmpty())
            return null;
        T data = elements[size];
        size--;
        return data;
    }
}
