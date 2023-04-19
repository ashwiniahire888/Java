 class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap logic using a temporary variable
       // int temp = a;
        //a = b;
        //b = temp;
        a = a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
