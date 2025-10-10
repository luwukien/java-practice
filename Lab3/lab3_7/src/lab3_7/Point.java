package lab3_7;

import java.util.Scanner;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x > 0) {
            this.x = x;
        } else this.x = 0;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y > 0) {
            this.y = y;
        } else this.y = 0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Input x: ");
                int inputY = Integer.parseInt(sc.nextLine().trim());
                this.y = inputY;
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR: " + e);
                System.out.println("Please input number. Try again");
            }
        }

        while (true) {
            try {
                System.out.println("Input y: ");
                int inputY = Integer.parseInt(sc.nextLine().trim());
                this.y = inputY;
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR: " + e);
                System.out.println("Please input number. Try again");
            }
        }
    }

    public void display() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}
