import java.util.Arrays;

public class PalindromeChecker {
    public static void main(String[] args) {
        int number = 12321;
        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));
        System.out.println("Is Palindrome: " + Arrays.equals(digits, reversed));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }
}
