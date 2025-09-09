import java.util.Scanner;
public class SumOfList {
    public static int sum(int[] arr, int key, int index) {
        if(index >= arr.length) {
            return 0;
        }
        int currentElement  = arr[index];
        int sumOfRemaining = sum(arr, key, index + 1);
        if(currentElement > key)
            return currentElement+sumOfRemaining;
        return sumOfRemaining;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        int key = in.nextInt();
        System.out.println(sum(arr,key, 0));
    }
}
