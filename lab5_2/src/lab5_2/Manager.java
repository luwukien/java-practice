package lab5_2;

package workshop5_q2;

import java.util.Scanner;

/**
 * Manager class, extends Person and implements payable.
 */
public class Manager extends Person implements payable {
    private double salary;
    private double bonus;

    public Manager() {
        super();
    }

    public Manager(String name, String address, String phone, double salary, double bonus) {
        super(name, address, phone);
        this.setSalary(salary); // Use setters for validation [cite: 250]
        this.setBonus(bonus);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0; // [cite: 250]
        } else {
            this.salary = salary;
        }
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            this.bonus = 0; // [cite: 250]
        } else {
            this.bonus = bonus;
        }
    }

    @Override
    public void input() {
        super.input(); // [cite: 253]
        Scanner sc = new Scanner(System.in);
        
        // Input salary with validation [cite: 254]
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
        
        // Input bonus with validation [cite: 254]
        while (true) {
            try {
                System.out.print("Input bonus: ");
                double b = Double.parseDouble(sc.nextLine());
                if (b >= 0) {
                    this.setBonus(b);
                    break;
                } else {
                    System.out.println("Bonus must be non-negative. Please input again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please input again.");
            }
        }
    }

    @Override
    public String toString() {
        // [cite: 251]
        return "Manager{name = " + getName() + ", address = " + getAddress() + 
               ", phone = " + getPhone() + ", salary = " + salary + ", bonus = " + bonus + '}';
    }

    @Override
    public void display() {
        // [cite: 255] [Corrected based on example output, not PDF typo]
        System.out.println("I am a manager: " + this.toString());
    }

    @Override
    public double getPaidAmount(double deductionAmount, double extraBonus) {
        // [cite: 255]
        return this.salary + this.bonus + extraBonus - deductionAmount;
    }
}
