
package lab2practice;
public class Account {
    String accountNumber;
    String ownName;
    double balance;
    
    
    public Account() {
    }

    public Account(String accountNumber, String ownName, double balance) {
        this.accountNumber = accountNumber;
        this.ownName = ownName;
        this.balance = balance;
    }

    public String getAccountNumer() {
        return accountNumber;
    }

    public void setAccountNumer(String accountNumer) {
        this.accountNumber = accountNumer;
    }

    public String getOwnName() {
        return ownName;
    }

    public void setOwnName(String ownName) {
        this.ownName = ownName;
    }

    public double getBalance() {
        return balance;
    }
    
    
    public double deposit(double amount) {
        return balance += amount;
    }
    
    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Your accout balance is insufficient");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
    
    public void displayAccount() {
        System.out.println("Your number account: " + accountNumber);
        System.out.println("Your name own account: " + ownName);
        System.out.println("The current balance of your account bank: " + balance);
    }
    
}
