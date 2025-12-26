package LargestAndSmallest;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;
        int number;
        number = rand.nextInt(100) + 1;
        int largest = number;
        int smallest = number;
        System.out.println("Random numbers:");
        System.out.println(number);
        count = 1;
        while (count < 10) {
            number = rand.nextInt(100) + 1;
            System.out.println(number);

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }

            count++;
        }


        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        }


    }

