class Bank {
    String name;
    Bank(String n) {
        name = n;
    }
    void openAccount(Customer c) {
        System.out.println("Account opened for " + c.cName + " in " + name);
    }
}
class Customer {
    String cName;
    int balance = 0;
    Customer(String n) {
        cName = n;
    }
    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
class Main2 {
    public static void main(String[] args) {
        Bank b = new Bank("SBI");
        Customer c = new Customer("Dipanshu");
        b.openAccount(c);
        c.showBalance();
    }
}
