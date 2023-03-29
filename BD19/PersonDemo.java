
import java.util.Scanner;
public class PersonDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] familyMembers = new Person[3];
        for (int i = 0; i < familyMembers.length; i++) {
            System.out.println("Ger buliin gishuunii ner: " + (i+1));
            String name = scanner.nextLine();
            System.out.println("Ger buliin gishuunii orlogo: " + name);
            double salary = scanner.nextDouble();
            scanner.nextLine();
            familyMembers[i] = new Person(name, salary);
            System.out.println();
        }

        for (Person member : familyMembers) {
            double salaryAfterTaxes = member.getSalaryAfterTaxes();
            System.out.println(member.getName() + "-iin tatvariin daraah gar deer avah tsalin= " + salaryAfterTaxes);
            System.out.println("Ger buliin " + member.getName() + " gishuunii zarlaguud: ");
            double expense1 = scanner.nextDouble();
            double expense2 = scanner.nextDouble();
            scanner.nextLine();
            member.addExpense(expense1);
            member.addExpense(expense2);
            System.out.println(member.getName() + "- zarlaguud: " + member.getExpenses());
            System.out.println(member.getName() + "-iin orlogo zarlagiin zoruu: " + member.getSalaryExpenseDifference());
            System.out.println();
        }

        System.out.println("Ger buliin niit orlogo: " + Person.getFamilyIncome());
        System.out.println("Ger buliin niit zarlaga: " + Person.getFamilyExpenses());
        System.out.println("Hamgiin ih zarlagatai gishuun: " + Person.getFamilyMemberWithHighestExpense(familyMembers));
    }
}