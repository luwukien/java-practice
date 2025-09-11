
package lab1practice;

public class Song {
    String title;
    String artist;
    int duratationInSeconds;
    
    public Song() {
    }
    
    public Song(String title, String artist, int duratationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.duratationInSeconds = duratationInSeconds;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuratationInSeconds() {
        return duratationInSeconds;
    }

    public void setDuratationInSeconds(int duratationInSeconds) {
        this.duratationInSeconds = duratationInSeconds;
    }
    
    public String getFormattedDuration() {
        int min = duratationInSeconds / 60;
        int sec = (duratationInSeconds  % 60);
        
        return (min + ":" + sec);
    }
    
    public void display() {
        System.out.println("Name artist: " + artist);
        System.out.println("Name song: " + title);
        System.out.println("Formatted time: " + getFormattedDuration());
    }
}
