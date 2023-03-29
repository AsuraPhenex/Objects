import java.util.Scanner;

public class Calculator
{
    private int num1;
    private int num2;
    private MathOperations mathOps;
    private Scanner scanner;
    
    public Calculator(MathOperations mathOps) {
        this.mathOps = mathOps;
        this.scanner = new Scanner(System.in);
    }
    
    public void setNumbers() {
        System.out.print("Ehnii toog oruul: ");
        this.num1 = scanner.nextInt();
        System.out.print("Hoyr dahi toog oruul: ");
        this.num2 = scanner.nextInt();
    }
    
    public void addNumbers() {
        mathOps.add(num1, num2);
    }
    
    public void subtractNumbers() {
        mathOps.subtract(num1, num2);
    }
    
    public void multiplyNumbers() {
        mathOps.multiply(num1, num2);
    }
    
    public void divideNumbers() {
        mathOps.divide(num1, num2);
    }
}




