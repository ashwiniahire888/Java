import java.io.*;

class Factorial {
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String args[]) throws IOException {
        int num, f;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        num = Integer.parseInt(br.readLine());
        f = fact(num);
        System.out.println("Factorial of " + num + " is " + f);
    }
}
