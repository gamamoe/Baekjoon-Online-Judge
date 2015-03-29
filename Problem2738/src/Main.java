import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    final int MAX = 100;
    int[][] matrixA = new int[MAX][MAX];
    int[][] matrixB = new int[MAX][MAX];
    Scanner scanner = new Scanner(System.in);
    int numOfRow = scanner.nextInt();
    int numOfCol = scanner.nextInt();
    
    for (int i = 0; i < numOfRow; ++i) {
      for (int j = 0; j < numOfCol; ++j) {
        matrixA[i][j] = scanner.nextInt();
      }
    }
    for (int i = 0; i < numOfRow; ++i) {
      for (int j = 0; j < numOfCol; ++j) {
        matrixB[i][j] = scanner.nextInt();
      }
    }
    scanner.close();
    for (int i = 0; i < numOfRow; ++i) {
      for (int j = 0; j < numOfCol; ++j) {
        System.out.print(matrixA[i][j] + matrixB[i][j] + " ");
      }
      System.out.println();
    }
  }
}
