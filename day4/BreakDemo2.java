public class BreakDemo2{
	public static void main(String[] arg){
		outer_loop: // label
		for (int j = 1; j<=5; j++){
			inner_loop:
			for (int i = 1; i<=10; i++){
				if (i % 4 == 0)
					break outer_loop;
				System.out.println(i);
			}
		}
		System.out.println("break demo");
	}
}