import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner standardInputScanner = new Scanner(System.in);
    int[][] matrix = new int[999][999];
    int numOfInput = standardInputScanner.nextInt();
    int findingCoordinate = standardInputScanner.nextInt();
    standardInputScanner.close();
    
    int rowIndex = numOfInput / 2;
    int colIndex = numOfInput / 2;
    int currentDepth = 1;
    int currentNumber = 1;
    matrix[rowIndex][colIndex] = currentNumber;

    boolean outFlag = false;
    for (;;) {
      
      for (int i = 0; i < currentDepth; ++i) {
        currentNumber++;
        matrix[--rowIndex][colIndex] = currentNumber;
        
        if (currentNumber == numOfInput * numOfInput) {
          outFlag = true;
          break;
        }
      }
      
      if (outFlag) {
        break;
      }
      
      for (int i = 0; i < currentDepth; ++i) {
        currentNumber++;
        matrix[rowIndex][++colIndex] = currentNumber;
      }
      
      currentDepth++;
      
      for (int i = 0; i < currentDepth; ++i) {
        currentNumber++;
        matrix[++rowIndex][colIndex] = currentNumber;
      }
      
      for (int i = 0; i < currentDepth; ++i) {
        currentNumber++;
        matrix[rowIndex][--colIndex] = currentNumber;
      }
      
      currentDepth++;
    }
    
    int indexOfRow = 0;
    int indexOfCol = 0;
    for (int i = 0; i < numOfInput; ++i) {
      for (int j = 0; j < numOfInput; ++j) {
        if (matrix[i][j] == findingCoordinate) {
          indexOfRow = i + 1;
          indexOfCol = j + 1;
        }
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println(indexOfRow + " " + indexOfCol);
  }
}
