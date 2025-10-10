package lab3_7;

import java.util.Scanner;

public class Circle {

    private Point center;
    private double radius;
    
    private final double PI = 3.14;
    
    public Circle() {
        this.center = new Point(0, 0);
        this.radius = 1;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        if (radius <= 0) {
            this.radius = 1;
        } else {
            this.radius = radius;
        }
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            this.radius = 1;
        } else {
            this.radius = radius;
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        center = new Point();
        center.input();

        while (true) {
            try {
                System.out.println("Enter radius: ");
                double inputRadius = Double.parseDouble(sc.nextLine().trim());
                if (inputRadius > 0) {
                    this.radius = inputRadius;
                    break;
                } else {
                    System.out.println("Plz enter radius > 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: " + e);
                System.out.println("Please input number. Try again");
            }
        }
    }

    public void display() {
        System.out.println("Center = (" + this.center.getX() + "," + this.center.getY() + ")," + "radius =" + this.radius);
    }
    
    public double getArea() {
        
        return PI * this.radius * this.radius;
    }
    
    public double getDiameter() {
        return this.radius + this.radius;
    }
    
    public double getPerimeter() {
        return 2 * PI * this.radius; 
    }
}
