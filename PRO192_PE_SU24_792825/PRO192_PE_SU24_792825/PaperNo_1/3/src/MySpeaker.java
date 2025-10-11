import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author IdeaPad
 */
public class MySpeaker implements Speaker {
    public int f1(List<Speaker> t) {
        int count = 0;
        for (Speaker speaker : t) {
            if (speaker.getPower() > 10) {
                count++;
            }
        }
        return count;
    }
    
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
}
