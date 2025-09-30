
public class SpecCanoe extends Canoe {

    private String color;

    public SpecCanoe() {
    }

    public SpecCanoe(String driver, int rate, String color) {
        super(driver, rate);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getDriver() + "," + color + "," + getRate();
    }

    public void setData() {
        String rateString = Integer.toString(getRate());
        char lastDigit = rateString.charAt(rateString.length() - 1);
        StringBuilder result = new StringBuilder(getDriver());
        setDriver(result.insert(0, Character.toString(lastDigit)).toString());
    }

    // Cách này ngắn gọn hơn 
//    public void setData() {
//        int lastDigit = getRate() % 10;
//        
//        setDriver(lastDigit + getDriver());
//    }
//    public String getValue() {
//
//        StringBuilder result = new StringBuilder(getDriver());
//        for (int i = 0; i < color.length(); i++) {
//            char c = color.charAt(i);
//
//            if (c == 'B' || c == 'Y') {
//                result.insert(0, "FAST");
//
//            } else {
//                result.insert(0, "SLOW");
//            }
//        }
//        return result.toString();
//    }
    //Cách này ngắn gọn hơn
    public String getValue() {
        if (color.startsWith("B") || color.startsWith("Y")) {
            return "FAST" + getDriver();
        } else {
            return "SLOW" + getDriver();
        }
    }
}
