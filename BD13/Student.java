import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double gpa;
    private int code;

    public Student(String name, int age, double gpa, int code) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.code = code;
    }

    public void printDetails() {
        System.out.println("Ner: " + name);
        System.out.println("Nas: " + age);
        System.out.println("Golch: " + gpa);
        System.out.println("Oyutnii kod: " + code);
    }

    public void changeGpa(double newGpa) {
        this.gpa = newGpa;
    }

    public void checkAndCapitalizeName(char letter) {
    if (name.startsWith(Character.toString(letter))) {
    this.name = name.toUpperCase();
    }
    }

    public void printNameLength() {
    System.out.println(name + " ni " + name.length() + " usegtei.");
    }

    public void printLastThreeDigits() {
        int lastThreeDigits = code % 1000;
        System.out.println("Suuliin 3 oron: " + lastThreeDigits);
    }

    public boolean checkNameMatch(String inputName) {
        return name.equals(inputName);
    }
}
