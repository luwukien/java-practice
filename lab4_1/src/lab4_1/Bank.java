package lab4_1;

import java.util.Scanner;

public class Bank {

    private Account[] listAccount;

    public void input() {
        int numAccount = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please input the number of Account: ");
            try {
                int numAccountInput = Integer.parseInt(sc.nextLine().trim());
                if (numAccountInput > 0) {
                    numAccount = numAccountInput;
                    break;
                }
                System.out.println("Plz input number > 0");
            } catch (NumberFormatException e) {
                System.out.println("Plz enter integer number");
            }
        }

        listAccount = new Account[numAccount];

        for (int i = 0; i < numAccount; i++) {
            int choice;

            while (true) {
                System.out.println("Account " + (i + 1) + ": which account you want to create (1 - Account, 2 - SavingAccount): ");
                try {
                    choice = Integer.parseInt(sc.nextLine().trim());
                    if (choice == 1 || choice == 2) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Plz enter number");
                }
            }

            System.out.println("Please input the account number: ");
            String accountNumber = sc.nextLine().trim();

            double balance;
            while (true) {
                System.out.println("Please input the balance (not negative number): ");
                try {
                    balance = Double.parseDouble(sc.nextLine().trim());
                    if (balance >= 0) {
                        break;
                    }
                    System.out.println("Balance > 0");
                } catch (NumberFormatException e) {
                    System.out.println("Plz enter number");
                }
            }

            double interest;
            if (choice == 1) {
                listAccount[i] = new Account(accountNumber);
                listAccount[i].deposit(balance);
            } else {
                while (true) {
                    System.out.println("Please input the interest (not negative number)");
                    try {
                        interest = Double.parseDouble(sc.nextLine().trim());
                        if (interest >= 0) {
                            break;
                        }
                        System.out.println("Interest > 0");
                    } catch (NumberFormatException e) {
                        System.out.println("Plz enter number");
                    }
                }
                listAccount[i] = new SavingAccount(accountNumber, interest);
                listAccount[i].deposit(balance);
            }
        }
    }

    public void display() {
        for (Account acc : listAccount) {
            if (acc != null) {
                System.out.println(acc.toString());
            }
        }
    }

    public void updateInterest() {
        for (Account list : listAccount) {
            if (list instanceof SavingAccount) {
                ((SavingAccount) list).addInterest();
            }

        }
    }

    public static void main(String[] args) {
        Bank newBank = new Bank();
        newBank.input();
        System.out.println("List of input accounts: ");
        newBank.display();
        newBank.updateInterest();
        System.out.println("List of accounts after updating interest: ");
        newBank.display();

    }

}
