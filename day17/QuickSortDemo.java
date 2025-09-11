import java.util.Scanner;

public class QuickSortDemo {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[low], i,j;
        for (i=low+1, j=high; i<=j;){
                while (i<=j && arr[i]<=pivot) i++;
                while (i<=j && arr[j]>pivot) j--;
                if (i<j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }
    public static void quickSort(int arr[], int low, int high){
        if (low<high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++)
            arr[i] = in.nextInt();
        quickSort(arr, 0, n-1);
        for (int num : arr)
            System.out.print(num +" ");
    }
}
