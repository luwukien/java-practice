public class Wax {
    private String color;
    private int melting;

    public Wax() {
    }

    public Wax(String color, int melting) {
        this.color = color;
        this.melting = melting;
    }

    public String getColor() {
        StringBuilder s = new StringBuilder(color);
        String meltingString = Integer.toString(melting);
        return s.replace(0, 1, meltingString).toString();
    }

    public int getMelting() {
        return melting;
    }

    public void setMelting(int melting) {
        int newMelting = melting * 3;
        this.melting = newMelting;
    }
    
    
}
