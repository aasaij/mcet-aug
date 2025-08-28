//Program to implement simple calculator
import java.util.Scanner;

public class SimpleCalculator{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		
		char opr;
		double result,x,y;
		x = in.nextDouble();
		opr = in.next().charAt(0);
		y = in.nextDouble();
		switch(opr){
			case '+': 
				result = x + y; break;
			case '-': 
				result = x - y; break;
			case '*': case 'x' : case 'X':
				result = x * y; break;
			case '/': 
				result = (double)x / y; break;
			case '%': 
				result = x % y; break;
			default:
				System.out.println("Invalid operation!");
				return;
		}
		if (result == (long)result)
			System.out.println(x + " " + opr + " " + y + " = " + (long)result);
		else
			System.out.println(x + " " + opr + " " + y + " = " + result);
		
	}
}
/*
Sample Input
	10 5.5

	15.5

10 5
	15
*/
