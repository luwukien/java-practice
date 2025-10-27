public class Water {
    private String source;
    private int volume;

    public Water() {
    }

    public Water(String source, int volume) {
        this.source = source;
        this.volume = volume;
    }

    public String getSource() {
        return String.valueOf(volume) + source.charAt(0) + source.charAt(source.length() - 1);
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume / String.valueOf(volume).length();
    }
    
    
}
