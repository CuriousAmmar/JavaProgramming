package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float firstNumberElsayed;
        float secondNumberElsayed;
        System.out.println("Welcome to my calculator!");
        System.out.printf("Please enter the first number:");
        firstNumberElsayed = sc.nextFloat();
        System.out.printf("Please enter the second number:");
        secondNumberElsayed = sc.nextFloat();
        float sum = firstNumberElsayed + secondNumberElsayed;
        System.out.printf("The sum is: %.2f%n", sum);
        float difference = firstNumberElsayed - secondNumberElsayed;
        if (difference < 0) { difference = difference * -1;}
        System.out.printf("The difference is: %.2f%n", difference);
        float multiplication = firstNumberElsayed*secondNumberElsayed;
        System.out.printf("The product is: %.2f%n", multiplication);
        float division = firstNumberElsayed/secondNumberElsayed;
        System.out.printf("The quotient is: %.2f%n", division);


    }
}
