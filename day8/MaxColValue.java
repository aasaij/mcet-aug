import java.util.Scanner;
public class MaxColValue{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int rowD = in.nextInt();
		int colD = in.nextInt();
		int[][] arr = new int[rowD][colD];
		for (int r = 0; r<rowD; r++){
			for (int c = 0; c<colD; c++)
				arr[r][c] = in.nextInt();
		}
		//Finding max value in every column
		for (int r = 0; r<rowD; r++){
			int max = arr[0][r];
			for (int c = 1;c<colD; c++){
				if (max < arr[c][r])
					max = arr[c][r];
			}
			System.out.println(max);
		}		
	}
}