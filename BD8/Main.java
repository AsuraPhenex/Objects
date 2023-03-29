import java.util.Random;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10]; 
        Random rand = new Random(); 
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101);
        }
        
        System.out.println("Massive: " + Arrays.toString(arr));
        
        byte b = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > b) {
                b = (byte) arr[i]; 
            }
        }
        
        System.out.println("Hamgiin ih too: " + b);
    }
}
