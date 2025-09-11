import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nums = in.nextLine().split(" ");
        int searchKey = in.nextInt();
        for (int i = 0; i<nums.length;i++){            
            if (Integer.parseInt(nums[i]) == searchKey){
                    System.out.println("Found");
                    System.exit(0);
            }
        }
        System.out.println("Not Found");
    }
}
