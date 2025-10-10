package lab3_7;

import java.util.Scanner;

public class Point_1 {

    private int x;
    private int y;

    public Point_1() {
    }

    public Point_1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Input x: ");
                int inputX = Integer.parseInt(sc.nextLine());
                this.x = inputX;
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e);
                System.out.println("Please input number. Try again");
            }
        }

        while (true) {
            try {
                System.out.println("Input y: ");
                int inputY = Integer.parseInt(sc.nextLine());
                this.y = inputY;
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e);
                System.out.println("Please input number. Try again");
            }
        }
    }

    public void display() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

    public double distance(Point_1 other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

}
