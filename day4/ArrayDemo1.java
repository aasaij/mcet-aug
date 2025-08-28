import java.util.Scanner;
public class ArrayDemo1
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    //Array declaration
		int[] list;
		int n;
		//Getting size of an array from the user
		n = in.nextInt(); 
		//allocating memory for array <list>
		list = new int[n];
		//Reading <n> values from the user
		for (int index = 0;index<n;index++)
		    list[index] = in.nextInt();
	    //Printing <n> values
		for (int index = 0;index<n;index++)
		    System.out.println(list[index]);
	}
}
