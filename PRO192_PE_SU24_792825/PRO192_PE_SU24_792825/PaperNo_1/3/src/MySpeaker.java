
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author IdeaPad
 */
public class MySpeaker implements ISpeaker {

    @Override
    public int f1(List<Speaker> t) {
        int count = 0;
        for (Speaker speaker : t) {
            if (speaker.getPower() > 10) {
                count++;
            }
        }
        return count;
    }
    
    @Override
    public void f2(List<Speaker> t) {
        ArrayList<Speaker> listCanSort = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            listCanSort.add(t.get(i));
        }

        Collections.sort(listCanSort, Comparator.comparing(Speaker::getPower));

        int j = 0;
        for (int i = 0; i <= 4; i++) {
            t.set(i, listCanSort.get(j));
            j++;
        }
    }
    
    @Override
    public void f3(List<Speaker> t) {

        if (t == null || t.isEmpty()) {
            return;
        }
        int min = t.get(0).getPower();
        int countMin = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPower() < min) {
                min = t.get(i).getPower();
            }
        }
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPower() == min) {
                countMin++;
                if (countMin >= 2) {
                    t.remove(i);
                    break;
                }
            }
        }

    }
}
