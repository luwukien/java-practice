package lab5_2;

import java.util.Scanner;

public class Test {

    Person[] listPersons;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the number of Persons: ");
        int n = Integer.parseInt(sc.nextLine());
        listPersons = new Person[n];
        int kind;
        for (int i = 0; i < listPersons.length; i++) {
            do {
                System.out.print("Person " + (i + 1) + ": which person do you want to create "
                        + "(1- Customer, 2 - Eployee, 3 - Manager): ");
                kind = Integer.parseInt(sc.nextLine());
                if (kind == 1) {
                    listPersons[i] = new Customer();
                    listPersons[i].input();
                } else if (kind == 2) {
                    listPersons[i] = new Employee();
                    listPersons[i].input();
                } else if (kind == 3) {
                    listPersons[i] = new Manager();
                    listPersons[i].input();
                }
            } while (kind < 1 || kind > 3);
        }
    }

    void display() {
        for (Person obj : listPersons) {
            obj.display();
        }
    }

    void testPay() {
        Scanner sc = new Scanner(System.in);

        for (Person obj : listPersons) {
            if (obj instanceof payable) {
                // Cast to payable to access the getPaidAmount method
                payable p = (payable) obj;

                // Print object info as per example 
                System.out.println(obj.toString());

                double extraBonus = 0;
                double deductionAmount = 0;

                // Input extraBonus with validation (must be non-negative) 
                while (true) {
                    try {
                        System.out.print("Input extra bonus: ");
                        extraBonus = Double.parseDouble(sc.nextLine());
                        if (extraBonus >= 0) {
                            break;
                        } else {
                            System.out.println("Extra bonus must be non-negative. Please input again.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number. Please input again.");
                    }
                }

                // Input deductionAmount with validation (must be non-negative) 
                while (true) {
                    try {
                        System.out.print("Input deduction amount: ");
                        deductionAmount = Double.parseDouble(sc.nextLine());
                        if (deductionAmount >= 0) {
                            break;
                        } else {
                            // Example shows re-prompt for negative deduction 
                            System.out.println("Deduction must be non-negative. Please input again.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number. Please input again.");
                    }
                }

                // Calculate and display the paid amount [cite: 258, 336, 340]
                double paidAmount = p.getPaidAmount(deductionAmount, extraBonus);
                System.out.println(obj.toString() + " is paid " + paidAmount);
            }
        }
    }

    public static void main(String[] args) { 
        Test newTest = new Test();
        newTest.input();
        System.out.println("List of input persons: ");
        newTest.display();
        System.out.println("Test pay:");
        newTest.testPay();
    }
}
