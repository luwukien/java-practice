
package lab2practice;

public class Lab2Practice {

    public static void main(String[] args) {
        Account normalAccount = new Account("HE204365", "Luu Chi Kien", 100_000_000);
        Account vipAccount = new VipAccount("HE999999", "Kien Nha Giau", 50_000, 100_000);
        
    
        normalAccount.displayAccount();
        normalAccount.withdraw(200_000_000);
        System.out.println("\n");
        normalAccount.displayAccount();
        
        vipAccount.withdraw(100_000);
        vipAccount.displayAccount();
        
    }
    
}
