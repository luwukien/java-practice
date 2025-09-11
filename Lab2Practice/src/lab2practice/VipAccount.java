
package lab2practice;

public class VipAccount extends Account{
    private double overDraftLimit;

    public VipAccount(String accountNumber, String ownName, double balance, double overdraftLimit) {
        super(accountNumber, ownName, balance);
        this.overDraftLimit = overDraftLimit;
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= -overDraftLimit) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Over OverDraft Limit");
            return false;
        }
    }
    
    @Override
    public void displayAccount() {
        System.out.println("Your number account: " + accountNumber);
        System.out.println("Your name own account: " + ownName);
        System.out.println("The current balance of your account bank: " + balance);
    }
}
