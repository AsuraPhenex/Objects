
class Person {
    private String name;
    private double salary;
    private double salaryAfterTaxes;
    private double expenses;
    private static double familyIncome;
    private static double familyExpenses;

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.calculateSalaryAfterTaxes();
    }

    private void calculateSalaryAfterTaxes() {
        double incomeTax = 0.1 * salary;
        double salaryAfterIncomeTax = salary - incomeTax;
        double medicalTax = 0.1 * salaryAfterIncomeTax;
        salaryAfterTaxes = salaryAfterIncomeTax - medicalTax;
        familyIncome += salaryAfterTaxes;
    }

    public void addExpense(double expense) {
        expenses += expense;
        familyExpenses += expense;
    }

    public static double getFamilyIncome() {
        return familyIncome;
    }

    public static double getFamilyExpenses() {
        return familyExpenses;
    }

    public double getSalary() {
        return salary;
    }

    public double getExpenses() {
        return expenses;
    }

    public double getSalaryAfterTaxes() {
        return salaryAfterTaxes;
    }

    public String getName() {
        return name;
    }

    public static String getFamilyMemberWithHighestExpense(Person[] familyMembers) {
        Person memberWithHighestExpense = familyMembers[0];
        for (int i = 1; i < familyMembers.length; i++) {
            if (familyMembers[i].getExpenses() > memberWithHighestExpense.getExpenses()) {
                memberWithHighestExpense = familyMembers[i];
            }
        }
        return memberWithHighestExpense.getName();
    }

    public double getSalaryExpenseDifference() {
        return salaryAfterTaxes - expenses;
    }
}