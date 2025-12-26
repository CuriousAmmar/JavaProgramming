package EvenOrNot;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        //creating a Random() object
        Random rand = new Random();
      System.out.println("Welcome to the random number generator!");
      System.out.println("1st Step : Generating a random number");
      //Generating a number and setting the limit to be from 1 to 100
      int number = rand.nextInt(100);
      System.out.println("Random number: " + number);
      // checking if its even or odd
      System.out.println("2nd Step : Checking whether the number is odd or even");
      String EvenOdd = (number % 2 == 0) ? "The number is even" : "The number is odd";
      System.out.println("3rd Step : Display the result");
      System.out.println(EvenOdd);



    }
}
