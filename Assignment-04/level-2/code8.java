import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array: [student][0=Physics, 1=Chemistry, 2=Maths]
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            boolean valid = true;
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                double m = sc.nextDouble();

                if (m < 0 || m > 100) {
                    System.out.println("Invalid marks! Enter marks between 0 and 100.");
                    valid = false;
                    break;
                }
                marks[i][j] = m;
            }

            if (!valid) {
                i--; // re-
