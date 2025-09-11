import java.util.Scanner;

public class SelectionSortDemo {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i<arr.length; i++){
            int maxIndex = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[j]>arr[maxIndex])
                    maxIndex = j;
            }
            if ( i!= maxIndex){
                arr[i] = (arr[i]+arr[maxIndex]) - (arr[maxIndex] = arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Array Size
        int n = in.nextInt();
        int[] arr = new int[n];
        //Getting array elements
        for (int i = 0; i<n; i++)
            arr[i] = in.nextInt();
        selectionSort(arr);
        for (int data : arr)        
            System.out.print(data + " ");
    }
    
}
