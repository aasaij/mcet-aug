public class ContinueDemo1{
	public static void main(String[] arg){
		System.out.println("continue demo");
		for(int i = 1; i<=10; i++){
			if (i % 3 == 0)
				continue;
			System.out.println(i);
		}
	}
}