import java.util.Scanner;
public class ValidateDate
{
    //Program to check whether the given date is valid or not
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    boolean valid=true;
	    int dd, mm, yy;
	    dd = in.nextInt();
	    mm = in.nextInt();
	    yy = in.nextInt();
	    if (dd > 31 || dd < 1 || mm > 12 || mm < 1 || yy < 1)
	        valid = false;
	    else{
	        switch(mm){
	            case 4: case 6: case 9: case 11:
	                if ( dd > 30)
	                    valid = false;
	            break;
	            case 2:
	                if ((yy % 400 == 0) || (yy % 4 ==0 && yy % 100 != 0)){
	                    if (dd > 29) valid = false;
	                }
	                else if( dd > 28) valid=false;
	        }
	    }
	    System.out.println(valid?"Valid":"Invalid");
	}
}
