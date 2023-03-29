public class Book {
    private String name;
    private String author;
    private double price;
    private int printedYear;

    public Book(String name, String author, double price, int printedYear) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.printedYear = printedYear;
    }

    public void printDetails() {
        System.out.println("Nomiin ner: " + name);
        System.out.println("Zohiolch: " + author);
        System.out.println("Une: " + price);
        System.out.println("Hevlegdsen on: " + printedYear);
    }

    public void changePrice(double newPrice) {
        price = newPrice;
    }

    public int getPrintedYear() {
        return printedYear;
    }

    public double getPrice() {
        return price;
    }
}


