import java.util.Scanner;
class Circle {
    double radius;
    Circle() {
        this(1.0);
    }
    Circle(double radius) {
        this.radius = radius;
    }
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (3.14 * radius * radius));
    }
}
public class Cirlcle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.println("Default Circle:");
        c1.display();
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        Circle c2 = new Circle(r);
        System.out.println("User Circle:");
        c2.display();
        sc.close();
    }
}

