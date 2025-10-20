package lab4_3;

import java.util.Scanner;

/**
 *
 * @author IdeaPad
 */
public class Food extends Item {

    private String category;
    private boolean expired;

    public Food() {
        this.expired = false;
    }

    public Food(String name, double price, String category) {
        super(name, price);
        this.category = category;
        this.expired = false;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpiredFood() {
        this.expired = true;
    }

    @Override
    public String toString() {
        return "Food{" + "name =" + super.getName() + ", price =" + super.getPrice() + ", category=" + category + ", expired=" + expired + '}';
    }
    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Please input the category:");
        this.category = sc.nextLine();
    }

}
