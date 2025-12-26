package animals;

public class Blowfish extends Fish implements AnimalBehavior, AnimalMove {
    protected boolean poison;

    public Blowfish() {
        super("unknown", 0, 0, "unknown");
    }

    public Blowfish(String name, int age, double weight, String waterType, boolean poison) {
        super(name, age, weight, waterType);
        this.poison = poison;
    }

    public Blowfish(String name, int age, double weight, String waterType) {
        super(name, age, weight, "unknown");
    }


    @Override
    public String eat() {
        return "blowfish eats small crustaceans";
    }

    @Override
    public String getVoice() {
        return "silent in water";
    }

    @Override
    public void sleep() {
        System.out.println(getClass().getSimpleName() + " sleeps drifting slowly");
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " swims");
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                super.toString() +
                ", poisonous=" + poison +
                '}';
    }


}

