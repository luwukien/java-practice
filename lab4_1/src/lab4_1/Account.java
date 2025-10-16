package lab4_1;

/**
 *
 * @author IdeaPad
 */
public class Account {

    private double balance;
    private String accountNumber;

    public Account() {
        balance = 0;
    }

    public Account(String accountNumber) {
        balance = 0;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account{accountNumber = " + accountNumber + ", balance = " + balance + "}";
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("The amount should be positive");
            return;
        }
        if (balance < amount) {
            System.out.println("The balance is not enough");
            return;
        }
        balance = balance - amount;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Cannot deposit a negative amount");
            return;
        }
        balance += amount;
    }
}
