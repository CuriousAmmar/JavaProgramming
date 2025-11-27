package animals;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[] {
                new Dog("cassidy", 5, 20.0, "black","golden retriever"),
                new Pigeon("lucio", 1, 0.35, "white", "rock dove"),
                new Blowfish("tracer", 2, 0.9, "salt", true)
        };

        System.out.println("animals list :");
        for (Animal a : animals) {
            System.out.println(a);
        }
        System.out.println();

        System.out.println("movement :");
        for (Animal a : animals) {
            if (a instanceof AnimalMove) {
                ((AnimalMove) a).move();
            }
        }
        System.out.println();

        System.out.println("sleep behavior :");
        AnimalBehavior[] behaviors = new AnimalBehavior[] {
                new Dog("buddy", 4, 18.0, "brown","pitbull"),
                new Pigeon("percy", 2, 0.4, "grey", "rock"),
                new Blowfish("spike", 1, 1.2, "salt", true)
        };

        for (AnimalBehavior b : behaviors) {
            b.sleep();
        }
        System.out.println();

        System.out.println("name :");
        for (Animal a : animals) {
            AnimalName.name(a);
        }
    }
}
