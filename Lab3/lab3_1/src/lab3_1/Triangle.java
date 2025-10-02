package lab3_1;

public class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
        this.p1 = new Point(0, 0);
        this.p2 = new Point(0, 0);
        this.p3 = new Point(0, 0);
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public void input() {
        p1.input();
        p2.input();
        p3.input();
    }

    public void display() {
        p1.display();
        p2.display();
        p3.display();
    }

    public String getType() {
        double c = p1.distance(p2);
        double b = p2.distance(p3);
        double a = p3.distance(p1);

        double EPSILON = 0.0001;

        if (c + b <= a || c + a <= b || a + b <= c) {
            return "Khong phai tam giac";
        }

        double a2 = a * a;
        double b2 = b * b;
        double c2 = c * c;

        boolean isIsosceles = (Math.abs(a - c) < EPSILON) || (Math.abs(b - c) < EPSILON) || (Math.abs(b - c) < EPSILON);

        boolean isRight = (Math.abs(a2 + b2 - c2) < EPSILON)
                || (Math.abs(a2 + c2 - b2) < EPSILON)
                || (Math.abs(b2 + c2 - a2) < EPSILON);
        
        if (Math.abs(a - b) < EPSILON && Math.abs(b - c) < EPSILON) {
            return "Tam giac deu";
        } else if (isIsosceles && isRight) {
            return "Tam giac vuong can";
        } else if (isRight) {
            return "Tam giac vuong";
        } else if (isIsosceles) {
            return "Tam giac can";
        } else {
            return "Tam giac thuong";
        }
    
    }

}
