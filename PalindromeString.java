import java.util.Scanner;

public class PalindromeString {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String str = sc.nextLine();
       String rev = new StringBuilder(str).reverse().toString();
       System.out.println(str + (str.equals(rev) ? " is" : " is not") + " a palindrome string.");
   }
}
