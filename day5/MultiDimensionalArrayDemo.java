import java.util.Scanner;
public class MultiDimensionalArrayDemo{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		//int[][] arr = {{1,2,3},{1,2,3,4,5}, {1,2,3}, {1,2}};
		//System.out.println(arr.length);
		//for (int r = 0; r<arr.length; r++)
		//	System.out.println(r+1 + " = " + arr[r].length);
		int[][] arr;
		int rowSize, colSize;
		rowSize = in.nextInt();
		colSize = in.nextInt();
		arr = new int[rowSize][colSize];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 1;
		arr[1][1] = 2;
		arr[1][2] = 3;
		System.out.println(arr[1][2]);
	}
}