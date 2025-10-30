import java.util.Scanner;

public class Factors {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[index++] = i;
        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr) s += i;
        return s;
    }

    public static int product(int[] arr) {
        int p = 1;
        for (int i : arr) p *= i;
        return p;
    }

    public static int sumOfSquares(int[] arr) {
        int s = 0;
        for (int i : arr) s += Math.pow(i, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}
