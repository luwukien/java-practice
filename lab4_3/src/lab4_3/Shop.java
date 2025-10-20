package lab4_3;

import java.util.Scanner;

/**
 *
 * @author IdeaPad
 */
public class Shop {

    private Item[] listItem;

    public void input() {
        Scanner sc = new Scanner(System.in);
        int inputItems;

        while (true) {
            System.out.println("Please input the number of items: ");
            try {
                int inputNumber = Integer.parseInt(sc.nextLine().trim());
                if (inputNumber > 0) {
                    inputItems = inputNumber;
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Plz enter integer number");
            }
        }
        listItem = new Item[inputItems];

        int inputChoose;
        for (int i = 0; i < listItem.length; i++) {
            while (true) {
                System.out.println("Item" + (i + 1) + ": which item you want to create: 1 - Item, 2 - Food: ");
                try {
                    inputChoose = Integer.parseInt(sc.nextLine().trim());
                    if (inputChoose == 1 || inputChoose == 2) {
                        break;
                    }
                    System.out.println("Please input == 1 || input == 2");
                } catch (NumberFormatException e) {
                    System.out.println("Plz enter integer number");
                }
            }

            if (inputChoose == 1) {
                listItem[i] = new Item();
                listItem[i].input();
            }
            if (inputChoose == 2) {
                listItem[i] = new Food();
                listItem[i].input();
            }
        }
    }

    public void display() {
        for (Item list : listItem) {
            if (list != null) {
                System.out.println(list);
            }
        }
    }
    
    public void updateExpired() {
        for (Item list : listItem) {
            if (list != null) {
                if (list instanceof Food) {
                    ((Food) list).setExpiredFood();
                }
            }
        }
    }

    public static void main(String[] args) {
        Shop newShop = new Shop();
        newShop.input();
        System.out.println("List of input items: ");
        newShop.display();
        newShop.updateExpired();
        System.out.println("List of items after updating expiration status: ");
        newShop.display();
    }

}
