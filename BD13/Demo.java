import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[5];
        students[0] = new Student("Enh", 19, 3.5, 222270109);
        students[1] = new Student("Baterhem", 21, 3.2, 200970306);
        students[2] = new Student("Margad", 20, 4.0, 210930802);
        students[3] = new Student("Erhem", 19, 2.9, 221960725);
        students[4] = new Student("Azaa", 22, 3.7, 190930311);

        System.out.print("Ali usgeer ehelsen oyutnii neriig tom bolgoj uurchluh ve?: ");
        char letter = scanner.nextLine().charAt(0);
        for (Student student : students) {
        student.checkAndCapitalizeName(letter);
    }

    System.out.print("Golchiig uurchluh oyutnii ner: ");
    String inputName = scanner.nextLine();
    System.out.print("Shineer bii bolgoh golch: ");
    double newGpa = scanner.nextDouble();
    for (Student student : students) {
        if (student.checkNameMatch(inputName)) {
            student.changeGpa(newGpa);
        }
    }

    System.out.println("\nBuh oyutnii medeelel:");
    for (Student student : students) {
        student.printDetails();
        System.out.println();
    }

    System.out.println("Oyutnii nerend heden useg baigaa ve?:");
    for (Student student : students) {
        student.printNameLength();
    }

    System.out.println("Oyutnii koduudiin suulin 3 oronguud:");
    for (Student student : students) {
        student.printLastThreeDigits();
    }

    Teacher[] teachers = new Teacher[5];
    teachers[0] = new Teacher("Ayush", "English", 50000);
    teachers[1] = new Teacher("Suren", "Math", 60000);
    teachers[2] = new Teacher("Tuya", "Science", 55000);
    teachers[3] = new Teacher("Ariunaa", "Social Studies", 48000);
    teachers[4] = new Teacher("Jargal", "Art", 45000);

    System.out.print("\nUgugdsun utgaas undur tsalintai bagshiin neriig hevleh n: ");
    double inputSalary = scanner.nextDouble();
    System.out.println("Ugugdsun " + inputSalary + " utgaas undur tsalintai bagsh nar:");
    for (Teacher teacher : teachers) {
        if (teacher.checkSalary(inputSalary)) {
            teacher.printDetails();
            System.out.println();
        }
    }
}
}
