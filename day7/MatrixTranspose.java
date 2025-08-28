import java.util.Scanner;
public class MatrixTranspose{
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
        // //Printing the transposed matrix;
        // for (int j = 0; j<colD; j++){
        //     for (int i = 0; i<rowD; i++)
        //         System.out.print(mat[i][j] +" ");
        //     System.out.println();
        // }
        for (int r = 0; r<rowD; r++){
            for (int c = 0; c<colD; c++)
                System.out.print(mat[c][r]+" ");
            System.out.println();
        }
    }
}
