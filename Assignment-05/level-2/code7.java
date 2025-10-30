import java.util.Scanner;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indexes = trimIndexes(text);
        String trimmed = substring(text, indexes[0], indexes[1] + 1);

        String builtinTrim = text.trim();
        boolean same = compareStrings(trimmed, builtinTrim);

        System.out.println("Custom Trimmed: [" + trimmed + "]");
        System.out.println("Built-in Trimmed: [" + builtinTrim + "]");
        System.out.println("Match? " + same);
        sc.close();
    }

    public static int[] trimIndexes(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String substring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) result += str.charAt(i);
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
}
