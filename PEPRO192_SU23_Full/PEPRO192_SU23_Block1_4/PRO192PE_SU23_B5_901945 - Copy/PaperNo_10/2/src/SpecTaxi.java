
/**
 *
 * @author IdeaPad
 */
public class SpecTaxi extends Taxi {

    private int salary;

    public SpecTaxi() {
    }

    public SpecTaxi(String driver, int age, int salary) {
        super(driver, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.getDriver() + ", " + super.getAge() + ", " + salary;
    }
    
    public void setData() {
        String ageString = String.valueOf(super.getAge());
        StringBuilder result = new StringBuilder(super.getDriver());
        result.replace(1, 2, ageString);
        setDriver(result.toString());
    }
    
    public int getValue() {
        int unitDigit = super.getAge() % 10;
        if (unitDigit % 2 == 0) {
            return salary;
        } else {
           return salary + super.getAge();
        }
    }
}
