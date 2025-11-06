public class Crow {
    private String origin;
    private int weight;

    public Crow() {
    }

    public Crow(String origin, int weight) {
        this.origin = origin;
        this.weight = weight;
    }

    public String getOrigin() {
        return String.valueOf(weight) + origin;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight + 3;
    }
    
    
}
