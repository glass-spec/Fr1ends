class Patient {
    String pName;
    Patient(String n) {
        pName = n;
    }
}
class Doctor {
    String dName;
    Doctor(String n) {
        dName = n;
    }
    void consult(Patient p) {
        System.out.println(dName + " consulted " + p.pName);
    }
}
class Main6 {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Verma");
        Patient p = new Patient("Rohan");
        d.consult(p);
    }
}
