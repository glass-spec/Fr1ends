import java.util.Scanner;
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}
public class Atm_Simulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder: ");
        String holder = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();
        BankAccount acc = new BankAccount(holder, accNo, bal);
        acc.displayBalance();
        System.out.print("Enter amount to Deposit: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);
        System.out.print("Enter amount to Withdraw: ");
        double w = sc.nextDouble();
        acc.withdraw(w);
        acc.displayBalance();
        sc.close();
    }
}

