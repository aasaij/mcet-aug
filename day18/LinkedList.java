public class LinkedList {
    //Refering first node
    Node head; 
    //Refering last node
    Node tail;
    //maintaining the size of the list
    int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head==null)
            tail = newNode;
        newNode.next = head;
        head = newNode;
        size++;
    }    
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            tail = newNode;            
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void printList(){
        if (head==null){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (Node temp =head; temp!=tail; temp=temp.next)
            System.out.print(temp.data+ ",");      
        System.out.println(tail.data+"]");  
    }
    public void insert(int position, int data){
        if (position == 0 || position ==1)
            addFirst(data);
        else if (position == size+1)
            addLast(data);
        else if (position>1 && position<=size){
            Node temp = head;
            for (int i=1; i<position-1; i++)
                temp = temp.next;
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }
}

