
import java.util.Scanner;

public class LanguageLearningCenter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ta manai surgaltiin tuvd umnu n surch baisan uu? (Tiim bol 1 / Ugui bol 0): ");
        int hasStudiedBefore = input.nextInt();

        System.out.println("Ta ali tuvshind suraltsahiig husej baina ve? (1, 2, esvel 3)");
        int level = input.nextInt();

        double fee = 0;

        
        switch (level) {
            case 1:
                fee = 250000;
                break;
            case 2:
                fee = hasStudiedBefore == 0 ? 300000 : 0.9 * 300000;
                break;
            case 3:
                fee = hasStudiedBefore == 0 ? 350000 : 0.85 * 350000;
                break;
            default:
                System.out.println("Zuv tuvshin oruulna uu.");
                System.exit(0);
        }

        System.out.println("Surgaltiin tulbur: " + fee);
    }
}
