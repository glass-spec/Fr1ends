import java.util.Scanner;
class PalindromeChecker {
    String text;
    PalindromeChecker(String text) {
        this.text = text;
    }
    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
    void display() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is not a Palindrome");
        }
    }
}
public class Palindrome_Checker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();
        PalindromeChecker p = new PalindromeChecker(str);
        p.display();
        sc.close();
    }
}
