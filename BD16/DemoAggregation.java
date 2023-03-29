
public class DemoAggregation
{
     public static void main(String[] args) {
        Student s1 = new Student("Enh", 1234);
        Student s2 = new Student("Bat", 2);
        Student s3 = new Student("Bold", 3);
        Student s4 = new Student("Azaa", 4);
        Student s5 = new Student("Tseren", 5);
        
        Team team = new Team("Team A");
        team.addStudent(s1);
        team.addStudent(s2);
        team.addStudent(s3);
        team.addStudent(s4);
        team.addStudent(s5);
        
        team.printDetails();
    }
}

