package lab6_11;

import java.util.Scanner;

public class Main {

    public static void displayMenu() {
        System.out.println("================= Menu ================");
        System.out.println("1. Add a new Product.");
        System.out.println("2. Search a product based on its id.");
        System.out.println("3. Remove a product based on its id.");
        System.out.println("4. Sort the product list.");
        System.out.println("5. List all products.");
        System.out.println("6. Quit.");
        System.out.print("Choose from 1 to 6: ");
    }

    public static int getMenuChoice() {
        displayMenu();
        Scanner sc = new Scanner(System.in);
        int choice = 6;
        try {
            choice = Integer.parseInt(sc.nextLine());
            if (choice > 0 && choice <= 6) {
                return choice;
            } else {
                return 6;
            }
        } catch (Exception e) {
            return 6;
        }
    }

    public static void main(String[] args) {
        ProductList plist = new ProductList();
        int choice = 0;
        do {
            choice = getMenuChoice();
            switch (choice) {
                case 1:
                    plist.addProduct();
                    break;
                case 2:
                    plist.searchProduct();
                    break;
                case 3:
                    plist.removeProduct();
                    break;
                case 4:
                    plist.sort();
                    break;
                case 5:
                    plist.show();
                    break;
                default:
                    System.out.println("Good bye!");
            }
        } while (choice > 0 && choice < 6);
    }

}
