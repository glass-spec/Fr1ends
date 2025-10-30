import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("Role: General Person");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        displayRole();
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class School_System{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Teacher details:");
        System.out.print("Name: ");
        String tName = sc.nextLine();
        System.out.print("Age: ");
        int tAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Subject: ");
        String subject = sc.nextLine();
        System.out.println("\nEnter Student details:");
        System.out.print("Name: ");
        String sName = sc.nextLine();
        System.out.print("Age: ");
        int sAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Grade: ");
        String grade = sc.nextLine();
        System.out.println("\nEnter Staff details:");
        System.out.print("Name: ");
        String stName = sc.nextLine();
        System.out.print("Age: ");
        int stAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();
        Teacher teacher = new Teacher(tName, tAge, subject);
        Student student = new Student(sName, sAge, grade);
        Staff staff = new Staff(stName, stAge, dept);
        System.out.println("\n===== School Members =====");
        teacher.displayDetails();
        System.out.println("-------------------------");
        student.displayDetails();
        System.out.println("-------------------------");
        staff.displayDetails();
        sc.close();
    }
}

