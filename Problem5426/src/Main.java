import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner stdInputScanner = new Scanner(System.in);
    int numOfTestCases = stdInputScanner.nextInt();

    for (int i = 0; i < numOfTestCases; ++i) {
      String encodedLetter = stdInputScanner.next();
      int lengthOfLetter = encodedLetter.length();
      int matrixDimension = (int) Math.sqrt(lengthOfLetter);

      for (int y = matrixDimension - 1; y >= 0; --y) {
        for (int x = y; x < lengthOfLetter; x += matrixDimension) {
          System.out.print(encodedLetter.charAt(x));
        }
      }
      System.out.println();
    }

    stdInputScanner.close();
  }
}
