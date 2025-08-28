import java.util.Scanner;
//Prime number
public class PrimeNumber1{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n == 1)
			System.out.println("Neither prime nor composite");
		else{
		for(int i = 2; i<n; i++){
			if (n % i == 0){
				System.out.println("Not Prime");
				//Terminate the program
				System.exit(0);
			}
		}
		System.out.println("Prime");
		}
	}
}

