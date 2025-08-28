public class CompoundInterest{
    public static void main(String[] arg){
        int principal;
        double rate, years, interest;
        principal = 10000;
        rate = 12.5;
        years = 5.5;
        interest = principal * Math.pow( 1 + rate / 100, years);
        System.out.printf("Compound Interest : %.2f",interest);
    }
}