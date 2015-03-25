import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfProblems = scanner.nextInt();

    int finalResult = 0;
    int previousScore = 0;
    boolean isReseted = true;
    for (int i = 0; i < numOfProblems; ++i) {
      int roundResult = scanner.nextInt();

      if (roundResult == 0) {
        isReseted = true;
        continue;
      }

      if (isReseted && roundResult == 1) {
        finalResult++;
        previousScore = 1;
        isReseted = false;
      } else if (!isReseted && roundResult == 1) {
        finalResult += previousScore + 1;
        previousScore++;
      }
    }
    scanner.close();

    System.out.println(finalResult);
  }
}
