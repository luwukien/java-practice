package lab5_1;

import java.util.Scanner;

/**
 *
 * @author IdeaPad
 */
public class Bicycle extends Vehicle {
    private String type;

    public Bicycle() {
        super();
    }

    public Bicycle(String type) {
        this.type = type;
    }

    public Bicycle(String type, String manufacturer, double price, String color) {
        super(manufacturer, price, color);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Moi nhap type: ");
        this.type = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Bicycle{" + "manufacturer = " + super.getManufacturer() + ", price = " + super.getPrice() + 
                ", color = " + super.getColor() + ", type = " + type + '}';
    }
    
    @Override
    public int getWheels() {
        return 2;
    }
    
    
}
