package Bridgelabz.oops_pillar_problems;

abstract class Vehicle {
    private String number;
    private double rate;

    Vehicle(String n, String t, double r) {
        number = n;
        rate = r;
    }

    public String getNumber() { return number; }
    public double getRate() { return rate; }

    abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    void getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    Car(String n, double r) { super(n, "Car", r); }

    double calculateRentalCost(int d) { return d * getRate(); }

    public double calculateInsurance() { return 2000; }
    public void getInsuranceDetails() { System.out.println("Car Insurance: 2000"); }
}

class Bike extends Vehicle implements Insurable {
    Bike(String n, double r) { super(n, "Bike", r); }

    double calculateRentalCost(int d) { return d * getRate(); }

    public double calculateInsurance() { return 500; }
    public void getInsuranceDetails() { System.out.println("Bike Insurance: 500"); }
}

class Main3 {
    public static void main(String[] args) {

        Vehicle v = new Car("DL123", 1000);
        System.out.println("Rent: " + v.calculateRentalCost(5));
    }
}
