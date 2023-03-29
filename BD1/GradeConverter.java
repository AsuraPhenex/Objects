import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Usgen unelgeeg oruul: ");
        String letterGrade = input.next().toUpperCase();

        int lowerG = 0;
        int upperG = 0;

        switch (letterGrade) {
            case "A":
                lowerG = 91;
                upperG = 100;
                break;
            case "B":
                lowerG = 81;
                upperG = 91;
                break;
            case "C":
                lowerG = 71;
                upperG = 81;
                break;
            case "D":
                lowerG = 61;
                upperG = 71;
                break;
            case "F":
                lowerG = 0;
                upperG = 61;
                break;
            default:
                System.out.println("Ta deerh 5 usegnees songon oruulna uu");
                System.exit(0);
        }

        System.out.println("Dungiin medeelel: " + lowerG + "-" + upperG);
    }
}


