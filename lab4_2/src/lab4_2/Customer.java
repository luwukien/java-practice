package lab4_2;

import java.util.Scanner;

/**
 *
 * @author IdeaPad
 */
public class Customer {

    private String phone;
    private String address;

    public Customer() {
    }

    public Customer(String phone, String address) {
        setPhone(phone);
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "phone = " + phone + ", address = " + address + '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please input the phone (containing 10 or 11 digits):  ");
            String phoneInput = sc.nextLine();
            if (phoneInput.matches("\\d{10,11}")) {
                this.phone = phoneInput;
                break;
            }
            System.out.println("Invalid phone number. Please input again.");
        }
        System.out.println("Please input the address:");
        this.address = sc.nextLine();
    }

}
