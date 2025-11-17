import java.util.*;
class NumberGuessGame {
    static int generateGuess(Random r) {
        return r.nextInt(100) + 1;
    }
    static String userFeedback(Scanner sc) {
        System.out.println("Enter feedback (high / low / correct): ");
        return sc.nextLine();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Think of a number between 1 and 100!");
        while (true) {
            int guess = generateGuess(r);
            System.out.println("My guess: " + guess);
            String fb = userFeedback(sc);
            if (fb.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed it!");
                break;
            }
        }
    }
}
