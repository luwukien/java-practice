package lab3_6;

import java.util.Scanner;

public class StoreManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory i_1 = new Inventory();
        do {
            System.out.println("1. Add a new product to inventory.\n"
                    + "\n"
                    + "2. Display all products in inventory.\n"
                    + "\n"
                    + "3. Search for a product by code.\n"
                    + "\n"
                    + "4. Exit.");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    i_1.addProduct();
                    break;
                case 2:
                    i_1.displayAllProduct();
                    break;
                case 3:
                    System.out.println("Enter your code to find: ");
                    String code = sc.nextLine();
                    Product p = i_1.findProductByCode(code);
                    if (p != null) {
                        p.display();
                    } else {
                        System.out.println("Not found product");
                    }
                    break;
                case 4:
                    System.out.println("Cut");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Plz your choice 1 - 4");
            }
        } while (true);

    }

}
