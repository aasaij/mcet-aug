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
    public void removeFirst(){
        if (head != null){
            Node temp = head;
            head = temp.next;
            temp.next = null;            
            size--;
        }
    }
    public void removeLast(){
        if (head != null){
            Node temp;
            for(temp=head; temp.next != tail; temp=temp.next);
            temp.next = null;
            tail = temp;
            size--;
        }
    }
    public void remove(int position){
        if(position==0 || position==1)
            removeFirst();
        else if (position == size)
            removeLast();
        else  if (position > 1 && position < size){
            Node temp=head;
            for (int i = 1;i<position-1; i++)
                temp = temp.next;
            Node temp1 = temp.next;
            temp.next = temp1.next; // temp.next = temp.next.next;
            temp1.next = null;
            size--;
        }
    }
    public int getSize(){
        return size;
    }
    public boolean search(int data){
        for(Node temp = head; temp !=null; temp = temp.next){
            if (temp.data == data)
                return true;
        }
        return false;
    }
    public void printReverse(Node rootNode){
        if (rootNode == null)
            return;
        printReverse(rootNode.next);
        System.out.println(rootNode.data);
    }
}

