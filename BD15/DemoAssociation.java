
public class DemoAssociation {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Bat", "Math");
        Teacher teacher2 = new Teacher("Maral", "English");
        Teacher teacher3 = new Teacher("Svren", "Physics");
        Teacher teacher4 = new Teacher("Suvd", "IT");
        Teacher teacher5 = new Teacher("Uyanga", "Language");

        Student student1 = new Student("Enh", 123456789);
        Student student2 = new Student("Bold", 987654321);
        Student student3 = new Student("Bilegt", 787094321);
        Student student4 = new Student("Erhmee", 487659781);
        Student student5 = new Student("Margad", 284524321);
        Student student6 = new Student("Enerel", 187654098);

        student1.addTeacher(teacher1);
        student1.addTeacher(teacher2);
        student2.addTeacher(teacher1);
        student3.addTeacher(teacher3);
        student3.addTeacher(teacher5);
        student4.addTeacher(teacher1);
        student4.addTeacher(teacher3);
        student4.addTeacher(teacher4);
        student5.addTeacher(teacher1);
        student5.addTeacher(teacher2);
        student5.addTeacher(teacher5);
        student6.addTeacher(teacher4);

        teacher1.printStudents();
        teacher2.printStudents();
        teacher3.printStudents();
        teacher4.printStudents();
        teacher5.printStudents();

        student1.printTeachers();
        student2.printTeachers();
        student3.printTeachers();
        student4.printTeachers();
        student5.printTeachers();
        student6.printTeachers();
    }
}
