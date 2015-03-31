import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfTestCases = scanner.nextInt();
    
    for (int t = 0; t < numOfTestCases; ++t) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int numOfProperSets = 0;
      
      for (int a = 1; a <= n - 2; ++a) {
        for (int b = a + 1; b <= n - 1; ++b) {
          if ((a * a + b * b + m) % (a * b) == 0) {
            numOfProperSets++;
          }
        }
      }
      
      System.out.println(numOfProperSets);
    }
    scanner.close();
  }
}
