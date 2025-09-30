
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

public class MyRadio implements IRadio {

    @Override
    public int f1(List<Radio> t) {
        int maxRate = -1;
        for (Radio radio : t) {
            if (radio.getContent().matches(".*\\d.*")) {
                if (radio.getRate() > maxRate) {
                    maxRate = radio.getRate();
                }
            }
        }
        return maxRate;
    }

    @Override
    public void f2(List<Radio> t) {
        List<Radio> listCanSort = new ArrayList<>(); //cần xem lai chỗ này

        for (Radio radio : t) {
            if (!Character.isDigit(radio.getContent().charAt(0))) {
                listCanSort.add(radio);
            }
        }

        Collections.sort(listCanSort, (r1, r2) -> Integer.compare(r1.getRate(), r2.getRate()));
        int j = 0;
        for (int i = 0; i < t.size(); i++) {
            if (!Character.isDigit(t.get(i).getContent().charAt(0))) {
                t.set(i, listCanSort.get(j));
                j++;
            }
        }
    }

    @Override
    public void f3(List<Radio> t) {
        int minRate = Integer.MAX_VALUE;
        for (Radio radio : t) {
            if (radio.getRate() < minRate) {
                minRate = radio.getRate();

            }
        }
        
        Iterator<Radio> iterator = t.iterator();
        while (iterator.hasNext()) {
            Radio radio = iterator.next();
            if (!Character.isDigit(radio.getContent().charAt(0)) && radio.getRate() == minRate) {
                iterator.remove();
            }
        }
    }
}
