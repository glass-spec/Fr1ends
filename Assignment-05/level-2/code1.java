import java.util.Scanner;

public class StringLengthWithoutLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtInLength);
        sc.close();
    }

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // throws exception when out of bounds
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
}
