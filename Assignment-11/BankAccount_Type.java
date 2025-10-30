import java.util.Scanner;

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("Account Type: General Bank Account");
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        displayAccountType();
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int durationMonths;

    FixedDepositAccount(String accountNumber, double balance, int durationMonths) {
        super(accountNumber, balance);
        this.durationMonths = durationMonths;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Duration: " + durationMonths + " months");
    }
}

public class BankAccount_Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Savings Account details:");
        System.out.print("Account Number: ");
        String acc1 = sc.nextLine();
        System.out.print("Balance: ");
        double bal1 = sc.nextDouble();
        System.out.print("Interest Rate: ");
        double rate = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nEnter Checking Account details:");
        System.out.print("Account Number: ");
        String acc2 = sc.nextLine();
        System.out.print("Balance: ");
        double bal2 = sc.nextDouble();
        System.out.print("Withdrawal Limit: ");
        double limit = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nEnter Fixed Deposit Account details:");
        System.out.print("Account Number: ");
        String acc3 = sc.nextLine();
        System.out.print("Balance: ");
        double bal3 = sc.nextDouble();
        System.out.print("Duration (months): ");
        int duration = sc.nextInt();

        SavingsAccount sa = new SavingsAccount(acc1, bal1, rate);
        CheckingAccount ca = new CheckingAccount(acc2, bal2, limit);
        FixedDepositAccount fd = new FixedDepositAccount(acc3, bal3, duration);

        System.out.println("\n===== Account Details =====");
        sa.displayDetails();
        System.out.println("-------------------------");
        ca.displayDetails();
        System.out.println("-------------------------");
        fd.displayDetails();

        sc.close();
    }
}
