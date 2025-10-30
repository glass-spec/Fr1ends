import java.util.Scanner;

public class PalindromeCheck {
    static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    static boolean isPalindromeUsingArrays(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.println("Logic 1: " + (isPalindrome(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2: " + (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3: " + (isPalindromeUsingArrays(text) ? "Palindrome" : "Not Palindrome"));
    }
}
