    package lab5_2;

import java.util.Scanner;

public abstract class Person {
    private String name;
    private String address;
    private String phone;

    public Person() {
    }

    public Person(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        this.name = sc.nextLine();
        System.out.print("Input address: ");
        this.address = sc.nextLine();
        System.out.print("Input phone: ");
        this.phone = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Person{name = " + name + ", address = " + address + ", phone = " + phone + '}';
    }
    public abstract void display();
}
