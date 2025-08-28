public class ContinueDemo2{
	public static void main(String[] arg){
		System.out.println("continue demo");
		outer_loop:
		for (int j = 1; j<=5; j++){
			inner_loop:
			for(int i = 1; i<=10; i++){
				if (i % 3 == 0)
					continue outer_loop;
				System.out.print(i);
			}
			System.out.println();
		}
	}
}