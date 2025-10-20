package lab4_3;

import java.util.Scanner;

public class Item {

    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }

    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Item{" + "name =" + name + ", price =" + price + '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the name:");
        this.name = sc.nextLine();

        while (true) {
            System.out.println("Please input the price (should not be negative): ");
            try {
                double priceInput = Double.parseDouble(sc.nextLine().trim());
                if (priceInput >= 0) {
                    this.price = priceInput;
                    break;
                }
                System.out.println("Plz input number >= 0");
            } catch (NumberFormatException e) {
                System.out.println("Plz enter double number");
            }
        }
    }
}
