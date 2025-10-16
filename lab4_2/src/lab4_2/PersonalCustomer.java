package lab4_2;
import java.util.Scanner;
/**
 *
 * @author IdeaPad
 */
public class PersonalCustomer extends Customer {
    private String name;
    private int loyaltyPoint;

    public PersonalCustomer() {
        super();
        this.loyaltyPoint = 0; 
    }


    public PersonalCustomer(String name, int loyaltyPoint, String phone, String address) {
        super(phone, address);
        this.name = name;
        this.loyaltyPoint = loyaltyPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoyaltyPoint() {
        return loyaltyPoint;
    }

    public void setLoyaltyPoint(int loyaltyPoint) {
        this.loyaltyPoint = loyaltyPoint;
    }

    @Override
    public String toString() {
        return "PersonalCustomer{" + "phone = " + super.getPhone() + ", address = " 
                + super.getAddress() +", name = " + name + ", loyaltyPoint = " + loyaltyPoint + '}';
    }
    
    public void addLoyaltyPoint(int point) {
        this.loyaltyPoint += point;
    }
    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Please input the name: ");
        this.name = sc.nextLine();
    }
    
    
}
