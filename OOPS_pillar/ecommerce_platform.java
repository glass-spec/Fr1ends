package Bridgelabz.oops_pillar_problems;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int id, String n, double p) {
        productId = id;
        name = n;
        price = p;
    }

    public int getId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double p) { price = p; }

    abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    void getTaxDetails();
}

class Electronics extends Product implements Taxable {
    Electronics(int id, String n, double p) {
        super(id, n, p);
    }

    double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public void getTaxDetails() {
        System.out.println("Tax: 18%");
    }
}

class Clothing extends Product implements Taxable {
    Clothing(int id, String n, double p) {
        super(id, n, p);
    }

    double calculateDiscount() {
        return getPrice() * 0.20;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public void getTaxDetails() {
        System.out.println("Tax: 5%");
    }
}

class Groceries extends Product {
    Groceries(int id, String n, double p) {
        super(id, n, p);
    }

    double calculateDiscount() {
        return getPrice() * 0.02;
    }
}

class Main2 {
    public static void main(String[] args) {

        Product p = new Electronics(1, "Laptop", 50000);
        double finalPrice = p.getPrice() + ((Taxable)p).calculateTax() - p.calculateDiscount();
        System.out.println("Final Price: " + finalPrice);
    }
}
