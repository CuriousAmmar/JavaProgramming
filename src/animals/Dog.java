package animals;

public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    protected String breed;

    public Dog() {
        super("unknown", 0, 0, "unknown");
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
    }

    public Dog(String name, int age) {
        super();
        this.furColor = "unknown";
    }

    @Override
    public String eat() {
        return "dog eats food";
    }

    @Override
    public String getVoice() {
        return "woof";
    }

    @Override
    public void sleep() {
        System.out.println(getClass().getSimpleName() + " sleeps curled up on the floor");
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " runs");
    }

    @Override
    public String toString() {
        return "Dog{" +
                super.toString() +
                ", breed='" + breed + '\'' +
                '}';
    }


}
