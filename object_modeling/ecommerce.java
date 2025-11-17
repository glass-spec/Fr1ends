import java.util.*;
class Product {
    String pName;
    int price;
    Product(String n, int p) {
        pName = n;
        price = p;
    }
}
class Order {
    ArrayList<Product> list = new ArrayList<>();
    void addProduct(Product p) {
        list.add(p);
    }
    void showOrder() {
        for(Product p : list) {
            System.out.println(p.pName + " - " + p.price);
        }
    }
}
class Customer2 {
    String name;
    Customer2(String n) {
        name = n;
    }
    Order makeOrder() {
        System.out.println(name + " created an order");
        return new Order();
    }
}
class Main7 {
    public static void main(String[] args) {
        Customer2 c = new Customer2("Dipanshu");
        Order o = c.makeOrder();
        o.addProduct(new Product("Laptop", 50000));
        o.addProduct(new Product("Mouse", 500));
        o.showOrder();
    }
}
