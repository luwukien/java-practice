package lab3_6;

import java.util.Scanner;

public class Inventory {

    private Product[] productList;
    private int productCount;

    Scanner sc = new Scanner(System.in);

    public Inventory() {
        this.productList = new Product[100];
        this.productCount = 0;
    }

    public Inventory(Product[] productList, int productCount) {
        this.productList = productList;
        this.productCount = productCount;
    }

    public void addProduct() {
        if (productCount == productList.length) {
            System.out.println("Full");
        }
        System.out.println("Add new product");
        Product newProduct = new Product();
        newProduct.input();
        productList[productCount] = newProduct;
        productCount++;
        System.out.println("Đã thêm sản phẩm thành công!");

    }

    public void displayAllProduct() {
        if (this.productCount == 0) {
            System.out.println("Inventory is empty.");
            return;
        }
        
        System.out.printf("%-15s | %-25s | %-15s | %-12s | %-10s\n",
                "Product Code", "Tên Sản Phẩm", "Hãng", "Giá Tiền", "Số Lượng");
        System.out.println("-------------------------------------------------------------------------------------------");
        
        for (int i = 0; i < this.productCount; i++) {

            this.productList[i].display();
        }

    }

    public Product findProductByCode(String codeToFind) {
        for (int i = 0; i < this.productCount; i++) {
            if (this.productList[i].getProductCode().equals(codeToFind)) {
                return this.productList[i];
            }
        }
        return null;
    }

}
