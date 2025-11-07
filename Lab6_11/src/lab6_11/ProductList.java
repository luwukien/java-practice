package lab6_11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author IdeaPad
 */
public class ProductList {

    private ArrayList<Product> productList;

    public ProductList() {
        productList = new ArrayList<>();
    }

    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Please input the information of the product to insert.");
        product.input();
        if (search(product.getId()) == null) {
            productList.add(product);
            System.out.println(product.toString() + "has been added.");
        } else {
            System.out.println("Product with id = " + product.getId() + " already exists. The" + product.toString()
                    + "is not added into the list.");
        }
    }

    public Product search(int productId) {
        for (Product product : productList) {
            if (product.getId() == productId) {
                return product;
            }
        }

        return null;
    }

    public void searchProduct() {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.print("Input id of the product to search: ");
        while (true) {
            try {
                int idInput = Integer.parseInt(sc.nextLine());
                id = idInput;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Id is not valid. Reinput id = ");
            }
        }
        Product temp = search(id);
        if (search(id) != null) {
            System.out.print("Product found: ");
            System.out.println(temp.toString());
        } else {
            System.out.println("Product " + id + " does not exist.");
        }

    }

    public void removeProduct() {
        Scanner sc = new Scanner(System.in);
        int id;
        while (true) {
            try {
                System.out.print("Input id of the product to delete: ");
                int idInput = Integer.parseInt(sc.nextLine());
                id = idInput;
                break;
            } catch (NumberFormatException e) {
                System.out.print("Id is not valid. Reinput id = ");
            }
        }
        int currentId = id;
        Product temp = search(currentId);
        if (productList.removeIf(product -> product.getId() == currentId)) {
            System.out.println(temp + " has been removed.");
        } else {
            System.out.println("Product " + id + " does not exist.");
        }

    }

    public void show() {
        System.out.println("We have " + productList.size() + " products");
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public void sort() {
        Comparator<Product> priceComparator = Comparator.comparingDouble(Product::getPrice).reversed();

        Comparator<Product> finalComparator = priceComparator.thenComparing(Product::getName);

        Collections.sort(productList, finalComparator);
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

}
