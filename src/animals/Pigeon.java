package animals;

public class Pigeon extends Bird implements AnimalBehavior, AnimalMove {
    protected String species;

    public Pigeon() {
        super("unknown", 0, 0,"unknown");
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, int age, double weight, String featherColor) {
        super(name, age, weight, featherColor);
        this.species = featherColor;
    }


    @Override
    public String eat() {
        return "pigeon eats seeds";
    }

    @Override
    public String getVoice() {
        return "coo";
    }

    @Override
    public void sleep() {
        System.out.println(getClass().getSimpleName() + " sleeps perched on a ledge");
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " flies");
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                super.toString() +
                ", species='" + species + '\'' +
                '}';
    }


}
