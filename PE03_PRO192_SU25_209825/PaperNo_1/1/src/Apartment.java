
/**
 *
 * @author IdeaPad
 */
public class Apartment {
    private int id;
    private String name;
    private double price;
    private int numberOfBedrooms;

    public Apartment() {
    }

    public Apartment(int id, String name, double price, int numberOfBedrooms) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.numberOfBedrooms = numberOfBedrooms;
    }
    
    public String getName() {
        return name.toUpperCase();
    }
    
    public double getFinalPrice() {
        if (numberOfBedrooms >= 2) {
            return price + price * 0.1;
        }
        return price;
    }
    
    @Override
    public String toString() {
        return this.id + ", " + getName() + ", " + + this.numberOfBedrooms + ", " + getFinalPrice();
    }
    
}
