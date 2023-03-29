import java.util.Scanner;

public class ATM {
    private static double balance = 645000; 
    private static int pin; 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        System.out.print("PIN Kodoo oruulna uu: ");
        pin = sc.nextInt();
        while (pin < 1000 || pin > 9999) {
            System.out.println("Oruulsan kod 4-orontoi too bish baina.");
            System.out.print("4 orontoi PIN kodoo oruulna uu: ");
            pin = sc.nextInt();
        }
        
        System.out.println("\nATM-d tavtai moril!");
        do {
            System.out.println("\nDoorh songoltuudaas songono uu");
            System.out.println("1. Uldegdel shalgah");
            System.out.println("2. Belen mungu avah");
            System.out.println("3. Dansruu mungu shiljuuleh");
            System.out.println("4. Garah\n");
            choice = sc.nextInt();
            
            // process user choice
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    transfer();
                    break;
                case 4:
                    System.out.println("\nDaraa dahin uilchluulne uu!");
                    break;
                default:
                    System.out.println("\nDeerh songoltuudaas songono uu.");
                    break;
            }
        } while (choice != 4);
    }
    
    // function to check account balance
    private static void checkBalance() {
        System.out.println("\nTanii dansand " + balance + " tugrug baina.");
    }
    
    // function to withdraw cash
    private static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPIN kodoo oruulna uu: ");
        int userPin = sc.nextInt();
        if (userPin != pin) {
            System.out.println("Tanii PIN kod buruu baina. Dahin oroldono uu.");
            return; // exit function
        }
        System.out.print("\nDansnaas avah belen mungunii dung oruulna uu ");
        double amount = sc.nextDouble();
        
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Belen munguu avna uu");
            System.out.println("Tanii dansand " + balance + " tugrug uldej baina.");
        } else {
            System.out.println("Uuchlaarai, tanii dansnii uldegdel hureltsehgui baina.");
        }
    }
    
    // function to transfer money
    private static void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPIN kodoo oruulna uu: ");
        int userPin = sc.nextInt();
        if (userPin != pin) {
            System.out.println("Tanii PIN kod buruu baina. Dahin oroldono uu.");
            return; // exit function
        }
        System.out.print("\nDansnii dugaariig oruulna uu:");
        String accountNumber = sc.next();
        System.out.print("Shiljuuleh mungun dung oruulna uu: ");
        double amount = sc.nextDouble();
        
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Tanii dansnaas " + amount + " tugrug " + accountNumber + " dans ruu shiljlee.");
            System.out.println("Tanii dansand " + balance + " tugrug uldej baina.");
        } else {
            System.out.println("Uuchlaarai, tanii dansnii uldegdel hureltsehgui baina.");
        }
    }
}
