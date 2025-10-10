
/**
 *
 * @author IdeaPad
 */
public class Singer {
    private int singerId;
    private String name;
    private int numberOfSongs;

    public Singer() {
    }

    public Singer(int singerId, String name, int numberOfSongs) {
        this.singerId = singerId;
        this.name = name;
        this.numberOfSongs = numberOfSongs;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }
    
    @Override 
    public String toString() {
        return singerId + ", " + name + ", " + numberOfSongs;
    }
    
}
