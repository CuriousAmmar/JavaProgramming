package MinMaxArray;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] minmax = new int[10];
        for (int i = 0; i < minmax.length; i++) {
            minmax[i] = rand.nextInt(100) + 1;
        }
        System.out.print("numbers: ");
        for (int num : minmax) {
            System.out.print(num + " ");
        }
        System.out.println("");
        int min = minmax[0];
        int max = minmax[0];
        for (int i = 1; i < minmax.length; i++) {
            if (minmax[i] < min) {
                min = minmax[i];
            }
            if (minmax[i] > max) {
                max = minmax[i];
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}

