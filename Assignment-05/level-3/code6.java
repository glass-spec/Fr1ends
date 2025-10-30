import java.util.Scanner;

public class CharFrequencyNestedLoop {
    static String[] findCharFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[j] != '0') {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        String[] result = new String[chars.length];
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[k++] = chars[i] + " -> " + freq[i];
            }
        }
        String[] finalResult = new String[k];
        System.arraycopy(result, 0, finalResult, 0, k);
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[] frequencies = findCharFrequency(text);
        for (String s : frequencies) System.out.println(s);
    }
}
