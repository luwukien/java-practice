package lab4_2;

import java.util.Scanner;

/**
 *
 * @author IdeaPad
 */
public class Company {

    private Customer[] listCustomer;

    private void input() {
        Scanner sc = new Scanner(System.in);
        int numCustomer = 0;

        while (true) {
            System.out.println("Please input the number of Customer: ");
            try {
                int numCustomerInput = Integer.parseInt(sc.nextLine().trim());
                if (numCustomerInput > 0) {
                    numCustomer = numCustomerInput;
                    break;
                }
                System.out.println("Plz input number > 0");
            } catch (NumberFormatException e) {
                System.out.println("Plz enter integer number");
            }
        }

        listCustomer = new Customer[numCustomer];

        for (int i = 0; i < listCustomer.length; i++) {
            int choice;

            System.out.println("Customer " + (i + 1) + ": which customer you want to create: 1 - Customer, 2 - PersonalCustomer:");

            while (true) {
                try {
                    choice = Integer.parseInt(sc.nextLine().trim());
                    if (choice == 1 || choice == 2) {
                        break;
                    }
                    System.out.println("Plz input number = 1 or = 2");
                } catch (NumberFormatException e) {
                    System.out.println("Plz enter integer number");
                }
            }

            if (choice == 1) {
                listCustomer[i] = new Customer();
                listCustomer[i].input();
            } else if (choice == 2) {
                listCustomer[i] = new PersonalCustomer();
                ((PersonalCustomer) listCustomer[i]).input();
            }
        }
    }

    public void display() {
        for (Customer cs : listCustomer) {
            if (cs != null) {
                System.out.println(cs.toString());
            }
        }
    }

    public void addLoyaltyPoint() {
        for (Customer cs : listCustomer) {
            if (cs != null) {
                if (cs instanceof PersonalCustomer) {
                    ((PersonalCustomer) cs).addLoyaltyPoint(5);
                }
            }

        }
    }

    public static void main(String[] args) {
        Company newCompany = new Company();
        newCompany.input();
        System.out.println("List of input customers: ");
        newCompany.display();
        newCompany.addLoyaltyPoint();
        System.out.println("List of customers after updating loyalty point: ");
        newCompany.display();
    }
}
