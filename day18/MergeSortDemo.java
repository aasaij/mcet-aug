import java.util.Scanner;

public class MergeSortDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int index = 0; index<size; index++)
            arr[index] = in.nextInt();
        mergeSort(arr, 0, size-1);
        for (int element : arr)
            System.out.print(element + " ");
    }
    public static void mergeSort(int[] arr, int start, int end){
        if(start < end){
            int mid = (start + end)/2;
            mergeSort(arr,start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr,start, mid, end);
        }
    }
    public static void merge(int[] arr, int start, int mid, int end){
        int n1 = mid-start+1;
        int n2 = end - mid;
        int[] a = new int[n1];
        int[] b = new int[n2];
        int i,j,k;
        for (i = 0; i<n1; i++)
            a[i] = arr[start+i];
        for (j = 0; j<n2; j++)
            b[j] = arr[mid+1+j];
        for (i=j=0, k = start;i<n1&&j<n2; k++)
            arr[k] = a[i] < b[j] ? a[i++] : b[j++];
        while(i<n1) arr[k++] = a[i++];
        while(j<n2) arr[k++] = b[j++];
    }
}
