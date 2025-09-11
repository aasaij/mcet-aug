import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);;
        int size = in.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i<size;i++){            
            arr[i] = in.nextInt();            
        }
        int searchKey = in.nextInt();
        int low = 0, upper = size-1;
        while (low<=upper) {
            int middle = (low + upper) / 2;
            if (arr[middle] == searchKey){
                System.out.println("Found");
                System.exit(0);
            }
            else if (arr[middle] > searchKey)
                upper = middle - 1;
            else
                low = middle + 1;            
        }
        System.out.println("Not Found");
    }
}
