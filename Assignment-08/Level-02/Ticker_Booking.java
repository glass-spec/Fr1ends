import java.util.Scanner;
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    void display() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}
public class Ticker_Booking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();
        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();
        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();
        MovieTicket t = new MovieTicket();
        t.bookTicket(movie, seat, price);
        t.display();
        sc.close();
    }
}

