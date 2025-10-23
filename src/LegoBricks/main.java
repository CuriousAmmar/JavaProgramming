package LegoBricks;

import java.util.Random;

public class main {
    public static void main(String[] args) {

        System.out.println();
        //generating a random odd number between 50-100
        System.out.println("1st Step : generating a random odd amount of bricks and setting the minimum to 50 and maximum to 100");
        Random rand = new Random();
        int bmin = 50;
        int bmax = 100;
        int AmountOfBricks = rand.nextInt(bmax - bmin + 1) + bmin;
        System.out.println("2nd Step : making sure the number is odd, then displaying it");
        AmountOfBricks = (AmountOfBricks % 2 != 0) ? AmountOfBricks : AmountOfBricks +1;
        System.out.println("The amount of bricks is: " + AmountOfBricks);
        System.out.println();

        //generating a random even number between 5-10
        System.out.println("3rd Step : generating a random even amount of containers and setting the minimum to 5 and maximum to 10");
        int cmin = 5;
        int cmax = 10;
        int Container = rand.nextInt(cmax - cmin + 1) + cmin;
        System.out.println("4th Step : making sure the number is even, then displaying it");
        Container = (Container % 2 == 0) ? Container : Container +1;
        System.out.println("The amount of bricks that fit in one container is: " + Container);
        System.out.println();

        System.out.println("5th Step : Calculating the amount of full containers and displaying it");
        int fullContainers = (AmountOfBricks / Container);
        System.out.println("The amount of full containers is: " + fullContainers);
        System.out.println();

        System.out.println("6th Step : Calculating the total amount of containers and displaying it");
        int totalContainers = (fullContainers +1);
        System.out.println("The total amount containers is: " + totalContainers);
        System.out.println();

        System.out.println("7th step : calculating the amount of bricks in the non full container");
        int nonfullContainer = (AmountOfBricks % Container);
        System.out.println("The non full container contains " + nonfullContainer + " bricks");
    }
}
