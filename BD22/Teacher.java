public class Teacher extends Person {
    private String profession;
    private double salary;

    public Teacher(int age, String name, String profession, double salary) {
        super(age, name);
        this.profession = profession;
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Profession: " + profession);
        System.out.println("Salary: " + salary);
    }
}
