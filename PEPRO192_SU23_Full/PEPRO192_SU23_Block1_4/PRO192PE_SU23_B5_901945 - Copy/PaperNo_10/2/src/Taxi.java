
/**
 *
 * @author IdeaPad
 */
public class Taxi {
    private String driver;
    private int age;

    public Taxi() {
    }

    public Taxi(String driver, int age) {
        this.driver = driver;
        this.age = age;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return driver + ", " + age;
    }
    
    
}
