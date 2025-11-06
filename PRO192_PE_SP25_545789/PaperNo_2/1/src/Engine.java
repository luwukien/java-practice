
/**
 *
 * @author IdeaPad
 */
public class Engine {
    private String designer;
    private int power;

    public Engine() {
    }

    public Engine(String designer, int power) {
        this.designer = designer;
        this.power = power;
    }

    public String getDesigner() {
        String newDesigner = designer.substring(0, 2) + String.valueOf(power) + designer.substring(2, designer.length() - 1); 
        return newDesigner;
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        int n = designer.length();
        this.power = power * n;
    }
    
    
}
