
/**
 *
 * @author IdeaPad
 */
public class Employee {
    private double salary;
    private int experience;

    public Employee() {
    }

    public Employee(double salary, int experience) {
        this.salary = salary;
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    public double calculateBonus() {
        return salary * (this.experience * 0.05);
    }
    
    
}
