import java.util.Scanner;
class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;
    LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }
    void borrowBook() {
        if (available) {
            System.out.println(title + " borrowed successfully.");
            available = false;
        } else {
            System.out.println(title + " is not available.");
        }
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }
}
public class Librarybook_System{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        LibraryBook lb = new LibraryBook(title, author, price, true);
        lb.display();
        lb.borrowBook();
        lb.display();
        sc.close();
    }
}

