public class SumOfDigits {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        // while(n > 9){
        //     int sum = 0;
        //     while(n!=0){
        //         sum = sum+ n % 10;
        //         n/=10;
        //     }
        //     n=sum;
        // }
        // System.out.println(n);
        System.out.println(n >0  && n % 9 == 0 ? 9 : n % 9);
    }
    // s1 = "Kavin";
    // s2 = "Sabari";
    
}
