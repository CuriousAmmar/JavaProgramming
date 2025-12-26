package QuadraticFormula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        float delta;
        int Case;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Quadratic equation solver!");
        System.out.print("Enter the value of a: ");
        a = sc.nextFloat();
        System.out.print("Enter the value of b: ");
        b = sc.nextFloat();
        System.out.print("Enter the value of c: ");
        c = sc.nextFloat();
        if (a == 0) { System.out.println("there are no real roots."); return; }
        delta = (b * b) - (4 * a * c);
        if (delta > 0) {
            Case = 1;
        }
        else if (delta == 0) {
            Case = 2;
        }
        else  {
            Case = 3;
        }
         switch (Case) {
            case 1:
                float x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
                float x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
                System.out.printf("2 real roots, and they are : x1 = %.2f, x2 = %.2f%n", x1, x2);
                break;

                case 2:
                    x1 = -b / (2 * a);
                    System.out.println("1 real root : x1 = " + x1);
                    break;

                    case 3:
                        System.out.println("There are no real roots");
         }

    }
}
