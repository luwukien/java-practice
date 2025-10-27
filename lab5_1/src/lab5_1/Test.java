package lab5_1;

import java.util.Scanner;

public class Test {

    Vehicle[] listVehicles;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the number of Vehicles: ");
        int n = Integer.parseInt(sc.nextLine());
        listVehicles = new Vehicle[n];
        int kind;
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Vehicle " + (i + 1) + ": which vehicle do you want to create: 1 - Bicycle, 2 - Car, 3 - Motor: ");
                kind = Integer.parseInt(sc.nextLine());
                if (kind == 1) {
                    listVehicles[i] = new Bicycle();
                    listVehicles[i].input();
                } else if (kind == 2) {
                    listVehicles[i] = new Car();
                    listVehicles[i].input();
                } else if (kind == 3) {
                    listVehicles[i] = new Motor();
                    listVehicles[i].input();
                }
            } while (kind < 1 || kind > 3);
        }
    }

    void display() {
        for (Vehicle obj : listVehicles) {
            System.out.println(obj.toString() + " has " + obj.getWheels() + " wheels");
        }
    }

    void testRun() {
        Scanner sc = new Scanner(System.in);
        int inputChoice;
        for (Vehicle obj : listVehicles) {
            if (obj instanceof Runable) {
                while (true) {
                    System.out.print("Which function do you want to test (1 - start, 2 - run, 3 - stop): ");
                    try {
                        inputChoice = Integer.parseInt(sc.nextLine().trim());
                        if (inputChoice == 1 || inputChoice == 2 || inputChoice == 3) {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.print("Plz enter number");
                    }
                }

                Runable r = (Runable) obj;

                switch (inputChoice) {
                    case 1:
                        r.start();
                        break;
                    case 2:
                        r.run();
                        break;
                    case 3:
                        r.stop();
                        break;
                }
            }

        }
    }

    public static void main(String[] args) {
        Test newTest = new Test();
        newTest.input();
        System.out.println("List of input vehicles: ");
        newTest.display();
        System.out.println("Test run:");
        newTest.testRun();

    }

}
