
public class SpecFurniture extends Furniture {

    private String style;

    public SpecFurniture() {
    }

    public SpecFurniture(String name, int price, String style) {
        super(name, price);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return getName() + ", " + style + ", " + getPrice();
    }
    
    public void setData() {
        String result = String.valueOf(getPrice()).charAt(0) + getName();
        setName(result);
    }
    
    public String getValue() {
        if (getPrice() < 10) {
            return getName() + style;
        } else return getName();
    }
}
