public class VowelConsonantTable {
    public static String[][] analyzeCharacters(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = VowelConsonantCount.checkCharType(text.charAt(i));
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Character\tType");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}
