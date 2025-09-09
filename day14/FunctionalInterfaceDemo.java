public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        //lambda expression
        Phone p = phoneNumber -> {
                System.out.println("Making call to " + phoneNumber);
        };
        p.makeCall("108");
    }
}
