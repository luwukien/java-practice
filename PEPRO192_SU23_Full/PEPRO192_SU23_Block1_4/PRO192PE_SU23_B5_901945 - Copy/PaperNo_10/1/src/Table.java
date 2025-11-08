
/**
 *
 * @author IdeaPad
 */
public class Table {
    private String name;
    private int leg;

    public Table() {
    }

    public Table(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    public String getName() {
        if (name == null || name.length() < 3) {
            return name;
        }
        
        int length = name.length();
        String lastName = name.substring(length-3);
        String firstChar = lastName.substring(0, 1);
        String secondChar = lastName.substring(1, 2).toLowerCase();
        String thirdChar = lastName.substring(2);
        String s = firstChar + secondChar + thirdChar;
        return s;
    }


    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    
    
}
