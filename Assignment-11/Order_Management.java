import java.util.Scanner;
class Order {
    String orderId;
    String orderDate;
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus() {
        return "Order Placed";
    }
    void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}
class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    String getOrderStatus() {
        return "Order Shipped, Tracking Number: " + trackingNumber;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
    }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    String getOrderStatus() {
        return "Order Delivered on: " + deliveryDate;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
    }
}
public class Order_Management{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Order Date: ");
        String date = sc.nextLine();
        System.out.print("Enter Tracking Number: ");
        String tracking = sc.nextLine();
        System.out.print("Enter Delivery Date: ");
        String delivery = sc.nextLine();
        DeliveredOrder order = new DeliveredOrder(id, date, tracking, delivery);
        System.out.println("\n===== Order Details =====");
        order.displayDetails();
        sc.close();
    }
}

