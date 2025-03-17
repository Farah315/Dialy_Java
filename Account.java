package javaapplication34;

public class Account {

    private String name;
    private double balance;
    private static double yearlyInterestRate;

    public Account(String n, double b) {
        name = n;
        yearlyInterestRate = 5.0;
        if (b > 0) {
            balance = b;
        } else {
            System.out.println("The balance cannot be negative");
            balance = 5000.0;
        }
    }

    public Account() {
        this("MyAccount", 5000.0);
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        if (b >= 0) {
            balance = b;
        } else {
            System.out.println("The balance cannot be negative");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void calculateMonthlyInterest() {
        balance += (balance * yearlyInterestRate / 100) / 12;
    }

    public static void modifyYearlyInterestRate(double newRate) {
        yearlyInterestRate = newRate;
    }
}


