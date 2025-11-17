package Bridgelabz.oops_pillar_problems;
abstract class Patient {
    private int id;
    private String name;
    private int age;

    Patient(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void getPatientDetails() {
        System.out.println(name + " - " + age);
    }

    abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String r);
    void viewRecords();
}

class InPatient extends Patient {
    InPatient(int i, String n, int a) { super(i, n, a); }

    double calculateBill() { return 5000; }
}

class OutPatient extends Patient {
    OutPatient(int i, String n, int a) { super(i, n, a); }

    double calculateBill() { return 1000; }
}

class Main7 {
    public static void main(String[] args) {

        Patient p = new InPatient(1, "Rohan", 20);
        System.out.println(p.calculateBill());
    }
}
