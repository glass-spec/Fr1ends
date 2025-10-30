import java.util.Scanner;
class Vehicle {
    static double registrationFee = 500.0; // default registration fee
    String ownerName;
    String vehicleType;
    final String registrationNumber;
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }
}
public class Vehicle_Registration_System{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many vehicles do you want to register? ");
        int n = sc.nextInt();
        sc.nextLine();
        Vehicle[] vehicles = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Vehicle " + (i + 1) + ":");
            System.out.print("Enter Owner Name: ");
            String owner = sc.nextLine();
            System.out.print("Enter Vehicle Type: ");
            String type = sc.nextLine();
            System.out.print("Enter Registration Number: ");
            String regNum = sc.nextLine();
            vehicles[i] = new Vehicle(owner, type, regNum);
        }
        System.out.println("\n===== Vehicle Registration Details =====");
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("-------------------------");
        }
        System.out.print("\nEnter new registration fee to update: ");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);
        System.out.println("\n===== Updated Vehicle Details =====");
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("-------------------------");
        }
        sc.close();
    }
}

