import java.util.Scanner;
public class StackDemo {
    public static void mainMenu(){
        System.out.println("Stack Application Demo");
        System.out.println("-----------------------");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Size");
        System.out.println("4. Exit");
        System.out.println("Enter your choice : ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stackSize = sc.nextInt();
        Stack<String> stack = new Stack<>(stackSize);
        while(true){
            mainMenu();
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the element to push : ");
                    if (stack.push(sc.next()))
                        System.out.println("Element Pushed Successfully");
                    else
                        System.out.println("Stack is Full");
                    break;
                case 2:
                    String element = stack.pop();
                    if(element == null)
                        System.out.println("Stack is Empty");
                    else
                        System.out.println("Element Popped : "+element);
                    break;
                case 3:
                    System.out.println("Size of Stack : "+stack.size());
                    break;
                case 4:                    
                    System.out.println("Thank you for being very very interactive");;
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }

    }
}
