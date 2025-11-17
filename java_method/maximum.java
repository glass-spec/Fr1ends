import java.util.*;
class MaxOfThree {
    static int takeInput(Scanner sc) {
        return sc.nextInt();
    }
    static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = takeInput(sc);
        int b = takeInput(sc);
        int c = takeInput(sc);
        System.out.println("Maximum is: " + findMax(a, b, c));
    }
}
