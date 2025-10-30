import java.util.Scanner;
class Product {
    static double discount = 10; 
    String productName;
    final int productID;
    double price;
    int quantity;
    Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }
    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID: " + productID);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: " + calculatePriceAfterDiscount());
        }
    }
    double calculatePriceAfterDiscount() {
        return price * quantity * (1 - discount / 100);
    }
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}
public class Shopping_cart_system{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many products do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();
            products[i] = new Product(name, id, price, qty);
        }
        System.out.println("\n===== Product Details =====");
        for (Product p : products) {
            p.displayDetails();
            System.out.println("-------------------------");
        }
        System.out.print("\nEnter new discount percentage to update: ");
        double newDiscount = sc.nextDouble();
        Product.updateDiscount(newDiscount);
        System.out.println("\n===== Updated Product Details with Discount =====");
        for (Product p : products) {
            p.displayDetails();
            System.out.println("-------------------------");
        }
        sc.close();
    }
}

