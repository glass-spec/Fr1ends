import java.util.Scanner;

public class StringIndexExceptionDemo {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // invalid index
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
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
