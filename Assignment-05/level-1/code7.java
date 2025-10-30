import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text); // may fail
        System.out.println(num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
        } catch(Exception e) {
            System.out.println("Other exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as text: ");
        String text = sc.nextLine();

        // generateException(text); // will crash
        handleException(text); // safe handling
    }
}
