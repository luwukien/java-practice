
/**
 *
 * @author IdeaPad
 */
public class Tofu {
    private String maker;
    private int quantity;

    public Tofu() {
    }

    public Tofu(String maker, int quantity) {
        this.maker = maker;
        this.quantity = quantity;
    }
    
    public String getMaker() {
        if (maker == null || maker.isEmpty()) {
            return "";
        }
        
        if (maker.length() <= 2) {
            return maker.toLowerCase();
        }
        
        String firstChar = String.valueOf(maker.charAt(0)).toLowerCase();
        String lastChar = String.valueOf(maker.charAt(maker.length() - 1)).toLowerCase();
        String middleString = maker.substring(1, maker.length() - 1);   
        
        return firstChar + middleString + lastChar;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
