

class Teacher {
    private String name;
    private String profession;
    private double salary;
    
    public Teacher(String name, String profession, double salary) {
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Ner: " + name);
        System.out.println("Haryalagdah tenhim: " + profession);
        System.out.println("Tsalin: " + salary);
    }

    public boolean checkSalary(double inputSalary) {
        return salary > inputSalary;
    }
}