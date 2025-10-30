import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int EMP_COUNT = 10;

        double[] salary = new double[EMP_COUNT];
        double[] years = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Input salaries and years of service
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            // Get salary
            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();
            if (sal <= 0) {
                System.out.println("Invalid salary! Please enter again.");
                i--;
                continue;
            }

            // Get years of service
            System.out.print("Enter years of service: ");
            double yr = sc.nextDouble();
            if (yr < 0) {
                System.out.println("Invalid years! Please enter again.");
                i--;
                continue;
            }

            salary[i] = sal;
            years[i] = yr;
        }

        // Calculate bonuses and new salaries
        for (int i = 0; i < EMP_COUNT; i++) {
            bonus[i] = (years[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\n--- Final Report ---");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
