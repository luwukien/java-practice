package lab5_1;

import java.util.Scanner;

/**
 *
 * @author IdeaPad
 */
public class Car extends Vehicle implements Runable {

    private String insideColor;
    private int doorNumber;

    public Car() {
        super();
    }

    public Car(String insideColor, int doorNumber, String manufacturer, double price, String color) {
        super(manufacturer, price, color);
        if (doorNumber < 1) {
            this.doorNumber = 1;
        } else {
            this.doorNumber = doorNumber;
        }
        this.insideColor = insideColor;
    }

    public String getInsideColor() {
        return insideColor;
    }

    public void setInsideColor(String insideColor) {
        this.insideColor = insideColor;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        if (doorNumber < 1) {
            this.doorNumber = 1;
        } else {
            this.doorNumber = doorNumber;
        }
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Moi nhap insideColor: ");
        this.insideColor = sc.nextLine();
        while (true) {
            System.out.print("Moi nhap doorNumber: ");
            try {
                int inputDoorNumber = Integer.parseInt(sc.nextLine().trim());
                if (inputDoorNumber >= 1) {
                    this.doorNumber = inputDoorNumber;
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Plz enter number");
            }
        }
    }

    @Override
    public int getWheels() {
        return 4;
    }

    @Override
    public String toString() {
        return "Car{" + "manufacturer = " + super.getManufacturer() + ", price = " + super.getPrice()
                + ", color = " + super.getColor() + ", insideColor = " + insideColor + ", doorNumber = " + doorNumber + '}';
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
