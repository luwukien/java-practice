package lab5_2;

/**
 *
 * @author IdeaPad
 */

import java.util.Scanner;

/**
 * Customer class, extends Person.
 */
public class Customer extends Person {
    private int loyaltyPoints;

    public Customer() {
        super();
    }

    public Customer(String name, String address, String phone, int loyaltyPoints) {
        super(name, address, phone);
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public void input() {
        super.input(); // [cite: 234]
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input loyaltyPoints: ");
                int points = Integer.parseInt(sc.nextLine());
                if (points >= 0) { // [cite: 235]
                    this.loyaltyPoints = points;
                    break;
                } else {
                    System.out.println("Loyalty points must be non-negative. Please input again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please input again.");
            }
        }
    }

    @Override
    public String toString() {
        // [cite: 232]
        return "Customer{name = " + getName() + ", address = " + getAddress() + 
               ", phone = " + getPhone() + ", loyaltyPoints = " + loyaltyPoints + '}';
    }

    @Override
    public void display() {
        // [cite: 236]
        System.out.println("I am a customer: " + this.toString());
    }
}