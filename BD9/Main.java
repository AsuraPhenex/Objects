public class Main {
  public static void main(String[] args) {
    double[] arr = {1.5, 2.3, 4.7, 3.2, 5.1}; 
    
    double s = 0; 
    for(int i = 0; i < arr.length; i++) {
      s += arr[i]; 
    }

    System.out.println("Elementuudiin niilber: " + (int)s);
  }
}
