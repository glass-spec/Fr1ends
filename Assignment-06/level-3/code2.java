import java.util.ArrayList;

public class NumberChecker {
    public static void main(String[] args) {
        int number = 153; // You can take user input here
        int[] digits = getDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digits Count: " + digits.length);
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrong(digits, number));

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }

    public static int[] getDigits(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = num;
        while (temp > 0) {
            list.add(0, temp % 10); // store digits in order
            temp /= 10;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int[] digits, int num) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);
    }

    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        System.out.println("Smallest: " + smallest + ", Second Smallest: " + secondSmallest);
    }
}
