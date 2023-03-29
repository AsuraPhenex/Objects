package box2;
import java.util.Scanner;
import box1.Book;

 class BookDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ehnii nomiin medeelliig oruul: (Nomiin ner,Zohiolchiin ner, une, hevlegdsen on)");
        Book book1 = new Book(scanner.next(), scanner.next(), scanner.nextDouble(), scanner.nextInt());

        System.out.println("Hoyr dahi nomiin medeelliig oruul:");
        Book book2 = new Book(scanner.next(), scanner.next(), scanner.nextDouble(), scanner.nextInt());

        System.out.println("Gurav dahi nomiin medeeelliig oruul:");
        Book book3 = new Book(scanner.next(), scanner.next(), scanner.nextDouble(), scanner.nextInt());

        System.out.println("Duruv deh nomiin medeelliig oruul:");
        Book book4 = new Book(scanner.next(), scanner.next(), scanner.nextDouble(), scanner.nextInt());

        Book book5 = new Book(book1);
        
        Book.compareAuthors(book1, book2);

        System.out.println("1r nomiin medeelel:");
        book1.display();

        System.out.println("2r nomiin medeelel:");
        book2.display();

        System.out.println("3r nomiin medeelel:");
        book3.display();

        System.out.println("4r nomiin medeelel:");
        book4.display();

        System.out.println("5r nomiin medeelel:");
        book5.display();

        Book.displayStats();
    }
}
