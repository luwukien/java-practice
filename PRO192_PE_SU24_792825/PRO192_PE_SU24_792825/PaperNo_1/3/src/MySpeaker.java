import java.util.List;
import java.util.Comparator;

/**
 *
 * @author IdeaPad
 */
public class MySpeaker implements ISpeaker {
    
    @Override
    public int f1(List<Speaker> t) {
        
        if (t == null || t.isEmpty()) {
            return 0;
        }
        
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
        
        if (t == null || t.isEmpty() || t.size() < 5) {
            return;
        }
        //Dùng subList để lấy 5 phần tử đầu tiên thay vì duyệt mảng từ 0 - 5: tránh NullPointerException
        t.subList(0, 5).sort(Comparator.comparing(Speaker::getPower));
        
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
                if (countMin == 2) {
                    t.remove(i);
                    break;
                }
            }
        }
        
    }
}
