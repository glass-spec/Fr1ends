import java.util.Scanner;
class CartItem {
    String itemName;
    double price;
    int quantity;
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    void addItem(int qty) {
        quantity += qty;
    }
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        } else {
            System.out.println("Not enough items to remove.");
        }
    }
    void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }
}
public class Shopping_Cart{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        CartItem item = new CartItem(name, price, qty);
        item.displayTotalCost();
        System.out.print("Add how many items? ");
        int add = sc.nextInt();
        item.addItem(add);
        System.out.print("Remove how many items? ");
        int rem = sc.nextInt();
        item.removeItem(rem);
        item.displayTotalCost();
        sc.close();
    }
}

