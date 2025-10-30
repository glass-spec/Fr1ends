import java.util.Scanner;
class Book {
    static String libraryName = "City Central Library";
    String title;
    String author;
    final String isbn;
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}
public class Library_Management_System{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many books do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Enter Title: ");
            String title = sc.nextLine();
            System.out.print("Enter Author: ");
            String author = sc.nextLine();
            System.out.print("Enter ISBN: ");
            String isbn = sc.nextLine();
            books[i] = new Book(title, author, isbn);
        }
        System.out.println("\n===== Library Books =====");
        for (Book b : books) {
            b.displayDetails();
            System.out.println("-----------------------");
        }
        System.out.println();
        Book.displayLibraryName();
        sc.close();
    }
}


