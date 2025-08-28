//Program to convert a digit into word
import java.util.Scanner;

public class DigitToWord{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		
		byte digit;
		int x = 5;
		digit = in.nextByte();
		switch(digit){
			default:
				System.out.println("Invalid Number");break;
			case 10-10:  // case 0:
				System.out.println("Zero");break;
			case 9-9:
				System.out.println("One");break;
			case 2:
				System.out.println("Two");break;
			case 3:
				System.out.println("Three");break;
			case 4:
				System.out.println("Four");break;
//			case x: // Error
			case 5:
				System.out.println("Five");break;
			case 6:
				System.out.println("Six");break;
			case 7:
				System.out.println("Seven");break;
			case 8:
				System.out.println("Eight");break;
			case 9:
				System.out.println("Nine");
		}
		
	}
}
/*
for
		for (<initial_value>;<condition>;<updation>){
			<statements>
		}
		
		for (int i = 1; i<=100; i++)
			System.out.println("Aathiseshan is soo cute!!!");


while
do..while
*/

