package animals;

public interface AnimalName {
    static void name(Animal a) {
        System.out.println(a.getClass().getSimpleName() + " name is " + a.getName());
    }
}
