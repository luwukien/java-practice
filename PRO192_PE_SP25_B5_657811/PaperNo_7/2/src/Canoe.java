public class Canoe {
    private String driver;
    private int rate;

    public Canoe() {
    }

    public Canoe(String driver, int rate) {
        this.driver = driver;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return driver + ", " + rate;
    }

    public String getDriver() {
        return driver;
    }

    public int getRate() {
        return rate;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    
}
