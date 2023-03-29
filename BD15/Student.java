import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int code;
    private List<Teacher> teachers = new ArrayList<Teacher>();

    public Student(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        teacher.addStudent(this);
    }

    public void printTeachers() {
        System.out.println(name + "-iin bagsh nar: ");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }
    }

    @Override
    public String toString() {
        return "Oyutan [Ner=" + name + ", Kod=" + code + "]";
    }
}
