import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number < 0) {
                break;
            } else if (number > 20) {
                continue;
            } else {
                System.out.println(number);
            }
        } while (true);

        System.out.println("Davtalt zogsov");
    }
}
