import java.util.Scanner;

public class BMI {
    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] people = new double[10][3];
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            people[i][0] = sc.nextDouble();
            people[i][1] = sc.nextDouble();
            double h = people[i][1] / 100;
            people[i][2] = people[i][0] / (h * h);
            status[i] = getStatus(people[i][2]);
        }
        for (int i = 0; i < 10; i++)
            System.out.println("Weight: " + people[i][0] + " Height: " + people[i][1] + " BMI: " + people[i][2] + " Status: " + status[i]);
    }
}
