
/**
 *
 * @author IdeaPad
 */
public class SpecWine extends Wine{
    private String taste;

    public SpecWine() {
    }
    
    public SpecWine(String brand, int year, String taste) {
        super(brand, year);
        this.taste = taste;
    }
    
    public String getTatse() {
        return taste;
    }
    
    public void setData() {
        setBrand(new StringBuffer(getBrand().toLowerCase()).reverse().toString());
    }
    
    public String getValue() {
        int n = taste.length();
        int m = super.getYear(); 
        if (m < n) {
           String firstPart = taste.substring(0, m);
           String secPart = taste.substring(m, taste.length());
           return firstPart.toUpperCase() + secPart;
        } else return this.taste = taste.toLowerCase();
    }
    
    @Override
    public String toString() {
        return super.getBrand() + ", " + super.getYear() + ", " + taste;
    }
}
