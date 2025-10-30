import java.util.Scanner;

public class BMICalculator2D {
    public static String[] calculateBMIAndStatus(double weight, double heightCm) {
        String[] result = new String[2];
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        result[0] = String.format("%.2f", bmi);
        if (bmi < 18.5) {
            result[1] = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            result[1] = "Normal";
        } else if (bmi >= 25 && bmi <= 29.9) {
            result[1] = "Overweight";
        } else {
            result[1] = "Obese";
        }
        return result;
    }

    public static String[][] generateBMIReport(double[][] personData) {
        String[][] report = new String[personData.length][4];
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            String[] bmiStatus = calculateBMIAndStatus(weight, height);
            report[i][0] = String.format("%.2f", height);
            report[i][1] = String.format("%.2f", weight);
            report[i][2] = bmiStatus[0];
            report[i][3] = bmiStatus[1];
        }
        return report;
    }

    public static void displayReport(String[][] report) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < report.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n",
                    report[i][0], report[i][1], report[i][2], report[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new

