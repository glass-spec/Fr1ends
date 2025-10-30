import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();

        // Conversion
        double totalInches = heightCm / 2.54;       // cm to inches
        int feet = (int) (totalInches / 12);        // get whole feet
        double inches = totalInches % 12;           // remaining inches

        // Printing result
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n",
                          heightCm, feet, inches);

        sc.close();
    }
}
