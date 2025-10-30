import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] distributeChocolates(int chocolates, int children) {
        return new int[]{chocolates % children, chocolates / children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt(), children = sc.nextInt();
        int[] res = distributeChocolates(chocolates, children);
        System.out.println("Each Child Gets: " + res[1] + " Remaining: " + res[0]);
    }
}
