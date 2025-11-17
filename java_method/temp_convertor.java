import java.util.*;

class TempConverter {

    static double cToF(double c) {
        return (c * 9/5) + 32;
    }

    static double fToC(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter Celsius:");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit: " + cToF(c));
        }
        else {
            System.out.println("Enter Fahrenheit:");
            double f = sc.nextDouble();
            System.out.println("Celsius: " + fToC(f));
        }
        sc.close();
    }
}
