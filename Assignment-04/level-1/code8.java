zimport java.util.Scanner;
public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxIndex = 10;
        int[] factors = new int[maxIndex];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxIndex) {
                    int[] temp = new int[maxIndex * 2];
                    System.arraycopy(factors, 0, temp, 0, maxIndex);

