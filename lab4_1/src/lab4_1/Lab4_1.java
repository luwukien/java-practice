package lab4_1;

/**
 *
 * @author IdeaPad
 */
public class Lab4_1 {

    public static void main(String[] args) {
        Bank newBank = new Bank();
        newBank.input();
        System.out.println("List of input accounts: ");
        newBank.display();
        newBank.updateInterest();
        System.out.println("List of accounts after updating interest: ");
        newBank.display();

    }

}
