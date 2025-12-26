package animals;

public class Fish extends Animal {
    protected String waterType;

    public Fish() {
        this("unknown", 0, 0.0, "fresh");
    }

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String eat() {
        return "fish eats";
    }

    @Override
    public String getVoice() {
        return "blub";
    }

    @Override
    public String toString() {
        return "Fish{" +
                "waterType='" + waterType + '\'' +
                ", " + super.toString() +
                '}';
    }

}
