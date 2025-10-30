import java.util.Scanner;
class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String authorName;
    String bio;
    Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + authorName);
        System.out.println("Author Bio: " + bio);
    }
}
public class Library_Management{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Publication Year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Author Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Author Bio: ");
        String bio = sc.nextLine();
        Author bookAuthor = new Author(title, year, name, bio);
        System.out.println("\n===== Book and Author Details =====");
        bookAuthor.displayInfo();
        sc.close();
    }
}

