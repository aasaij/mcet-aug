import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListDemo{
    public static void mainMenu(){
        System.out.println("Linked List Demo App");
        System.out.println("********************");
        System.out.println("1. AddFirst");
        System.out.println("2. AddLast");
        System.out.println("3. RemoveFirst");
        System.out.println("4. RemoveLast");
        System.out.println("5. Print All");
        System.out.println("6. Search");
        System.out.println("7. Clear");
        System.out.println("8. Print list in reverse order");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            mainMenu();
            choice = sc.nextInt();
            switch(choice){
                case 0:
                    System.out.println("Thank you so much for being very silent in the classroom");
                    System.exit(0);
                case 1:{
                    System.out.print("Enter name : ");
                    String name = sc.nextLine();
                    name = sc.nextLine();
                    list.addFirst(name);
                    break;
                }
            case 2:{
                    System.out.print("Enter name : ");
                    String name = sc.nextLine();
                    name = sc.nextLine();
                    list.addLast(name);
                    break;
            }
            case 3:
                list.removeFirst();
                break;
            case 4:
                list.removeLast();
                break;
            case 5:
                System.out.println(list);
                break;
            case 6:
                System.out.print("Enter name : ");
                String name = sc.nextLine();
                name = sc.nextLine();
                if(list.contains(name)){
                    System.out.println("Found");
                }else{
                    System.out.println("Not Found");
                }
                break;
            case 7:
                list.clear();
                break;
            case 8:
                Iterator<String> itr = list.descendingIterator();
                while(itr.hasNext())
                    System.out.print(itr.next() + " ");
                break;
            default:
                System.out.println("Invalid choice");
            }
        }
    }
}