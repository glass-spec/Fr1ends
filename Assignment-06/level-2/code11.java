import java.util.Scanner;
import java.util.Arrays;

public class QuadraticRandom {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[0];
        if (delta == 0) return new double[]{-b / (2 * a)};
        double sqrt = Math.sqrt(delta);
        return new double[]{(-b + sqrt) / (2 * a), (-b - sqrt) / (2 * a)};
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return new double[]{(double)sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) System.out.println("No Real Roots");
        else System.out.println("Roots: " + Arrays.toString(roots));
        int[] randoms = generate4DigitRandomArray(5);
        double[] stats = findAverageMinMax(randoms);
        System.out.println("Random Numbers: " + Arrays.toString(randoms));
        System.out.println("Average: " + stats[0] + " Min: " + stats[1] + " Max: " + stats[2]);
    }
}
