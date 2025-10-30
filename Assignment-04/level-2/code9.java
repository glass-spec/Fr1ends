import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Handle negative numbers
        if (num < 0) num = -num;

        // Store digits in array
        int count = 0;
        long temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = (int) (num % 10);
            num /= 10;
        }

        // Frequency array of size 10
        int[] freq = new int[10];
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " -> " + freq[i] + " time(s)");
            }
        }

        sc.close();
    }
}
