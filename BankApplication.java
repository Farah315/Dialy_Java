
package pkgclass;
public class BankApplication {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount(500, 0.02);
        MoneyMarketAccount moneyMarketAccount = new MoneyMarketAccount(2000, 0.07);
        System.out.println("Savings Account:");
        savingsAccount.deposit(200);
        savingsAccount.withdraw(100);
        savingsAccount.displayAccountDetails();
        System.out.println("Interest Earned: $" + savingsAccount.calculateInterest());
        System.out.println();
        System.out.println("Checking Account:");
        checkingAccount.deposit(300);
        checkingAccount.withdraw(50);
        checkingAccount.displayAccountDetails();
        System.out.println("Interest Earned: $" + checkingAccount.calculateInterest());
        System.out.println();

        System.out.println("Money Market Account:");
        moneyMarketAccount.deposit(1000);
        moneyMarketAccount.withdraw(500);
        moneyMarketAccount.displayAccountDetails();
        System.out.println("Interest Earned: $" + moneyMarketAccount.calculateInterest());
    }
}
 
