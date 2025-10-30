import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // start > end
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch(IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
        } catch(Exception e) {
            System.out.println("Other exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // generateException(text); // will crash
        handleException(text); // safe handling
    }
}
