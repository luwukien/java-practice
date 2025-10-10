package workshop3_lưu_chí_kiên_he204365;

import java.util.Scanner;

public class Square {

    private Point bottomLeftVertice;
    private double edgeLength;

    public Square() {
        this.bottomLeftVertice = new Point(0, 0);
        this.edgeLength = 1;
    }

    public Square(Point bottomLeftVertice, double edgeLength) {
        this.bottomLeftVertice = bottomLeftVertice;
        if (edgeLength < 0) {
            this.edgeLength = 1;
        } else {
            this.edgeLength = edgeLength;
        }
    }

    public Point getBottomLeftVertice() {
        return bottomLeftVertice;
    }

    public void setBottomLeftVertice(Point bottomLeftVertice) {
        this.bottomLeftVertice = bottomLeftVertice;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        if (edgeLength < 0) {
            this.edgeLength = 1;
        } else {
            this.edgeLength = edgeLength;
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        this.bottomLeftVertice = new Point();
        this.bottomLeftVertice.input();

        while (true) {
            try {
                System.out.println("Input engthLength: ");
                double edge = Double.parseDouble(sc.nextLine().trim());
                if (edge > 0) {
                    this.edgeLength = edge;
                    break; // Thoát vòng lặp khi nhập đúng
                } else {
                    System.out.println("Edge length must be positive. Try again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: " + e);
                System.out.println("Please input number. Try again");
            }
        }
    }

    public void display() {
        System.out.print("Bottom left vertice = ");
        this.bottomLeftVertice.display();
        System.out.println("Length of edges = " + this.edgeLength);
    }

    public double getPerimeter() {
        return 4 * this.edgeLength;
    }

    public Point getVertices(int verticalIndex) {
        int x_edge = this.bottomLeftVertice.getX();
        int y_edge = this.bottomLeftVertice.getY();
        switch (verticalIndex) {
            case 1:
                return new Point(bottomLeftVertice.getX(), (int) (y_edge + this.edgeLength));
            case 2:
                return new Point((int) (x_edge + this.edgeLength), (int) (y_edge + this.edgeLength));
            case 3:
                return new Point((int) (x_edge + this.edgeLength), y_edge);
            default:
                throw new IllegalArgumentException("Enter the number 1 - 2 - 3");
        }
    }
}
