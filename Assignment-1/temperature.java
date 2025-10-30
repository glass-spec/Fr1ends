import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Celcius:");
        int Celcius = input.nextInt(); 
        int Fahrenheit = (Celcius*9/5)+32;
        System.out.println("The temperature in Fahrenheit is:"+Fahrenheit);
        input.close();
    }
}