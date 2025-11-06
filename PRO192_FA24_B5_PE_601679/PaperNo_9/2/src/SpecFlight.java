
public class SpecFlight extends Flight {

    private String schedule;

    public SpecFlight() {

    }

    public SpecFlight(String code, int duration, String schedule) {
        super(code, duration);
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    @Override
    public String toString() {
        return super.getCode() + ", " + schedule + ", " + super.getDuration();
    }
    
    public void setData() {
        String durationString = String.valueOf(super.getDuration());
        char lastDigit  = durationString.charAt(durationString.length() - 1);
        
        setCode(lastDigit + getCode());
    }
    
    public String getValue() {
        if (schedule.equals("HCM") || schedule.equals("HN")) {
            return getCode() + "OK";
        } 
        return getCode() + "DELAY";
    }
}
