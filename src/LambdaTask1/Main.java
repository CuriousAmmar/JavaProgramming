package LambdaTask1;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new Random()
                .ints(10, 1, 101)
                .toArray();

        IntStream.of(numbers)
                .forEach(n -> System.out.print(n + " "));

        int max = IntStream.of(numbers).max().getAsInt();
        int min = IntStream.of(numbers).min().getAsInt();

        System.out.println();
        System.out.println("largest number is " + max);
        System.out.println("smallest number is " + min);
    }
}
