import java.util.*;
class Book {
    String title;
    String author;
    Book(String t, String a) {
        title = t;
        author = a;
    }
}
class Library {
    ArrayList<Book> list = new ArrayList<>();
    void addBook(Book b) {
        list.add(b);
    }
    void show() {
        for(Book b : list) {
            System.out.println(b.title + " - " + b.author);
        }
    }
}
class Main1 {
    public static void main(String[] args) {
        Book b1 = new Book("java", "james");
        Book b2 = new Book("python", "guido");
        Library lib = new Library();
        lib.addBook(b1);
        lib.addBook(b2);
        lib.show();
    }
}
