package workshop3_lưu_chí_kiên_he204365;

import java.util.Scanner;

public class Lab_4 {

    public static void main(String[] args) {
        // Tạo MỘT scanner duy nhất để dùng cho cả chương trình
        Scanner sc = new Scanner(System.in);

        // --- Hình vuông 1: Dùng constructor mặc định ---
        System.out.println("===== SQUARE 1 (Default) =====");
        Square square_1 = new Square();
        square_1.display();
        System.out.println("Perimeter: " + square_1.getPerimeter());
        System.out.println("--- Vertices ---");
        System.out.print("Top Left (1): ");
        square_1.getVertices(1).display();
        System.out.print("Top Right (2): ");
        square_1.getVertices(2).display();
        System.out.print("Bottom Right (3): ");
        square_1.getVertices(3).display();
        System.out.println("=============================\n");

        // --- Hình vuông 2: Tự chọn thông tin ---
        System.out.println("===== SQUARE 2 (Custom) =====");
        Point point_2 = new Point(3, 5);
        Square square_2 = new Square(point_2, 7.5);
        square_2.display();
        System.out.println("Perimeter: " + square_2.getPerimeter());
        System.out.println("--- Vertices ---");
        System.out.print("Top Left (1): ");
        square_2.getVertices(1).display();
        System.out.print("Top Right (2): ");
        square_2.getVertices(2).display();
        System.out.print("Bottom Right (3): ");
        square_2.getVertices(3).display();
        System.out.println("=============================\n");

        // --- Hình vuông 3: Cho người dùng nhập ---
        System.out.println("===== SQUARE 3 (User Input) =====");
        Square square_3 = new Square();
        square_3.input(); // Truyền scanner vào
        System.out.println("\n--- Information of square 3 ---");
        square_3.display();
        System.out.println("Perimeter: " + square_3.getPerimeter());
        System.out.println("--- Vertices ---");
        System.out.print("Top Left (1): ");
        square_3.getVertices(1).display();
        System.out.print("Top Right (2): ");
        square_3.getVertices(2).display();
        System.out.print("Bottom Right (3): ");
        square_3.getVertices(3).display();
        System.out.println("=============================");

        // Đóng scanner khi không dùng nữa để tránh rò rỉ tài nguyên
        sc.close();
        
    }
//    public static int chooseValue() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Choose your choice: ");
//        int choice = sc.nextInt();
//        switch (choice) {
//            case 1:
//                return 1;
//            case 2: 
//                return 2;
//            case 3:
//                return 3;
//            default:
//                System.out.println("Cannot choose!");
//        }
//    }

}
