package lab5_1;

/**
 *
 * @author IdeaPad
 */
public class Motor extends Vehicle implements Runable {

    public Motor() {
    }

    public Motor(String manufacturer, double price, String color) {
        super(manufacturer, price, color);
    }

    @Override
    public String toString() {
        return "Motor{" + "manufacturer = " + super.getManufacturer() + ", price = "
                + super.getPrice() + ", color = " + super.getColor() + '}';
    }

    @Override
    public void input() {
        super.input();
    }

    @Override
    public int getWheels() {
        return 2;
    }

    @Override
    public void start() {
        System.out.println(toString() + " starts the engine.");
    }

    @Override
    public void run() {
        System.out.println(toString() + " run by engine.");
    }

    @Override
    public void stop() {
        System.out.println(toString() + " stops the engine.");
    }
}
