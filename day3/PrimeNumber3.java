import java.util.Scanner;
//Prime number
public class PrimeNumber3{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n == 1)
			System.out.println("Neither prime nor composite");
		else if (n > 3 && (n % 2 == 0 || n % 3 == 0)){
			System.out.println("Not Prime");
		}
		else{
		for(int i = 5; i<=Math.sqrt(n); i+=6){
			if (n % i == 0 || n % (i+2)==0){
				System.out.println("Not Prime");
				//Terminate the program
				System.exit(0);
			}
		}
		System.out.println("Prime");
		}
	}
}
/*
13 ==> 6 x 2 + 1
17 ==> 6  x 3 - 1
*/
