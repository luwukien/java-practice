import java.util.ArrayList;
/**
 *
 * @author IdeaPad
 */

public class SingerList extends ArrayList<Singer> {
    
    public Singer getSingerById(int id) {
        for (int i = 0; i < this.size(); i++) {
            Singer currentSinger = this.get(i);
            if (currentSinger.getSingerId() == id) {
                return currentSinger;
            } 
        }
        return null;
    }
    
    public int countSingersByNumberOfSongs(int value) {
        int count = 0;
        for (int i = 0; i < this.size(); i++) {
            Singer currentSinger = this.get(i);
            if (currentSinger.getNumberOfSongs() >= value) {
                count++;
            }
        }
        return count;
    }
}
