import java.util.Scanner;

public class InsertionSortDemo {
    public static void insertionSort(int[] arr){
        for (int i = 1,j; i<arr.length; i++){
            int key = arr[i];
            for (j =i-1;j>=0 && arr[j]>key;j--)
                arr[j+1] = arr[j];
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0;i<size; i++)
            arr[i] = sc.nextInt();
        insertionSort(arr);
        for (int data : arr)
            System.out.print(data + " ");
    }    
}
