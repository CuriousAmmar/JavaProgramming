package WeightOnMars;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

                // declaring all the variables at the top
                float MarsGravity = 0.38f;
                float EarthWeightElsayed;
                float FloatMarsWeightElsayed;
                double DoubleMarsWeightElsayed;
                int IntMarsWeightElsayed;
                char CharMarsWeightElsayed;
                int IntCalcMarsWeightElsayed;

                Scanner sc=new Scanner(System.in);
                System.out.println("Welcome to WeightOnMars Calculator!");
                System.out.print("Please enter your weight in kgs : ");

                // collecting the data from the user
                EarthWeightElsayed = sc.nextFloat();

                // calculating the user's weight on Mars
                FloatMarsWeightElsayed=EarthWeightElsayed * MarsGravity;
                System.out.println("Step 1 : Your weight on mars (float) is " + FloatMarsWeightElsayed);

                // assigning the result to a double variable with 4 decimals
                DoubleMarsWeightElsayed = FloatMarsWeightElsayed;
                System.out.printf("Step 2 : Your weight on mars (double) is %.4f%n", DoubleMarsWeightElsayed);

                //double to int
                IntMarsWeightElsayed= (int)DoubleMarsWeightElsayed;
                System.out.println("Step 3 : Your weight on mars (int) is " + IntMarsWeightElsayed);

                //int to char
                CharMarsWeightElsayed= (char)IntMarsWeightElsayed;
                System.out.println("Step 4 : Your weight on mars (char) is " + CharMarsWeightElsayed);

                // multiply by 3 for an operation
                IntCalcMarsWeightElsayed = CharMarsWeightElsayed * 3;
                System.out.println("Step 5 : After multipling char by 3, new int  " + IntCalcMarsWeightElsayed);





    }
}
