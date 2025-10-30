import java.util.Scanner;
class MobilePhone {
    String brand;
    String model;
    double price;
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
public class Mobile_Details{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        MobilePhone m = new MobilePhone(brand, model, price);
        m.display();
        sc.close();
    }
}

