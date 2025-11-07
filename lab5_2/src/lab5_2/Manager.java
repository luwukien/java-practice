package lab5_2;

import java.util.Scanner;

public class Manager extends Person implements payable {

    private double salary;
    private double bonus;

    public Manager() {
        super();
    }

    public Manager(String name, String address, String phone, double salary, double bonus) {
        super(name, address, phone);
        if (salary < 0) {
            this.salary = 0; 
        } else {
            this.salary = salary;
        }
        
        if (bonus < 0) {
            this.bonus = 0; 
        } else {
            this.bonus = bonus;
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            this.bonus = 0; 
        } else {
            this.bonus = bonus;
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
        return "Manager{name = " + getName() + ", address = " + getAddress()
                + ", phone = " + getPhone() + ", salary = " + salary + ", bonus = " + bonus + '}';
    }

    @Override
    public void display() {
        System.out.println("I am a manager: " + this.toString());
    }

    @Override
    public double getPaidAmount(double deductionAmount, double extraBonus) {
        return this.salary + this.bonus + extraBonus - deductionAmount;
    }
}
