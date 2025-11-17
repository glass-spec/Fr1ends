package Bridgelabz.oops_pillar_problems;
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String n, double p, int q) {
        itemName = n;
        price = p;
        quantity = q;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    void getItemDetails() {
        System.out.println(itemName + " - " + price);
    }
    abstract double calculateTotalPrice();
}
interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    VegItem(String n, double p, int q) { super(n, p, q); }
    double calculateTotalPrice() { return getPrice() * getQuantity(); }
    public double applyDiscount() { return 10; }
    public void getDiscountDetails() {}
}

class Main6 {
    public static void main(String[] args) {

        FoodItem f = new VegItem("Burger", 80, 2);
        System.out.println(f.calculateTotalPrice());
    }
}
