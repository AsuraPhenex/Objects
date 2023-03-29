import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String profession;
    private List<Student> students = new ArrayList<Student>();

    public Teacher(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        System.out.println(name + "-iin oyutnuud: ");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    @Override
    public String toString() {
        return "Bagsh [Ner=" + name + ", Mergejil=" + profession + "]";
    }
}
