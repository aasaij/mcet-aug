import java.util.Scanner;
public class MaxRowValue{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int rowD = in.nextInt();
		int colD = in.nextInt();
		int[][] arr = new int[rowD][colD];
		for (int r = 0; r<rowD; r++){
			for (int c = 0; c<colD; c++)
				arr[r][c] = in.nextInt();
		}
		for (int r = 0; r<rowD; r++){
			int max = arr[r][0];
			for (int c = 1;c<colD; c++){
				if (max < arr[r][c])
					max = arr[r][c];
			}
			System.out.println(max);
		}		
	}
}