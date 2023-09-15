public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(Account destination, double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            destination.deposit(amount);
        } else {
            System.out.println("Invalid transfer amount or insufficient balance.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}
