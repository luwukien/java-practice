package lab5_2;

import java.util.Scanner;

public class Employee extends Person implements payable {

    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String address, String phone, double salary) {
        super(name, address, phone);
        if (salary < 0) {
            this.salary = 0; 
        } else {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0; 
        } else {
            this.salary = salary;
        }
    }

    @Override
    public void input() {
        super.input(); 
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input salary: ");
                double s = Double.parseDouble(sc.nextLine());
                if (s >= 0) { 
                    this.setSalary(s); 
                    break;
                } else {
                    System.out.println("Salary must be non-negative. Please input again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please input again.");
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{name = " + getName() + ", address = " + getAddress()
                + ", phone = " + getPhone() + ", salary = " + salary + '}';
    }

    @Override
    public void display() {
        System.out.println("I am an employee: " + this.toString());
    }

    @Override
    public double getPaidAmount(double deductionAmount, double extraBonus) {
        return this.salary + extraBonus - deductionAmount;
    }
}
