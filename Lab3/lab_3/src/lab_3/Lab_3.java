package lab_3;

public class Lab_3 {

    public static void main(String[] args) {
        //****************************************************************
        // HÌNH CHỮ NHẬT 1: DÙNG CONSTRUCTOR MẶC ĐỊNH
        //****************************************************************
        System.out.println("===== HÌNH CHỮ NHẬT 1 (Tạo bằng constructor mặc định) =====");
        Rectangle r1 = new Rectangle();
        // Constructor mặc định của mày sẽ tự tạo HCN 1x1 tại tâm (0,0)
        displayFullInfo(r1, "Hình chữ nhật 1");

        //****************************************************************
        // HÌNH CHỮ NHẬT 2: DÙNG CONSTRUCTOR CÓ THAM SỐ (TỰ CHỌN)
        //****************************************************************
        System.out.println("\n\n===== HÌNH CHỮ NHẬT 2 (Tạo bằng thông số tự chọn) =====");
        Point center2 = new Point(5, 8); // Tạo một điểm tâm tọa độ (5, 8)
        Rectangle r2 = new Rectangle(center2, 20.5, 10); // Rộng 20.5, Cao 10
        displayFullInfo(r2, "Hình chữ nhật 2");

        //****************************************************************
        // HÌNH CHỮ NHẬT 3: CHO NGƯỜI DÙNG NHẬP TỪ BÀN PHÍM
        //****************************************************************
        System.out.println("\n\n===== HÌNH CHỮ NHẬT 3 (Nhập từ bàn phím) =====");
        Rectangle r3 = new Rectangle(); // Tạo một object rỗng
        r3.input(); // Bắt nó tự đi hỏi người dùng để điền thông tin
        displayFullInfo(r3, "Hình chữ nhật 3");

    }

    public static void displayFullInfo(Rectangle rect, String name) {
        System.out.println("\n--- Thông tin chi tiết của: " + name + " ---");

        // 1. Hiển thị thông tin cơ bản
        // Hàm display() của mày hơi xấu, tao in lại cho đẹp hơn
        Point center = rect.getCenter();
        System.out.println("Thông số: Center = (" + center.getX() + ", " + center.getY() + "), Width = " + rect.getWidth() + ", Height = " + rect.getHeight());

        // 2. Hiển thị diện tích
        System.out.println("Diện tích: " + rect.getArea());

        // 3. Hiển thị tọa độ 4 đỉnh
        System.out.println("Tọa độ 4 đỉnh:");
        Point bl = rect.getVertices(1); // Bottom Left
        Point tl = rect.getVertices(2); // Top Left
        Point tr = rect.getVertices(3); // Top Right
        Point br = rect.getVertices(4); // Bottom Right

        if (bl != null) { // Chỉ cần check 1 thằng là được
            System.out.println(" - Đỉnh Dưới Trái (1): (" + bl.getX() + ", " + bl.getY() + ")");
            System.out.println(" - Đỉnh Trên Trái (2): (" + tl.getX() + ", " + tl.getY() + ")");
            System.out.println(" - Đỉnh Trên Phải (3): (" + tr.getX() + ", " + tr.getY() + ")");
            System.out.println(" - Đỉnh Dưới Phải (4): (" + br.getX() + ", " + br.getY() + ")");
        }
    }
}
