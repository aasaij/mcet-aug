import java.util.Scanner;
class Sum{
//    public static void main(String []arg){
//    public static void main(String arg[]){
//    public static void main(String...arg){
    public static void main(String[] arg){
	Scanner input = new Scanner(System.in);
        int x,y,z, sum;
	double avg;
	x = input.nextInt();
	y = input.nextInt();
	z = input.nextInt();

	sum = x + y + z;

//	avg = (double)sum / 3;
	avg = sum / 3.0;

	System.out.println(sum );
	System.out.println(avg);
    }
}
