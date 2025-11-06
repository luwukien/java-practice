
public class Flight {

    private String code;
    private int duration;

    public Flight() {
    }

    public Flight(String code, int duration) {
        this.code = code;
        this.duration = duration;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return code + ", " + duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
