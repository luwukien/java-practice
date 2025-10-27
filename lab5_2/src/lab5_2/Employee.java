package lab5_2;


import java.util.Scanner;

/**
 * Employee class, extends Person and implements payable.
 */
public class Employee extends Person implements Payable {
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String address, String phone, double salary) {
        super(name, address, phone);
        this.setSalary(salary); // Use setter for validation [cite: 241]
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0; // [cite: 241]
        } else {
            this.salary = salary;
        }
    }

    @Override
    public void input() {
        super.input(); // [cite: 244]
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input salary: ");
                double s = Double.parseDouble(sc.nextLine());
                if (s >= 0) { // [cite: 245]
                    this.setSalary(s); // Use setter
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
        // [cite: 242]
        return "Employee{name = " + getName() + ", address = " + getAddress() + 
               ", phone = " + getPhone() + ", salary = " + salary + '}';
    }

    @Override
    public void display() {
        // [cite: 246]
        System.out.println("I am an employee: " + this.toString());
    }

    @Override
    public double getPaidAmount(double deductionAmount, double extraBonus) {
        // [cite: 247]
        return this.salary + extraBonus - deductionAmount;
    }
}