package pkgclass;

public class Account {

    private double balance;
    private double interestRate;
    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public double getBalance() {
        return balance;
    }
    public void displayAccountDetails() {
        System.out.println("Account Balance: $" + balance);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}
class SavingsAccount extends Account {

    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }
}

class CheckingAccount extends Account {

    public CheckingAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }
}

class MoneyMarketAccount extends Account {

    public MoneyMarketAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }
}
