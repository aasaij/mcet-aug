import java.util.Scanner;

public class CompoundInterestV2{
    public static void main(String[] arg){
	Scanner input = new Scanner(System.in);
        int principal;
        double rate, years, interest;
	System.out.print("Principal Amount : ");
	principal = input.nextInt();
	System.out.print("Rate of Interest : ");
	rate  = input.nextDouble();
	System.out.print("Number of years : ");
	years = input.nextDouble();
        interest = principal * Math.pow( 1 + rate / 100, years);
        System.out.printf("Compound Interest : %.2f",interest);
    }
}
/*	int x;
	Scanner input = new Scanner(System.in);
	Methods
		nextInt(); get integer input
		nextByte();
		nextShort();
		nextLong();
		nextFloat();
		nextDouble();
		next();
		nextLine();
		nextBoolean();*/
		



