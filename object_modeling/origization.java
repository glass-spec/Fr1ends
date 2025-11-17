import java.util.ArrayList;
class Employee {
    String eName;
    Employee(String n) {
        eName = n;
    }
}
class Department {
    String dName;
    ArrayList<Employee> empList = new ArrayList<>();
    Department(String n) {
        dName = n;
    }
    void addEmployee(Employee e) {
        empList.add(e);
    }
}
class Company {
    String cName;
    ArrayList<Department> depList = new ArrayList<>();
    Company(String n) {
        cName = n;
    }
    void addDept(Department d) {
        depList.add(d);
    }
    void deleteCompany() {
        depList.clear();
        System.out.println("Company removed with all departments and employees");
    }
}
class Main3 {
    public static void main(String[] args) {
        Company com = new Company("ABC Ltd");
        Department d = new Department("IT");
        d.addEmployee(new Employee("Amit"));
        com.addDept(d);
        com.deleteCompany();
    }
}
