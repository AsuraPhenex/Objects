
public class Demo {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Person(25, "John");
        persons[1] = new Sportsman(30, "Mike", 180, 75);
        persons[2] = new TennisPlayer(28, "Maria", 170, 60, "Team A", "Teacher");
        persons[3] = new Teacher(35, "Sarah", "Mathematics", 50000);

        for (Person person : persons) {
            person.display();
            System.out.println();
        }
    }
}
