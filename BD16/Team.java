
public class Team
{
    private String teamName;
    private Student[] students = new Student[5];
    private int numStudents = 0;
    
    public Team(String teamName) {
        this.teamName = teamName;
    }
    
    public void addStudent(Student student) {
        if (numStudents < 5) {
            students[numStudents] = student;
            numStudents++;
        } else {
            System.out.println("Bag duursen baina.");
        }
    }

    public void printDetails() 
    {
        System.out.println("Bagiin ner: " + teamName);
        System.out.println("Bagt bui suragchid:");
        for (int i = 0; i < numStudents; i++) 
        {
            students[i].printDetails();
        }
    }
}

