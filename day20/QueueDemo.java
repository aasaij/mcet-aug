import java.util.Scanner;
public class QueueDemo {
    public static void mainMenu() {
        System.out.println("Queue Application Demo");
        System.out.println("-----------------------");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Size");
        System.out.println("4. Exit");
        System.out.println("Enter your choice : ");
    }
/*************  ✨ Windsurf Command ⭐  *************/

/**
 * Main function for Queue demo.
 * It takes a queue size as an input, creates a Queue of that size, and then runs a loop to allow user to enqueue, dequeue, check size, or exit the program.
 * It uses a switch statement to handle the user's choice and take appropriate action.
 */
/*******  365917b6-1ee6-4bed-87ad-d3befa135ad1  *******/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queueSize = in.nextInt();
        Queue<String> queue = new Queue<>(queueSize);
        while (true) {
            mainMenu();
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to enqueue : ");
                    if (queue.enqueue(in.next()))
                        System.out.println("Element Enqueued Successfully");
                    else
                        System.out.println("Queue is Full");
                    break;
                case 2:
                    String element = queue.dequeue();
                    if (element == null)
                        System.out.println("Queue is Empty");
                    else
                        System.out.println("Element Dequeued : " + element);
                    break;
                case 3:
                    System.out.println("Size of Queue : " + queue.size());
                    break;
                case 4:
                    System.out.println("Thank you so much for being very very active");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }//switch
        }//while
        
    }//main
}//class
