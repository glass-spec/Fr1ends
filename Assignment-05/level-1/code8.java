import java.util.Scanner;

public class ArrayIndexDemo {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]); // invalid index
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        } catch(Exception e) {
            System.out.println("Other exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for(int i=0;i<3;i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = sc.nextLine();
        }

        // generateException(names); // will crash
        handleException(names); // safe handling
    }
}
