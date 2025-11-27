package TenByTen;

public class Main {
    public static void main(String[] args) {
      int matrix[][] = new int[10][10];
      matrix[0][0] = 1;
      matrix[1][1] = 1;
      matrix[2][2] = 2;
      matrix[3][3] = 3;
      matrix[4][4] = 4;
      matrix[5][5] = 5;
      matrix[6][6] = 6;
      matrix[7][7] = 7;
      matrix[8][8] = 8;
      matrix[9][9] = 9;
      for (int row = 1; row < matrix.length; row++) {
          for (int col = 0; col < matrix[row].length; col++) {
              System.out.print(matrix[row][col] + " ");
              if (col == 9) { System.out.print("\n"); }
          }
      }

    }
}
