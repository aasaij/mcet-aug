public class BreakDemo1{
	public static void main(String[] arg){
		for (int i = 1; i<=10; i++){
			if (i % 4 == 0)
				break;
			System.out.println(i);
		}
	}
}