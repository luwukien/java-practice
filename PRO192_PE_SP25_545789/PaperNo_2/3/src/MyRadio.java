
/**
 *
 * @author IdeaPad
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MyRadio implements IRadio {

    private boolean containsDigit(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int f1(List<Radio> t) {
        int maxRate = t.get(0).getRate();
        for (int i = 0; i < t.size(); i++) {
            if (containsDigit(t.get(i).getContent())) {
                if (t.get(i).getRate() > maxRate) {
                    maxRate = t.get(i).getRate();
                }
            }
        }
        return maxRate;
    }

    @Override
    public void f2(List<Radio> t) {
        List<Radio> toSort = new ArrayList<>();
        for (Radio radio : t) {
            if (!Character.isDigit(radio.getContent().charAt(0))) {
                toSort.add(radio);
            }
        }

        Collections.sort(toSort, Comparator.comparing(Radio::getRate));
        int index = 0;
        for (int i = 0; i < t.size(); i++) {
            if (!Character.isDigit(t.get(i).getContent().charAt(0))) {
                t.set(i, toSort.get(index++));
            }
        }

    }

    @Override
    public void f3(List<Radio> t) {
        int minRate = t.get(0).getRate();
        for (Radio radio : t) {
            if (radio.getRate() < minRate) {
                minRate = radio.getRate();
            }
        }
        final int min = minRate;

        t.removeIf(radio -> !Character.isDigit(radio.getContent().charAt(0)) && radio.getRate() == min);
    }
}
