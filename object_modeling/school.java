import java.util.*;
class Course {
    String courseName;
    ArrayList<Student> stuList = new ArrayList<>();
    Course(String n) {
        courseName = n;
    }
    void addStudent(Student s) {
        stuList.add(s);
    }
}
class Student {
    String sName;
    ArrayList<Course> cList = new ArrayList<>();
    Student(String n) {
        sName = n;
    }
    void enroll(Course c) {
        cList.add(c);
        c.addStudent(this);
    }
    void showCourses() {
        for(Course c : cList) {
            System.out.println(c.courseName);
        }
    }
}
class School {
    ArrayList<Student> st = new ArrayList<>();
    void addStudent(Student s) {
        st.add(s);
    }
}
class Main4 {
    public static void main(String[] args) {
        School sc = new School();
        Student s1 = new Student("Rahul");
        Course c1 = new Course("Math");
        Course c2 = new Course("English");
        sc.addStudent(s1);
        s1.enroll(c1);
        s1.enroll(c2);
        s1.showCourses();
    }
}
