package lab3_6;

import java.util.Scanner;

public class Product {

    private String productCode;
    private String productName;
    private String brand;
    private double price;
    private int quantity;

    public Product() {
    }

        public Product(String productCode, String productName, String brand, double price, int quantity) {
        this.productCode = productCode;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the product code format P-XXX-YYY: ");
            this.productCode = sc.nextLine().trim();
            if (this.productCode.matches("P-[A-Z]{3}-\\d{3}")) {
                break;
            }
            System.out.println("The product code format P-XXX-YYY. Try again!");
        }
        while (true) {
            System.out.println("Enter the product name:");
            this.productName = sc.nextLine().trim();
            if (!this.productName.isEmpty()) {
                break;
            }
            System.out.println("The product name cannot empty:");;
        }
        while (true) {
            System.out.println("Enter the brand: ");
            this.brand = sc.nextLine();
            if (Character.isUpperCase(this.brand.charAt(0))) {
                break;
            }
            System.out.println("The brand must be start upper case");
        }
        while (true) {
            try {
                System.out.println("Input price: ");
                double priceProduct = Double.parseDouble(sc.nextLine());
                if (priceProduct > 0) {
                    this.price = priceProduct;
                    break; // Thoát vòng lặp khi nhập đúng
                } else {
                    System.out.println("Price product must be positive. Try again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input number. Try again");
            }
        }

        while (true) {
            try {
                System.out.println("Input quantity: ");
                int quantityProduct = Integer.parseInt(sc.nextLine());
                if (quantityProduct > 0) {
                    this.quantity = quantityProduct;
                    break; // Thoát vòng lặp khi nhập đúng
                } else {
                    System.out.println("Quantity product must be positive. Try again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input number. Try again");
            }
        }
    }

    public void display() {
        System.out.printf("%-15s | %-25s | %-15s | %,.0f VND | %-10d\n",
                this.productCode,
                this.productName,
                this.brand,
                this.price,
                this.quantity);
    }
}
