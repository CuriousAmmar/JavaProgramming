package BMICalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float weight;
        float height;
        float BMI;
        String Index = null ;
        System.out.println("Welcome to BMICalculator!");
        System.out.printf("Please enter your weight in kilograms: ");
        weight = sc.nextFloat();
        System.out.printf("Please enter your height in centimeters: ");
        height = sc.nextFloat();
        BMI = ( weight / (height * height) ) * 10000;
        if (BMI < 16.0) {
            Index = "Starvation"; }
            else if (BMI >= 16.00 && BMI < 17.00) {
            Index = "emaciation"; }
             else if (BMI >= 17.00 && BMI < 18.50) {
                Index = "underweight"; }
                else if (BMI >= 18.50 && BMI < 23.00) {
                    Index = "normal, low range"; }
                    else if (BMI >= 23.00 && BMI < 25.00) {
                        Index = "normal, high range"; }
                        else if (BMI >= 25.00 && BMI < 27.50) {
                            Index = "overweight, low range"; }
                            else if (BMI >= 27.50 && BMI < 30.00) {
                                Index = "overweight, high range"; }
                                else if (BMI >= 30.00 && BMI < 35.00) {
                                    Index = "1st degree obesity"; }
                                else if (BMI >= 35.00 && BMI < 40.00) {
                                       Index = "2nd degree obesity"; }
                                else if (BMI >= 40.00) {
                                          Index = "3rd degree obesity"; }

        System.out.printf("your BMI is "+ BMI + "kg/m2 ("+Index+")");
        System.out.println();
        System.out.println("- 16.00 – starvation\n" +
                "- 16.00 - 16.99 – emaciation\n" +
                "- 17.00 - 18.49 – underweight\n" +
                "- 18.50 - 22.99 – normal, low range\n" +
                "- 23.00 - 24.99 – normal, high range\n" +
                "- 25.00 - 27.49 – overweight, low range\n" +
                "- 27.50 - 29.99 – overweight, high range\n" +
                "- 30 - 34.9 – 1st degree obesity\n" +
                "- 35 - 39.9 – 2nd degree obesity\n" +
                "- 40 – 3rd degree obesity");
        }
    }
