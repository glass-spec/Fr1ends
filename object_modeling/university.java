import java.util.*;
class Faculty {
    String fName;
    Faculty(String n) {
        fName = n;
    }
}
class Dept {
    String name;
    Dept(String n) {
        name = n;
    }
}
class University {
    ArrayList<Dept> depList = new ArrayList<>();
    ArrayList<Faculty> facList = new ArrayList<>();
    void addDept(Dept d) {
        depList.add(d);
    }
    void addFaculty(Faculty f) {
        facList.add(f);
    }
    void deleteUniversity() {
        depList.clear();
        System.out.println("University removed");
    }
}
class Main5 {
    public static void main(String[] args) {
        University u = new University();
        Dept d1 = new Dept("CS");
        Faculty f1 = new Faculty("Dr. Sharma");
        u.addDept(d1);
        u.addFaculty(f1);
        u.deleteUniversity();
    }
}
