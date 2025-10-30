import java.util.Scanner;
class Device {
    String deviceId;
    String status;
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}
class Thermostat extends Device {
    double temperatureSetting;
    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
public class Smart_Home_Devices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Device ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Device Status (ON/OFF): ");
        String status = sc.nextLine();
        System.out.print("Enter Temperature Setting: ");
        double temp = sc.nextDouble();
        Thermostat thermostat = new Thermostat(id, status, temp);
        System.out.println("\n===== Thermostat Status =====");
        thermostat.displayStatus();
        sc.close();
    }
}

