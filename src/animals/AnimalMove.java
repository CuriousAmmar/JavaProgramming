package animals;

public interface AnimalMove {
    default void move() {
        System.out.println(this.getClass().getSimpleName() + " moves");
    }
}

