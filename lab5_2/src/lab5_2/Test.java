package lab5_2;

/**
 *
 * @author IdeaPad
 */

import java.util.Scanner;

public class Test {

    Person[] listPersons; // [cite: 259]

    void input() { // [cite: 261-287] (Copied verbatim)
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the number of Persons: ");
        int n = Integer.parseInt(sc.nextLine());
        listPersons = new Person[n];
        int kind;
        for (int i = 0; i < listPersons.length; i++) {
            do {
                System.out.print("Person " + (i + 1) + ": which person do you want to create " +
                                 "(1- Customer, 2 - Eployee, 3 - Manager): ");
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

    void display() { // [cite: 288-292] (Copied verbatim)
        for (Person obj : listPersons) {
            obj.display();
        }
    }

    void testPay() {
        Scanner sc = new Scanner(System.in);
        
        for (Person obj : listPersons) { // [cite: 294]
            // Check if the object is an Employee or Manager using the payable interface 
            if (obj instanceof payable) {
                // Cast to payable to access the getPaidAmount method
                payable p = (payable) obj;
                
                // Print object info as per example [cite: 332, 337]
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

                // Input deductionAmount with validation (must be non-negative) [cite: 258, 334-335]
                while (true) {
                    try {
                        System.out.print("Input deduction amount: ");
                        deductionAmount = Double.parseDouble(sc.nextLine());
                        if (deductionAmount >= 0) {
                            break;
                        } else {
                            // Example shows re-prompt for negative deduction [cite: 334-335]
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

    public static void main(String[] args) { // [cite: 298-306] (Copied verbatim)
        Test newTest = new Test();
        newTest.input();
        System.out.println("List of input persons: ");
        newTest.display();
        System.out.println("Test pay:");
        newTest.testPay();
    }
}  
}
