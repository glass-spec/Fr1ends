import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class Book_Details  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book();
        System.out.println("Default Book:");
        b1.display();
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        Book b2 = new Book(title, author, price);
        System.out.println("Parameterized Book:");
        b2.display();
        sc.close();
    }
}


