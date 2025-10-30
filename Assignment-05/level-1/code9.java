import java.util.Scanner;

public class ToUpperCompare {
    public static String toUpperUsingCharAt(String text) {
        String result = "";
        for(int i=0;i<text.length();i++) {
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <= 'z') ch = (char)(ch - 32);
            result += ch;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        for(int i=0;i<s1.length();i++)
            if(s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String upperUserDefined = toUpperUsingCharAt(text);
        String upperBuiltIn = text.toUpperCase();

        boolean isEqual = compareStrings(upperUserDefined, upperBuiltIn);
        System.out.println("User-defined uppercase: " + upperUserDefined);
        System.out.println("Built-in uppercase: " + upperBuiltIn);
        System.out.println("Are both uppercase strings equal? " + isEqual);
    }
}
