public class NestedLoopDemo{
	public static void main(String[] arg){
		// rows or lines -- outer loop
		for(int i = 1; i<=5; i++){ 
			// columns or characters -- inner loop
			for (int j = 1; j<=5; j++){ 
				System.out.print("Gokul ");
			}
			//printing new line
			System.out.println();
		}
	}
}

/*
Nested Loop
//outer loop
for ( initialization; condition; increment ) 
{
	//Inner loop
        for ( initialization; condition; increment ) {
              // statement of inside loop
        }

       // statement of outer loop
}

for (int i = 1; i<=5; i++){ // rows or lines
	for (int j = 1; j<=5; j++){ // columns or characters
		System.out.print("Gokul ");
	}
	System.out.println();
}
	i = 1
		j = 1, 2,3,4,5
	i= 2
		j = 1, 2,3, 4, 5
	i = 3
		j = 1, 2,3, 4, 5
	i = 4
		j = 1, 2,3, 4, 5
	i = 5
		j = 1, 2,3, 4, 5


*/