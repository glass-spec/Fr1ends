import java.util.Scanner;
class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;
    String name;
    final int rollNumber;
    String grade;
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
    void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated successfully for " + name);
        }
    }
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}
public class University_Management_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students do you want to enroll? ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Grade: ");
            String grade = sc.nextLine();
            students[i] = new Student(name, roll, grade);
        }
        System.out.println("\n===== Student Details =====");
        for (Student s : students) {
            s.displayDetails();
            System.out.println("-------------------------");
        }
        System.out.print("\nDo you want to update a grade? (yes/no): ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter Roll Number of student: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new Grade: ");
            String newGrade = sc.nextLine();
            boolean found = false;
            for (Student s : students) {
                if (s.rollNumber == roll) {
                    s.updateGrade(newGrade);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student with Roll Number " + roll + " not found.");
            }
        }
        System.out.println("\n===== Updated Student Details =====");
        for (Student s : students) {
            s.displayDetails();
            System.out.println("-------------------------");
        }
        Student.displayTotalStudents();
        sc.close();
    }
}

