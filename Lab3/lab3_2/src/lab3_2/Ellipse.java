package lab3_2;

import java.util.Scanner;

public class Ellipse {

    private Point center;
    private double majorRadius;
    private double minorRadius;

    public Ellipse() {
        this.center = new Point(0, 0);

        this.minorRadius = 1;
        this.majorRadius = 2;
    }

    public Ellipse(Point center, double majorRadius, double minorRadius) {
        this.center = center;
        if (majorRadius <= 0) {
            this.majorRadius = 1;
        } else {
            this.majorRadius = majorRadius;
        }
        if (minorRadius <= 0) {
            this.minorRadius = 1;
        } else {
            this.minorRadius = minorRadius;
        }
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getMajorRadius() {
        return majorRadius;
    }

    public void setMajorRadius(double majorRadius) {
        this.majorRadius = majorRadius;
    }

    public double getMinorRadius() {
        return minorRadius;
    }

    public void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
    }

    public void input() {
        this.center = new Point();
        this.center.input();

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter major radius (must be positive): ");
                double major = Double.parseDouble(sc.nextLine());
                System.out.print("Enter minor radius (must be positive): ");
                double minor = Double.parseDouble(sc.nextLine());
                
                if (major > 0 && minor > 0 && major > minor) {
                    this.majorRadius = major;
                    this.minorRadius = minor;
                    break;
                } else System.out.println("Major radious > minor radius. Try again!");
            } catch (Exception e) {
                System.out.println("Please enter the double numbers");
            }

        }
    }

    public void display() {
        System.out.println("center(" + this.center.getX() + "," + this.center.getY() + "), " + "majorRadius = " + majorRadius + ", minorRadius = " + minorRadius);
    }

    public double getArea() {
        final double PI = 3.14;
        return PI * majorRadius * minorRadius;
    }
}
