package lab3_2;
public class Lab3_2 {

    public static void main(String[] args) {
        System.out.println("--- Ellipse 1  ---");
        Ellipse e1 = new Ellipse(); 
        System.out.println("Information:");
        e1.display(); 
        System.out.println("Area: " + String.format("%.2f", e1.getArea())); 
        System.out.println("----------------------------------------\n");
        
        System.out.println("--- Ellipse 2 ---");
        Point p2 = new Point(3, 4);
        Ellipse e2 = new Ellipse(p2, 5, 6); 
        System.out.println("Information:");
        e2.display(); 
        System.out.println("Area: " + String.format("%.2f", e2.getArea())); 
        System.out.println("----------------------------------------\n");
        
        
        System.out.println("--- Ellipse 3  ---");
        Ellipse e3 = new Ellipse(); 
        e3.input();
        System.out.println("Information:");
        e3.display(); 
        System.out.println("Area: " + String.format("%.2f", e3.getArea())); 
        System.out.println("----------------------------------------\n");

    }
    
}
