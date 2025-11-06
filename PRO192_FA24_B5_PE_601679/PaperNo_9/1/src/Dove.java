public class Dove {
    private String origin;
    private int age;

    public Dove() {
    }

    public Dove(String origin, int age) {
        this.origin = origin;
        this.age = age;
    }

    public String getOrigin() {
        String s = String.valueOf(age) + origin;
        return s;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age / 2;
    }
    
    
}
