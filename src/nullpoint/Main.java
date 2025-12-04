package nullpoint;

public class Main {
    public static void main(String[] args) {

        exceptionmethod a = new exceptionmethod();

        try {
            a.exmethod();
        } catch (NullPointerException b) {
            System.out.println("a NullPointerException happened");
            System.out.println("Exception toString(): " + b.toString());
        }
    }

}
