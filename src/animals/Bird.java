package animals;

public class Bird extends Animal {
    protected String featherColor;

    public Bird() {
        this("unknown", 0, 0.0, "unknown");
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, double weight) {
        super(name, age, weight);
        this.featherColor = "unknown";
    }

    @Override
    public String eat() {
        return "bird eats";
    }

    @Override
    public String getVoice() {
        return "chirp";
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                ", " + super.toString() +
                '}';
    }

}

