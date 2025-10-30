import java.util.Scanner;
class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }
    void display() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}
public class Hotelbooking_System{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelBooking b1 = new HotelBooking();
        System.out.println("Default Booking:");
        b1.display();
        System.out.print("Enter Guest Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Room Type: ");
        String room = sc.nextLine();
        System.out.print("Enter Nights: ");
        int nights = sc.nextInt();
        HotelBooking b2 = new HotelBooking(name, room, nights);
        System.out.println("Parameterized Booking:");
        b2.display();
        HotelBooking b3 = new HotelBooking(b2);
        System.out.println("Copied Booking:");
        b3.display();
        sc.close();
    }
}

