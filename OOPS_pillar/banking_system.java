package Bridgelabz.oops_pillar_problems;

abstract class BankAccount {
    private double balance;

    BankAccount(int a, String n, double b) {
        balance = b;
    }

    public double getBalance() { return balance; }

    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) { balance -= amt; }

    abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int a, String n, double b) {
        super(a, n, b);
    }

    double calculateInterest() { return getBalance() * 0.04; }
}

class CurrentAccount extends BankAccount implements Loanable {
    CurrentAccount(int a, String n, double b) {
        super(a, n, b);
    }

    double calculateInterest() { return 0; }

    public void applyForLoan() {
        System.out.println("Loan Applied");
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 50000;
    }
}

class Main4 {
    public static void main(String[] args) {

        BankAccount b = new SavingsAccount(1, "Rahul", 20000);
        System.out.println(b.calculateInterest());
    }
}
