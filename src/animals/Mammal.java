package animals;

public class Mammal extends Animal {
    protected String furColor;

    public Mammal() {
        this("unknown", 0, 0.0, "unknown");
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
        this.furColor = "unknown";
    }

    @Override
    public String eat() {
        return "mammal eats";
    }

    @Override
    public String getVoice() {
        return "mammal sound";
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "furColor='" + furColor + '\'' +
                ", " + super.toString() +
                '}';
    }

}


