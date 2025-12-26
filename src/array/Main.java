package array;

public class Main {
    public static void main(String[] args) {
        int[] swap = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int n : swap) {
            System.out.print(n + " ");
        }
        for (int i = 0; i < swap.length - 1; i++) {
            if (swap[i] > swap[i + 1]) {
                int bigger = swap[i];
                swap[i] = swap[i + 1];
                swap[i + 1] = bigger;
            }

        }
        System.out.println();

        for (int n : swap) {
            System.out.print(n + " ");
        }

        }
    }

