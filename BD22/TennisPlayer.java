public class TennisPlayer extends Sportsman
{
    private String teamName;
    private String rank;
    public TennisPlayer(int age, String name, double height, double weight, String teamname, String rank) {
        super(age, name, height, weight);
        this.teamName = teamname;
        this.rank = rank;
     }
     
    public void display() {
        super.display();
        System.out.println("Team Name: " + teamName);
        System.out.println("Rank: " + rank);
    }
}
