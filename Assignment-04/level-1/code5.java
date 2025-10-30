import java.util.Scanner;
public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] results = new int[4];
        for (int i = 0; i < 4; i++) {
            results[i] = number * (i + 6);
            System.out.println(number + " * " + (i + 6) + " = " + results[i]);
        }
    }
}
