package lab_3;

import java.util.Scanner;

public class Rectangle {

    private Point center;
    private double width;
    private double height;

    public Rectangle() {
        this.center = new Point(0, 0);
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(Point center, double width, double height) {
        this.center = center;
        if (width <= 0) {
            this.width = 1;
        } else {
            this.width = width;
        }
        if (height <= 0) {
            this.height = 1;
        } else {
            this.height = height;
        }
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        Point inputCenter = new Point();
        System.out.println("Input the value x center: ");
        inputCenter.setX(Integer.parseInt(sc.nextLine()));
        System.out.println("Inpute the value y center: ");
        inputCenter.setY(Integer.parseInt(sc.nextLine()));

        this.center = inputCenter;

        while (true) {
            try {
                System.out.println("Input width: ");
                int inputWidth = Integer.parseInt(sc.nextLine());
                if (inputWidth > 0) {
                    this.width = inputWidth;
                    break;
                } else {
                    System.out.println("Width > 0. Try again ");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: " + e);
                System.out.println("Please input number. Try again");
            }
        }

        while (true) {
            try {
                System.out.println("Input height: ");
                int inputHeight = Integer.parseInt(sc.nextLine());
                if (inputHeight > 0) {
                    this.height = inputHeight;
                    break;
                } else {
                    System.out.println("Height > 0. Try again ");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: " + e);
                System.out.println("Please input number. Try again");
            }
        }

    }

    public void display() {
        System.out.println("center(" + this.center.getX() + "), " + "width=" + this.width + ", height=" + this.height);
    }

    public double getArea() {
        return this.height * this.width;
    }

    public Point getVertices(int verticeIndex) {
        double halfWidth = this.width / 2;
        double halfHeight = this.height / 2;

        int centerX = this.center.getX();
        int centerY = this.center.getY();

        switch (verticeIndex) {
            case 1:
                return new Point((int) (centerX - halfWidth), (int) (centerY - halfHeight));
            case 2: // Top Left
                return new Point((int) (centerX - halfWidth), (int) (centerY + halfHeight));

            case 3: // Top Right
                return new Point((int) (centerX + halfWidth), (int) (centerY + halfHeight));

            case 4: // Bottom Right
                return new Point((int) (centerX + halfWidth), (int) (centerY - halfHeight));

            default:
                System.out.println("Invalid index.");
                return null;
        }

    }
}
