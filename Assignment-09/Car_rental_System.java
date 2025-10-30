import java.util.Scanner;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    double calculateCost() {
        double dailyRate = 1000;
        return dailyRate * rentalDays;
    }
    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }
}
public class Car_rental_System{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Car Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Rental Days: ");
        int days = sc.nextInt();
        CarRental cr = new CarRental(name, model, days);
        cr.display();
        sc.close();
    }
}

