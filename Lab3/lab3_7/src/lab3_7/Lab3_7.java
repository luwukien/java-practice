package lab3_7;
public class Lab3_7 {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        displayInfo(c1, "Circle 1");
        
        Point p2 = new Point(4, 5);
        Circle c2 = new Circle(p2, -5);
        displayInfo(c2, "Circle 2");
        
        Circle c3 = new Circle();
        c3.input();
        displayInfo(c3, "Circle 3");
        
        System.out.println("========== LARGEST CIRCLE ==========");
        Circle largest = c1;
        if (c2.getArea() > largest.getArea()) {
            largest = c2;
        } 
        if (c3.getArea() > largest.getArea()) {
            largest = c3;
        }
        
        System.out.println("LARGEST CIRCLE: ");
        largest.display();
    }
    
    public static void displayInfo(Circle c, String name) {
        System.out.println("----------------" + "Information of " + name + "----------------");
        
        c.display();
        
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Diameter: " + c.getDiameter());
        System.out.println("---------------------------------------------------------------");
    }
    
}
