public class Sportsman extends Person {
    private double height;
    private double weight;

    public Sportsman(int age, String name, double height, double weight) {
        super(age, name);
        this.height = height;
        this.weight = weight;
    }
    public void display() {
        super.display();
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}