
public class DemoComposition
{
   public static void main(String[] args) {
        String[] departmentNames = {"Computer Science", "Mathematics", "Physics", "Chemistry"};
        University university = new University("MUST", departmentNames);
        university.printSchoolDetails();
    }
}

