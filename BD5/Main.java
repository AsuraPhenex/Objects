import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Temdegt oruul ");
            char letter = scanner.next().charAt(0);

            if (letter == 'a' || letter == 'A') {
                break;
            }

            count++;
        }

        System.out.println("Davtalt " + count + " udaa davtlaa.");
    }
}
