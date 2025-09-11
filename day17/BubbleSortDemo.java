import java.util.Scanner;

public class BubbleSortDemo {
    public static void bubbleSort(int[] arr){
        for(int i = 1; i<=arr.length-1;i++){
            for(int j =0; j<arr.length-i;j++){
                if (arr[j]>arr[j+1]){
                    // int temp = arr[j];
                    // arr[j] = arr[j+1];
                    // arr[j+1] = temp;
                    arr[j] = (arr[j]+arr[j+1])-(arr[j+1]=arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[]  arr = new int[size];
        for (int index = 0; index<size; index++)
            arr[index] = in.nextInt();
        bubbleSort(arr);
        for (int data : arr)
            System.out.print(data + " ");
    }
}
