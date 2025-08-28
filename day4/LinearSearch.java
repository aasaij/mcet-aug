import java.util.Scanner;
public class LinearSearch
{
    //Program to search an element in an array
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    //declaration of array
	    int[] list;
	    int arraySize, searchElement;
	    arraySize = in.nextInt();
	    list = new int[arraySize];
	    //Reading the list
	    System.out.println("Enter the list of values");
	    for (int i = 0; i<arraySize; i++)
	        list[i] = in.nextInt();
	    System.out.print("Search element : ");
	    searchElement = in.nextInt();
	    //Searching the element in the list
	    for (int i = 0; i<arraySize; i++){
	        if (list[i] == searchElement){
	            System.out.println("Found");
	            System.exit(0);
	        }
	    }
	    System.out.println("Not Found");
	}
}
