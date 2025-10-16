package lab4_1;

/**
 *
 * @author IdeaPad
 */
public class SavingAccount extends Account {

    private double interest;

    public SavingAccount(String accountNumber, double interest) {
        super(accountNumber);
        setInterest(interest);
    }

    public void setInterest(double interest) {
        if (interest < 0) {
            this.interest = 0;
        } else {
            this.interest = interest;
        }
    }

    @Override
    public String toString() {
        return "SavingAccount{accountNumber =" + super.getAccountNumber() + ", balance = " + super.getBalance() 
                + ", interest = " + interest + "}";
        
    }
    
    public void addInterest() {
        double newBalance = getBalance() * this.interest / 100;
        deposit(newBalance);
    }
        

}
