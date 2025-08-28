import java.util.Scanner;
//Sum of Zig-Zag elements of 2D array
public class ZigZagSum{
	public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int rowD, colD;
        rowD = in.nextInt();
        colD = in.nextInt();
        int[][] mat = new int[rowD][colD];
        //Getting values for Matrix mat
        for (int i = 0; i<rowD; i++)
            for (int j = 0; j<colD; j++)
                mat[i][j] = in.nextInt();
        int sum = 0;
        for (int i = 0; i<rowD; i++){
            sum = sum + mat[0][i]; //first row
            sum = sum + mat[rowD-1][i]; // last row
        }
        //diagonal  elements
        for (int i = 1;i<rowD-1; i++)
            sum = sum+mat[i][rowD-i-1];
        System.out.println(sum);
    }
}
