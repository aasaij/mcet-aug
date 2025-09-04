import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Size of an array
        int n = in.nextInt();
        //Create an array
        int[] arr = new int[n];
        //Reading elements of an array
        for (int i = 0; i<n; i++)
            arr[i] = in.nextInt();
        //Getting number of rotations
        int rotate = in.nextInt();
        rotate = rotate%n;
        //Rotating the array
        for (int r = 1; r<=rotate; r++){
            int temp = arr[n-1];
            for (int index = n-2; index>=0; index--)
                arr[index+1] = arr[index];
            arr[0] = temp;
        }
        //Printing the rotated array
        for (int index = 0; index<n; index++)
            System.out.print(arr[index] + " ");
        //Printing the rotated array
        // for (int index = n-rotate;index<n; index++)
        //     System.out.print(arr[index] + " ");
        // for (int index = 0; index<n-rotate; index++)
        //     System.out.print(arr[index] +" ");
    }
    // n1 = "123"
    // n2 = "345"
    // n3 = n1 + n2  
}
