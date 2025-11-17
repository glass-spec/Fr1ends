package Bridgelabz.oops_pillar_problems;
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    LibraryItem(int id, String t, String a) {
        itemId = id;
        title = t;
        author = a;
    }
    void getItemDetails() {
        System.out.println(title + " - " + author);
    }

    abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
    void checkAvailability();
}
class Book extends LibraryItem implements Reservable {
    Book(int id, String t, String a) { super(id, t, a); }
    int getLoanDuration() { return 14; }
    public void reserveItem() {}
    public void checkAvailability() {}
}
class Main5 {
    public static void main(String[] args) {

        LibraryItem i = new Book(1, "Java", "James");
        System.out.println(i.getLoanDuration());
    }
}
