public class FunctionDemo{
	int x ;
	//Method definition
	public static void greet(){
		int x = 10;
		System.out.println("Good Morning Engineers!");
		System.out.println("Enjoy Learning!");
		x++;
	}
	public static void main(String[] args){
		//Method calling
		greet();
		greet();
		for (int i = 1; i<=5; i++)
			greet();
		FunctionDemo fd = new FunctionDemo();
		System.out.println(fd.x);
	}
}