
import java.util.Scanner;

public class Multiply {
    
    public static int process(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            System.out.print(n + " * ");
            return n * process(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.print("1 * ");
        int product = process(n);
        System.out.println("= " + product);
    }
}
