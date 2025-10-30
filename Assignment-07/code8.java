import java.util.Scanner;

public class LexicographicalCompare {
    public static int compareStrings(String str1, String str2) {
        int n = Math.min(str1.length(), str2.length());
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        return str1.length() - str2.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        Str
