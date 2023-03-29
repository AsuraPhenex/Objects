public class BookDemo {
    public static void main(String[] args) {
        int year1 = 2010;
        int year2 = 2018;

        Book book1 = new Book("The Witcher: The Last Wish", "Andrzej Sapkowski", 46000, year1);
        Book book2 = new Book("The Horus Heresy", "Dan Abnett", 38000, year2);

        book1.printDetails();
        book2.printDetails();

        if (book1.getPrintedYear() > 2014) {
            book1.changePrice(book1.getPrice() + 10000);
        }

        if (book2.getPrintedYear() > 2014) {
            book2.changePrice(book2.getPrice() + 10000);
        }

        System.out.println("Uniin uurchlultiin daraah nomiin medeelluud:");
        book1.printDetails();
        book2.printDetails();
    }
}
