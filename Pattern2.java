import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
      for (int i = 0; i < rows; i++) {

            // inner loop to print spaces before the stars
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }

            // inner loop to print stars in each row
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
