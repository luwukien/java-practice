package lab6_11;

import java.util.Scanner;

/**
 *
 * @author IdeaPad
 */
public class Product {

    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Product{" + "id = " + id + ", name = " + name + ", price = " + price + '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("id = ");
        while (true) {
            try {
                int idInput = Integer.parseInt(sc.nextLine());
                this.id = idInput;
                break;
            } catch (NumberFormatException e) {
                System.out.print("Id is not valid. Reinput id = ");
            }
        }
        
        System.out.print("Name = ");
        this.name = sc.nextLine();
        
        System.out.print("Input price: ");
        while (true) {
            try {
                double priceInput = Double.parseDouble(sc.nextLine());
                if (priceInput >= 0) {
                    this.price = priceInput;
                    break;
                } else {
                    System.out.print("Price is not valid. Reinput Price = ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Price is not valid. Reinput Price = ");
            }
        }
    }
}
