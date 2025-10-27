package lab5_1;

import java.util.Scanner;

public abstract class Vehicle {

    private String manufacturer;
    private double price;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String manufacturer, double price, String color) {
        this.manufacturer = manufacturer;
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "manufacturer =" + manufacturer + ", price =" + price + ", color =" + color + '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap manufacturer: ");
        this.manufacturer = sc.nextLine();
        while (true) {
            System.out.print("Moi nhap price: ");
            try {
                double inputPrice = Double.parseDouble(sc.nextLine().trim());
                if (inputPrice >= 0) {
                    this.price = inputPrice;
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Plz enter number");
            }
        }
        System.out.print("Moi nhap color: ");
        this.color = sc.nextLine();
    }
    
    public abstract int getWheels();
    
}
