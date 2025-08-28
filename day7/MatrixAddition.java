import java.util.Scanner;
public class MatrixAddition{
	public static void main (String[] args) {
               Scanner in = new Scanner(System.in);
        int rowD, colD;
        rowD = in.nextInt();
        colD = in.nextInt();
        int[][] matA = new int[rowD][colD];
        int[][] matB = new int[rowD][colD];
        int[][] res = new int[rowD][colD];
        //Getting values for Matrix A
        for (int r = 0; r<rowD; r++){
            for (int c = 0; c<colD; c++)
                matA[r][c] = in.nextInt();
        }
        //Getting values for matrix B
        for (int r = 0; r<rowD; r++){
            for (int c = 0; c<colD; c++)
                matB[r][c] = in.nextInt();
        }
        //Adding Matrix A and Matrix B
        for (int r = 0; r<rowD; r++){
            for (int c = 0; c<colD; c++)
                res[r][c] = matA[r][c]+matB[r][c];
        }
        //Printing resultant Matrix
        for (int r = 0; r<rowD; r++){
            for (int c = 0; c<colD; c++)
                System.out.printf("%4d", res[r][c]);
            System.out.println();
        }
    }
}
