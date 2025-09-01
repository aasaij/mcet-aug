public class FunctionDemo1{
	//Method definition
	public static void greet(String user, char gender){
		String title="";
		if (Character.toLowerCase(gender)=='m')
			title = "Mr. ";
		else
			title = "Ms. ";
		System.out.println("Good Morning "+title+user);
		System.out.println("Enjoy Learning!");
	}
	public static boolean isLeapYear(int year){
//		if (year % 400 == 0 || (year%4==0 && year %100 !=0))
//			return true;
//		return false;

		return (year % 400 == 0 || (year%4==0 && year %100 !=0));

	}
	private static boolean isVowel(char ch){
		return "aeiouAEIOU".contains(""+ch);
	}
	private static boolean isConsonant(char ch){
		return Character.isLetter(ch) && !isVowel(ch);
	}
	public static void main(String[] args){
		//Method calling
		//greet("Hariharan", 'M');
		//for (int i = 1; i<=5; i++)
		//	greet("Dhanush", 'M');
		//greet("Sarjana", 'F');
		System.out.println(isVowel('b'));
	}
}