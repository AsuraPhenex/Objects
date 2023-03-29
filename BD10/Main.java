import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[4][3];

        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = rand.nextInt(21);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sumEvenBigger10 = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] % 2 == 0 && array[i][j] > 10) {
                    sumEvenBigger10 += array[i][j];
                }
            }
        }

        System.out.println("10s ih tegsh toonii niilber: " + sumEvenBigger10);

        int sumOddLesser10 = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] % 2 != 0 && array[i][j] < 10) {
                    sumOddLesser10 += array[i][j];
                }
            }
        }

        System.out.println("10s baga sondgoi toonii niilber: " + sumOddLesser10);
    }
}
