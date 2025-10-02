package lab3_1;
import java.util.Scanner;
public class Lab3_1 {
    public static void main(String[] args) {
        
        // 1. Tạo tam giác thứ nhất bằng constructor mặc định
        System.out.println("--- Triangle 1 (Default Constructor) ---");
        Triangle t1 = new Triangle(); // Tự động tạo 3 đỉnh ở (0,0) 
        System.out.println("Information:");
        t1.display(); // In ra P1(0,0), P2(0,0), P3(0,0)
        System.out.println("Type: " + t1.getType()); // In ra loại tam giác
        System.out.println("----------------------------------------\n");
        
        
        // 2. Tạo tam giác thứ hai do mày tự chọn tọa độ [cite: 52]
        System.out.println("--- Triangle 2 (My choice) ---");
        // Tạo 3 cái điểm trước
        Point myP1 = new Point(0, 0);
        Point myP2 = new Point(3, 0);
        Point myP3 = new Point(0, 4);
        // Nhét 3 điểm vào tam giác
        Triangle t2 = new Triangle(myP1, myP2, myP3); // Đây là tam giác vuông
        System.out.println("Information:");
        t2.display();
        System.out.println("Type: " + t2.getType());
        System.out.println("----------------------------------------\n");
        
        Triangle tri_3 = new Triangle();
        tri_3.input();
        System.out.println("\nInformation of Triangle 3:\n");
        tri_3.display();
        System.out.println("Type: " + tri_3.getType());
        System.out.println("-------------------------------\n");
    }
    
}
