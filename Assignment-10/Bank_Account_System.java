import java.util.Scanner;
class BankAccount {
    static String bankName = "SBI Bank";
    static int totalAccounts = 0;
    String accountHolderName;
    final int accountNumber;
    double balance;
    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName; 
        this.accountNumber = accountNumber; 
        this.balance = balance;
        totalAccounts++;
    }
    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }
    static void getTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }
}
public class Bank_Account_System{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many accounts do you want to create? ");
        int n = sc.nextInt();
        sc.nextLine();
        BankAccount[] accounts = new BankAccount[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account " + (i + 1) + ":");
            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Account Number: ");
            int number = sc.nextInt();
            System.out.print("Enter Initial Balance: ");
            double bal = sc.nextDouble();
            sc.nextLine();
            accounts[i] = new BankAccount(name, number, bal);
        }
        System.out.println("\n===== Account Details =====");
        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("-----");
        }
        BankAccount.getTotalAccounts();
        sc.close();
    }
}

