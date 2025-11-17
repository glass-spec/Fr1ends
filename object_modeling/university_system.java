import java.util.*;
class Professor {
    String pName;
    Professor(String n) {
        pName = n;
    }
}
class Student3 {
    String sName;
    Student3(String n) {
        sName = n;
    }
}
class Course3 {
    String cName;
    Professor prof;
    ArrayList<Student3> list = new ArrayList<>();
    Course3(String n) {
        cName = n;
    }
    void addProfessor(Professor p) {
        prof = p;
        System.out.println(p.pName + " now teaching " + cName);
    }
    void enroll(Student3 s) {
        list.add(s);
        System.out.println(s.sName + " joined " + cName);
    }
}
class Main8 {
    public static void main(String[] args) {
        Student3 s = new Student3("Aman");
        Professor p = new Professor("Dr. Mehta");
        Course3 c = new Course3("Physics");
        c.enroll(s);
        c.addProfessor(p);
    }
}
