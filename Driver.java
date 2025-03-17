package javaapplication34;
import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
// 2320230929فرح خليل حسن طبل


    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner s= new Scanner(System.in);

        //Create initial accounts
        createInitialAccounts(accounts);

        // Ask user if they want to add a new account
        askToAddNewAccount(accounts, s);

        // Calculate and print monthly interest for 12 months
        calculateMonthlyInterest(accounts);

        // Print balances after interest calculation
        printBalancesAfterInterest(accounts);

        // Perform deposit and withdrawal operations
        performDepositAndWithdrawal(accounts);

        //Modify the interest rate and recalculate interest
        modifyInterestRateAndRecalculate(accounts);

        // Print final balances after interest rate modification
        printBalancesAfterInterest(accounts);

    }

    public static void createInitialAccounts(ArrayList<Account> accounts) {
        Account acc1 = new Account();
        Account acc2 = new Account("User2", 10000.0);
        accounts.add(acc1);
        accounts.add(acc2);
        System.out.println("Initial balances:");
        printAccounts(accounts);
    }

    public static void askToAddNewAccount(ArrayList<Account> accounts, Scanner s) {
        System.out.print("Do you want to add a new account? (yes/no): ");
        String addNewAccount = s.nextLine();

        if (addNewAccount.equalsIgnoreCase("yes")) {
            System.out.print("Enter the new account name: ");
            String name = s.nextLine();

            System.out.print("Enter the initial balance: ");
            double balance = s.nextDouble();

            Account newAccount = new Account(name, balance);
            accounts.add(newAccount);
            System.out.println("New account added successfully!");
        } else {
            System.out.println("No new account will be added. Continuing with existing accounts.");
        }
    }

    public static void calculateMonthlyInterest(ArrayList<Account> accounts) {
        for (int i = 0; i < 12; i++) {
            for (Account acc : accounts) {
                acc.calculateMonthlyInterest();
            }
        }
    }

    // print balances after interest calculation
    public static void printBalancesAfterInterest(ArrayList<Account> accounts) {
        System.out.println("Balances after 12 months of interest:");
        printAccounts(accounts);
    }

    // Method to perform deposit and withdrawal operations
    public static void performDepositAndWithdrawal(ArrayList<Account> accounts) {
        accounts.get(0).deposit(1000); // Deposit 1000 into the first account
        accounts.get(1).withdraw(10000); // Withdraw 10000 from the second account

        System.out.println("Balances after deposit and withdrawal:");
        printAccounts(accounts);
    }

    // Method to modify the interest rate and recalculate interest
    public static void modifyInterestRateAndRecalculate(ArrayList<Account> accounts) {
        Account.modifyYearlyInterestRate(10.0);

        for (int i = 0; i < 12; i++) {
            for (Account acc : accounts) {
                acc.calculateMonthlyInterest();
            }
        }
    }
    public static void printAccounts(ArrayList<Account> accounts) {
        for (Account acc : accounts) {
            System.out.println(acc.getName() + " Balance: " + acc.getBalance());
        }
    }
}
// 2320230929فرح خليل حسن طبل
