import java.util.Scanner;
class Employee {
    static String companyName = "TechSoft Pvt Ltd";
    static int totalEmployees = 0;
    String name;
    final int id;
    String designation;
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}
public class Employee_Management_System{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();
            employees[i] = new Employee(name, id, designation);
        }
        System.out.println("\n===== Employee Details =====");
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("-------------------------");
        }
        Employee.displayTotalEmployees();
        sc.close();
    }
}

