import java.util.Scanner;

public class ShortestAndLongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = SplitTextCompare.splitText(text);
        String[][] wordsWithLength = WordsWithLengths.wordsWithLengths(words);

        int[] indexes = findShortestAndLongest(wordsWithLength);
        System.out.println("Shortest word: " + wordsWithLength[indexes[0]][0]);
        System.out.println("Longest word: " + wordsWithLength[indexes[1]][0]);
        sc.close();
    }

    public static int[] findShortestAndLongest(String[][] arr) {
        int shortest = 0, longest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (Integer.parseInt(arr[i][1]) < Integer.parseInt(arr[shortest][1])) shortest = i;
            if (Integer.parseInt(arr[i][1]) > Integer.parseInt(arr[longest][1])) longest = i;
        }
        return new int[]{shortest, longest};
    }
}
