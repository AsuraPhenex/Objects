
package box1;

public class Book {

    private String name;
    private String author;
    private double price;
    private int printedYear;

    private static double sumPrice;
    private static int numBooks;

    public Book(String name, String author, double price, int printedYear) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.printedYear = printedYear;
        sumPrice += price;
        numBooks++;
    }

    public Book(Book other) {
        this.name = other.name;
        this.author = other.author;
        this.price = other.price;
        this.printedYear = other.printedYear;
    }

    public void display() {
        System.out.println("Nomiin ner: " + name);
        System.out.println("Zohiolch: " + author);
        System.out.println("Une: " + price);
        System.out.println("Hevlegdsen on: " + printedYear);
    }

    public static void displayStats() {
        System.out.println("Sum Price: " + sumPrice);
        System.out.println("Average Price: " + sumPrice / numBooks);
    }

    private void changePrice(double newPrice) {
        sumPrice -= price;
        sumPrice += newPrice;
        price = newPrice;
    }

    public void setPrice(double newPrice) {
        changePrice(newPrice);
    }

    public static double getSumPrice() {
        return sumPrice;
    }

    public static double getAvgPrice() {
        return sumPrice / numBooks;
    }

    public static void compareAuthors(Book book1, Book book2) {
        if (book1.author.equals(book2.author)) {
            double newPrice = (book1.price + book2.price) / 2.0;
            book1.changePrice(newPrice);
            book2.changePrice(newPrice);
        }
    }
}
