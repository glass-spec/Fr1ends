package Bridgelabz.oops_pillar_problems;

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    RideVehicle(String id, String d, double r) {
        vehicleId = id;
        driverName = d;
        ratePerKm = r;
    }

    public double getRate() { return ratePerKm; }

    void getVehicleDetails() {
        System.out.println(driverName + " driving " + vehicleId);
    }

    abstract double calculateFare(double distance);
}

interface GPS {
    void getCurrentLocation();
    void updateLocation(String l);
}

class CarRide extends RideVehicle implements GPS {
    CarRide(String id, String d, double r) { super(id, d, r); }

    double calculateFare(double dis) { return dis * getRate(); }

    public void getCurrentLocation() {}
    public void updateLocation(String l) {}
}

class Main8 {
    public static void main(String[] args) {

        RideVehicle r = new CarRide("C1", "Amit", 10);
        System.out.println(r.calculateFare(5));
    }
}
