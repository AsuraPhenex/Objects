import java.util.Scanner;

public class RecursiveSum {

    public static int sum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return arr[n-1] + sum(arr, n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Heden shirheg element oruulah ve? ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element" + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int sum = sum(arr, n);
        System.out.println("Elementuudiin niilber n= " + sum);
    }
}
