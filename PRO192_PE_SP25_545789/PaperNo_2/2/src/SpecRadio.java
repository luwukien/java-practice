
/**
 *
 * @author IdeaPad
 */
public class SpecRadio extends Radio {

    private String chanel;

    public SpecRadio() {
    }

    public SpecRadio(String content, int rate, String chanel) {
        super(content, rate);
        this.chanel = chanel;
    }

    public String getChanel() {
        return chanel;
    }

    @Override
    public String toString() {
        return getContent() + ", " + chanel + ", " + getRate();
    }

    public void setData() {
        String content = getContent();
        for (int i = 0; i < content.length(); i++) {
            if (Character.isDigit(content.charAt(i))) {
                setContent(content.substring(0, i) + content.substring(i+1));
                return;
            }
        }
    }

    public String getValue() {
        int lengthContent = getContent().length();
        String content = getContent();
        if (super.getRate() % 2 != 0) {
            String result = "";
            for (int i = 0; i < lengthContent; i++) {
                if ((i+1) % 2 == 0) {
                    result += content.charAt(i);
                }
            }
            return result;
        } else {
            return getContent();
        }
    }
}
